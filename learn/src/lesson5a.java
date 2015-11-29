

public class lesson5a {

	public static void main(String[] args) {
		
		if (args.length !=2){
			System.out.println("Two parameters required");
			return;
		}
		
		lesson5a obj = new lesson5a ();
		
		
		Float a = Float.valueOf(args[0]);
		Float b = Float.valueOf(args[1]);
		
		System.out.println(a);
		System.out.println(b);
		
		
		float result = obj.add(a, b);
		System.out.println("Сумма = " + result);
		
		result = obj.sub(a, b);
		System.out.println("Разность = " + result);

		result = obj.mul(a, b);
		System.out.println("Умножение = " + result);
		
		if ( b != 0) {	
	      result = obj.div(a.intValue(), b.intValue());
		  System.out.println("Деление = " + result);
		  }
		else
			System.out.println("на ноль не делится");
			
			System.out.println("END");
	}// end of main
		
		
		

	
	public float add ( float a, float b) {
		
		float result = a+b;
		
		return result;
	}
	
	public float sub ( float a, float b) {
		
		float result = a - b;
		
		return result;
	}
	public float mul ( float a, float b) {
		
		float result = a * b;
		
		return result;
	}
	public int div ( int a, int b) {
		
		int result = a / b;
		
		return result;
	}
	
} //end for class


