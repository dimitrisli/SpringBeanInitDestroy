package app;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import app.annotation.AnnotationsBeanInitializationDestructionPojo;
import app.withinterface.InterfaceBeanInitializationDestructionPojo;
import app.xml.XMLBeanInitializationDestructionPojo;

public class Main {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("application-config.xml");
		
		AnnotationsBeanInitializationDestructionPojo viaAnnotations = (AnnotationsBeanInitializationDestructionPojo) context.getBean("annotationsBeanInitializationDestructionPojo");
		InterfaceBeanInitializationDestructionPojo viaInterface = (InterfaceBeanInitializationDestructionPojo) context.getBean("interfaceBeanInitializationDestructionPojo");
		XMLBeanInitializationDestructionPojo viaXML = (XMLBeanInitializationDestructionPojo) context.getBean("xmlBeanInitializationDestructionPojo");
	
		System.out.println(viaAnnotations.getText());
		System.out.println(viaInterface.getText());
		System.out.println(viaXML.getText());
		
		context.close();
	}
}
