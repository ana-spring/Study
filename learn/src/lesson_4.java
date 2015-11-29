


public class lesson_4 {
	
	public int var = 0;
	
	public static void main(String[] args) {
	
		 lesson_4 myClass = new lesson_4();
	     lesson_4 myClass1 = new lesson_4();
	     
	     myClass.var = 1;
	     
	     System.out.println(myClass.var);
	     System.out.println(myClass1.var);
	     
	     myClass.operators();
	     myClass.testArray();
	     
	     
	     
	     if (true)
	    	 return;
	     System.out.println("end");
	}//конец main 
	
	
	public void testArray() {
		int [] anArray;
//      System.out.println(anArray);
		
		anArray = new int [10];
		
		anArray[1]	= 4;
		
	    System.out.println(anArray[0]);
	    System.out.println(anArray[1]);
	    
	    
	    String[] sNames = { "Петя" , "Вася" , "Коля" };
	    byte [] Marks = {5 , 2 , 3};
	    
	    System.out.println(sNames[0] + " - " + Marks [0]);
	    System.out.println(sNames[1] + " - " + Marks [1]);
	    System.out.println(sNames[2] + " - " + Marks [2]);
	    
	    for ( int i = 0 ; sNames.length > i; i++ )
	    	System.out.println(sNames [i] + " - " + Marks [i]);
	    
	    int [][] mas = new int [10][10];
	    mas[0][1] = 1;
	    mas[5][3] = 8;
	    
	    
	    
	    
	    
	    
	    
	    
	}

	// конец class
	
        public void operators() {
        	int a = 1 ;
        	int A = 2 ;
        	int c = a + A;
        	
        	int b = ++a+a++;
        	a = a + 1; // a++;
            b  = a + a; //
            a = a + 1; // a += 1;
            a *= b; // a= a * b
        	
        	c = 1 + 4 / 2;
        	
        	
        	System.out.println(a);
        	System.out.println(b);
        	System.out.println(c);
        	
        	int max;
        	
        	if ( a > b )
        		max = a;
        	else 
        		max = b;
        	
        	max =  (a > b ) ? a : b;
        	
        	
        	
        	
        	
        	if ( ( a > b) && ( a > 0) )
        		System.out.println("Ура!");
        	
        	if ( a > b )
        	     if ( a > 0 )
        	         System.out.println("Ура!");
        	
        	
        	
        	if (a >= 0 || b <= 0)
        		System.out.println("ДА!");
        	
        	
        	
        	
        	if (a != 0) // а не равно нуль
        		System.out.println("a is not equial zero");
        	
        	
        	
        	if ( ! (a == 0 ))
        		System.out.println("получилось");
        	
        	
        	
        	int i = 3;
        	i++;
        	// prints 4
        	System.out.println(i);
        	++i;
        	// prints 5
        	System.out.println(i);
        	// prints 6
        	System.out.println(++i);
        	// prints 6
        	System.out.println(i++);
        	// prints 7
        	System.out.println(i);
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
            
        	
        	
        	
        	
        	
        	
        	
    	
    }
    	
    }

