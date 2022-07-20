package XMLParser;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
public class GfgSaxXmlParser {
    public static void main(String args[])
    {
        try {
			/*SAXParserFactory is a factory API that
			enables applications to configure and obtain a
			SAX based parser to parse XML documents. */
            SAXParserFactory factory
                    = SAXParserFactory.newInstance();

            // Creating a new instance of a SAXParser using
            // the currently configured factory parameters.
            SAXParser saxParser = factory.newSAXParser();

            // DefaultHandler is Default base class for SAX2
            // event handlers.
            DefaultHandler handler = new DefaultHandler() {
                boolean id = false;
                boolean username = false;
                boolean EnrolledCourse = false;
                boolean mode = false;
                boolean duration = false;

                // Receive notification of the start of an
                // element. parser starts parsing a element
                // inside the document
                public void startElement(
                        String uri, String localName,
                        String qName, Attributes attributes)
                        throws SAXException
                {

                    if (qName.equalsIgnoreCase("Id")) {
                        id = true;
                    }
                    if (qName.equalsIgnoreCase(
                            "username")) {
                        username = true;
                    }
                    if (qName.equalsIgnoreCase(
                            "EnrolledCourse")) {
                        EnrolledCourse = true;
                    }
                    if (qName.equalsIgnoreCase("mode")) {
                        mode = true;
                    }
                    if (qName.equalsIgnoreCase(
                            "duration")) {
                        duration = true;
                    }
                }

                // Receive notification of character data
                // inside an element, reads the text value of
                // the currently parsed element
                public void characters(char ch[], int start,
                                       int length)
                        throws SAXException
                {
                    if (id) {
                        System.out.println(
                                "ID : "
                                        + new String(ch, start,
                                        length));
                        id = false;
                    }
                    if (username) {
                        System.out.println(
                                "User Name: "
                                        + new String(ch, start,
                                        length));
                        username = false;
                    }
                    if (EnrolledCourse) {
                        System.out.println(
                                "Enrolled Course: "
                                        + new String(ch, start,
                                        length));
                        EnrolledCourse = false;
                    }
                    if (mode) {
                        System.out.println(
                                "mode: "
                                        + new String(ch, start,
                                        length));
                        mode = false;
                    }
                    if (duration) {
                        System.out.println(
                                "duration : "
                                        + new String(ch, start,
                                        length));
                        duration = false;
                    }
                }
            };

			/*Parse the content described by the giving
			Uniform Resource
			Identifier (URI) as XML using the specified
			DefaultHandler. */
            saxParser.parse(
                    "C:\\Users\\Ravinder_Sabbani\\Documents\\CompletableFeatureExample\\src\\main\\java\\XMLParser\\gfg.xml",
                    handler);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}

