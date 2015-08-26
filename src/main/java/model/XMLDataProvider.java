package model;


import org.testng.annotations.DataProvider;




public class XMLDataProvider {

    @DataProvider
    public static Object[][] dataProvider(){
        return new Object[][]{
                             {"Sabre Corporation", "Sabre Corporation"},
                             {"Sabre Corporatopn", "Sabre Corporation"}
                             };
    }

/*    private static String getTestCaseNameFromCaller(Method caller) {
        return caller.getDeclaringClass().getName().replaceAll("\\.", "/")
                + ".xml";
    }*/

}
