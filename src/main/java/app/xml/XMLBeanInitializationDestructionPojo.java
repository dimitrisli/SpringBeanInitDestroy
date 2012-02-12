package app.xml;

public class XMLBeanInitializationDestructionPojo {

	private String text;
	
	public String getText() {
		return text;
	}
	
	public void setText(String text){
		this.text = text;
	}
	
	public void myInitBeanMethod(){
		System.out.println("During init of the bean, wired by XML...");
	}
	
	public void myDestroyBeanMethod(){
		System.out.println("During destruction of the bean, wired by XML... ");
	}
}
