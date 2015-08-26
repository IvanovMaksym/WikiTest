package model;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import org.w3c.dom.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.ArrayList;
import java.util.List;


public class XMLParser {

    public static void main(String argv[]) throws Exception {
        //Get the DOM Builder Factory
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        //Get the DOM Builder
        DocumentBuilder builder = factory.newDocumentBuilder();

        //Load and Parse the XML document
        //document contains the complete XML as a Tree.
        Document document = builder.parse(ClassLoader.getSystemResourceAsStream("/TestData.xml"));

        //List<Test> testList = new ArrayList<Test>();

        NodeList testList = document.getElementsByTagName("test");

        for (int temp = 0; temp < testList.getLength(); temp++) {

            Node nNode = testList.item(temp);

            System.out.println("\nCurrent Element :" + nNode.getNodeName());
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                Element testElement = (Element) nNode;
                NodeList paramNodes = testElement.getChildNodes();

                for (int i=0; i<paramNodes.getLength(); i++){
                    Node paramNode = paramNodes.item(0);
                    Element paramElement = (Element) paramNode;
                    System.out.println(paramElement.getAttribute("name"));
                }
            }
        }
    }
}