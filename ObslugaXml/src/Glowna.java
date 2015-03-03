import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;




import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;


public class Glowna {
	public Glowna(){
		String xml="";
		try {
			xml = this.konewrtujNaXlm();
			System.out.println(xml);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.konwertujStrinToXMl(xml);
	}
	
	 
	public static void main(String arg[]){
		new Glowna();
	}

	public String konewrtujNaXlm() throws JAXBException{
		StringWriter str = new StringWriter();
		JAXBContext jaxbContext = JAXBContext.newInstance(PrzesylanyObiekt.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
		jaxbMarshaller.marshal(new PrzesylanyObiekt(), System.out);
		System.out.println("konwersja");
		jaxbMarshaller.marshal(new PrzesylanyObiekt(), str);
		
		return str.getBuffer().toString();
	}
	
	public void konwertujStrinToXMl(String str){
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();  
		 DocumentBuilder builder;  
		 try {
			builder = factory.newDocumentBuilder();
			 Document document = builder.parse( new InputSource( new StringReader( str ) ));
			 System.out.println("aaa"+document.getChildNodes().item(0).getNodeName());
			 System.out.println("aaa"+document.getChildNodes().item(0).getChildNodes().item(0).getNodeName());
			 System.out.println("aaa"+document.getChildNodes().item(0).getChildNodes().item(0).getTextContent());
			 System.out.println("aaa"+document.getDocumentElement().getElementsByTagName("dane1"));
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
