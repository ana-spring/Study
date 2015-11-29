import helloworld.Hello;
import helloworld.World;

public class helloworld {
	
    public static void main(String[] args) {
    	
		Hello hello =  new Hello();
		World world = new World();
		
		
		System.out.println(hello.strHello + " " + world.strWorld);
		
		System.out.println(World.strWWW); // статическа€ переменна€ 
		
		System.out.println(hello.get() ); // hello
		hello.set("«дравствуй");
		System.out.println(hello.get());
		
//		hello.strHi = "xxx";
		
		/************************************/
		
		
		Overload over = new Overload(); // новый экземпл€р класса
		
		System.out.println( over.getA() );
		
		over.setA(100); // целое число
		
		System.out.println( over.getA());
		
		over.setA(3.1415f); // с плавающей точкой
		
		System.out.println( over.getA());
		
		over.setA("123");
		
		System.out.println( over.getA());
		
		
		
		
		
		
		
		
		
	} // end of main
} // end of class
 