package app.withinterface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class InterfaceBeanInitializationDestructionPojo implements InitializingBean, DisposableBean{

	private String text;
	
	public String getText(){
		return this.text;
	}
	
	public void setText(String text){
		this.text = text;
	}
	
	public void destroy() throws Exception {
		System.out.println("During bean destruction, wired by the DisposableBean interface...");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("During bean initialization, wired by the InitializingBean interface...");
	}

}
