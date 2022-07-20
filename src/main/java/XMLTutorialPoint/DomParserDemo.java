package XMLTutorialPoint;

import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class DomParserDemo {

    public static void main(String[] args) {

        String s = "<?xml version = \"1.0\"?>\n" +
                "<class>\n" +
                "    <student rollno = \"393\">\n" +
                "        <firstname>dinkar</firstname>\n" +
                "        <lastname>kad</lastname>\n" +
                "        <nickname>dinkar</nickname>\n" +
                "        <marks>85</marks>\n" +
                "    </student>\n" +
                "\n" +
                "    <student rollno = \"493\">\n" +
                "        <firstname>Vaneet</firstname>\n" +
                "        <lastname>Gupta</lastname>\n" +
                "        <nickname>vinni</nickname>\n" +
                "        <marks>95</marks>\n" +
                "    </student>\n" +
                "\n" +
                "</class>";
        try {
            File inputFile = new File("C:\\Users\\Ravinder_Sabbani\\Documents\\CompletableFeatureExample\\src\\main\\java\\XMLTutorialPoint\\Demo.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(s);
            doc.getDocumentElement().normalize();
            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("student");
            System.out.println("----------------------------");

            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                System.out.println("\nCurrent Element :" + nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    System.out.println("Student roll no : "
                            + eElement.getAttribute("rollno"));
                    System.out.println("First Name : "
                            + eElement
                            .getElementsByTagName("firstname")
                            .item(0)
                            .getTextContent());
                    System.out.println("Last Name : "
                            + eElement
                            .getElementsByTagName("lastname")
                            .item(0)
                            .getTextContent());
                    System.out.println("Nick Name : "
                            + eElement
                            .getElementsByTagName("nickname")
                            .item(0)
                            .getTextContent());
                    System.out.println("Marks : "
                            + eElement
                            .getElementsByTagName("marks")
                            .item(0)
                            .getTextContent());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
