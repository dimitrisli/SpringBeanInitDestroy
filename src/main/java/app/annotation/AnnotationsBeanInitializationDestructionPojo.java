package app.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class AnnotationsBeanInitializationDestructionPojo {

	private String text;
	
	public void setText(String text){
		this.text=text;
	}
	public String getText(){
		return this.text;
	}
	
	@PostConstruct
	public void myInitMethod(){
		System.out.println("During bean initialization, wired by the Annotations...");
	}

	@PreDestroy
	public void myDestroyMethod(){
		System.out.println("During bean destruction, wired by the Annotations...");
	}
}
