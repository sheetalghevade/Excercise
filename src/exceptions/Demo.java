package exceptions;

 class Demo {

			
			void sum(int x, int y){

			 System.out.println("Sum of two numbers: " +(x+y)); } 

			void sum(int x, int y, int z){ 

			System.out.println("Sum of three numbers: " +(x+y+z)); 
			} 
			

			public static void main(String[] args){ 

			Demo a = new Demo(); 

			a.sum(20, 30);

			 a.sum(30, 40, 50);

			 }

			 } 		
	


