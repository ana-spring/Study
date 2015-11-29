package lesson5;

public class lesson5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i< args.length; i++) {
//			System.out.println(args[i]);
			
			try {
			Integer j = Integer.parseInt(args [0]);
			Integer k = Integer.parseInt(args [1]);
			
			System.out.println("j = " + j);
			System.out.println("k = " + k);
			System.out.println("sum = " + (j + k) );
			
			} catch (Exception e) {
// 			  e.printStackTrace();
 			  System.out.println("Error!");
			}
			
			
		} // end of for
		
		boolean bTrue = true;
		
		while (bTrue) {
			System.out.println("hello from while!");
     		bTrue = false;
		}
		
		int n = 0;
		
		do {
			
			n++;
			
			switch (n) {
			case 1:
				System.out.println("One");
				break;
			case 3:
				System.out.println("Three");
				break;

			default:
				System.out.println("Other");
				break;
			}
			
			System.out.println("hello from do!");
		}  while (n < 5);
		
		
		
		
		
        System.out.println("end");
        
	} // end of main

} // end of class
