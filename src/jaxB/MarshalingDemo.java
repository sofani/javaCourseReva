package jaxB;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class MarshalingDemo {

	public static void main(String[] args) {
		Person p = new Person();
		p.setEmail("sb@yahoo.com");
		p.setFirstName("sofa");
		p.setLastName("mes");
		p.setSsn("607");
       try {
		JAXBContext jaxb = JAXBContext.newInstance(Person.class);
		Marshaller m = jaxb.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		m.marshal(p, System.out);
	} catch (JAXBException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       
	}

}
