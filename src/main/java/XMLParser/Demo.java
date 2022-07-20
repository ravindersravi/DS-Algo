package XMLParser;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
public class Demo {
    public static void main(String args[]) {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            DefaultHandler handler = new DefaultHandler() {
                boolean id = false;
                boolean username = false;
                boolean EnrolledCourse = false;
                boolean mode = false;
                boolean duration = false;

                public void startElement(String uri, String localName, String qName, Attributes attributes)throws SAXException {
                    if (qName.equalsIgnoreCase("Id")) {  id = true; }
                    if (qName.equalsIgnoreCase("username")) { username = true; }
                    if (qName.equalsIgnoreCase("EnrolledCourse")) { EnrolledCourse = true; }
                    if (qName.equalsIgnoreCase("mode")) {  mode = true; }
                    if (qName.equalsIgnoreCase("duration")) { duration = true; }
                }
                public void characters(char ch[], int start, int length)throws SAXException {
                    if (id) {
                        System.out.println("ID : " + new String(ch, start,length));
                        id = false;
                    }
                    if (username) {
                        System.out.println( "User Name: " + new String(ch, start, length));
                        username = false;
                    }
                    if (EnrolledCourse) {
                        System.out.println("Enrolled Course: "+ new String(ch, start,length));
                        EnrolledCourse = false;
                    }
                    if (mode) {
                        System.out.println("mode: "+ new String(ch, start,length));
                        mode = false;
                    }
                    if (duration) {
                        System.out.println("duration : "+ new String(ch, start, length));
                        duration = false;
                    }
                }
            };
            saxParser.parse("C:\\Users\\Ravinder_Sabbani\\Documents\\CompletableFeatureExample\\src\\main\\java\\XMLParser\\gfg.xml", handler);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

