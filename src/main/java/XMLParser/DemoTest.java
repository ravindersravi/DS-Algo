//package XMLParser;
//
//import org.w3c.dom.Document;
//
//import javax.xml.parsers.DocumentBuilder;
//import javax.xml.parsers.DocumentBuilderFactory;
//import javax.xml.xpath.XPath;
//import javax.xml.xpath.XPathConstants;
//import javax.xml.xpath.XPathExpression;
//import javax.xml.xpath.XPathFactory;
//import java.io.ByteArrayInputStream;
//import java.io.InputStream;
//
//public class DemoTest {
//    public static void main(String[] args) {
//        InputStream response = new ByteArrayInputStream("<Response> <aa> "
//                + "<Fromhere> <a1>Content</a1> <a2>Content</a2> </Fromhere> "
//                + "</aa> </Response>".getBytes()); /* Or whatever. */
//
//        DocumentBuilder builder = DocumentBuilderFactory
//                .newInstance().newDocumentBuilder();
//        Document doc = builder.parse(response);
//
//        XPath xpath = XPathFactory.newInstance().newXPath();
//        XPathExpression expr = xpath.compile("string(/Response/aa/FromHere)");
//        String result = (String)expr.evaluate(doc, XPathConstants.STRING);
//
//    }
//}
