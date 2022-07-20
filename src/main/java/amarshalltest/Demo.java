package amarshalltest;

import java.io.File;
import java.util.*;
import javax.xml.bind.*;
import org.eclipse.persistence.jaxb.JAXBContextFactory;

public class Demo {
    public static void main(String[] args) throws Exception {
        Map<String, Object> properties = new HashMap<String, Object>(1);
        properties.put(JAXBContextFactory.ECLIPSELINK_OXM_XML_KEY, "src/main/java/amarshalltest/binding.xml");
        JAXBContext jc = JAXBContext.newInstance("blog.bindingfile", Customer.class.getClassLoader() , properties);

        Unmarshaller unmarshaller = jc.createUnmarshaller();
        Customer customer = (Customer) unmarshaller.unmarshal(new File("src/main/java/amarshalltest/input.xml"));

        Marshaller marshaller = jc.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(customer, System.out);
    }

}
