
public class lesson_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for (int j = 0; j < 10; j++) {
			System.out.println("j = " + j);
			
			if ( j % 2 == 0)
				 System.out.println("Четное");
			else 
				System.out.println( "Нечетное");
			
		}
		
		
		// infinite cycle
		int k = 0;
		
		for (;;) {
			if ( k++ > 10 )
				break;
				System.err.println( "Hello!" + k);
		}

		
		// infinite cycle
				k = 0;
				
				for (;;) {
					k++;
					
				if ( k > 1 ) {	
					
				System.err.println( "Hello!" + k);
				} //if;
				
				if ( k > 10 )
					break;
					
				}// for
				

	
	}// main

}// class











