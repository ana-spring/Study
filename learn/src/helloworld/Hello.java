package helloworld;

public class Hello {
    
	public String strHello = "Hello";
	protected String strHola = "Hola";
	private String strPrivet = "Привет";
	
	public final String strHi = "Hi!"; // нельзя изменить, используется только в этом классе
	
	
	public String get() {
		return strPrivet;
	}
	public void set(String strPrivet) {
		this.strPrivet = strPrivet;
		
		
		
		
	}
	
    
}
