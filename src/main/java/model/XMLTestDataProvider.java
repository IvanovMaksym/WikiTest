package model;

import model.Test;
import model.XMLTestCase;
import org.testng.annotations.DataProvider;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

public class XMLTestDataProvider {

    private static String getTestCaseNameFromCaller(Method caller) {
        return caller.getDeclaringClass().getName().replaceAll("\\.", "/")
                + ".xml";

    }

    private static XMLTestCase getTestCaseFromCaller(Method caller) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(XMLTestCase.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            return (XMLTestCase) unmarshaller.unmarshal(caller.getDeclaringClass()
                    .getClassLoader()
                    .getResourceAsStream(getTestCaseNameFromCaller(caller)));
        } catch (JAXBException jaxEx) {
            jaxEx.printStackTrace();
            return null;
        } catch (RuntimeException ex) {
            ex.printStackTrace();
            throw new RuntimeException("Exception reading resource XML for test case: " + getTestCaseNameFromCaller(caller), ex);
        }
    }

    private static boolean hasTestNames(XMLTestCase tests) {
        for (Test test : tests.getTests().getTest()) {
            if (test.getName() != null) {
                return true;
            }
        }

        return false;
    }

    @DataProvider(name = "XMLTestData")
    public static Iterator<Object[]> createData(Method caller) {
        XMLTestCase tests = getTestCaseFromCaller(caller);
        boolean hasNames = hasTestNames(tests);
        ArrayList<Object[]> configs = new ArrayList<Object[]>();

        for (Test test : tests.getTests().getTest()) {
            if (test.getName() != null
                    && !test.getName().equals(caller.getName())) {
                continue;
            }

            if (hasNames && test.getName() == null) {
                continue;
            }

            configs.add(new Object[]{new XMLTestConfig(test, tests.getTitle())});
        }

        return configs.iterator();
    }
}
