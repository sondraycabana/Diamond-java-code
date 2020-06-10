package arrayExample;

public class AsterikWonders {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 /*
		 int star = 1;
		 int space = 5;
		 for(int i = 0; i < 5; i++) {
			 for(int sp = 0; sp < space; sp++) {
				 System.out.print(" ");
			 }
			 for(int st = 0; st < star; st++){
				  if(i == 0 || i == 4) {
				
				 System.out.print("*");
				 
				  }else if( i != 0 || i != 4) {
					  if(st == 0 || st ==(star - 1)) {
						  
						  System.out.print("*");
					  }else {
						  System.out.print(" ");
					  }
				  }
			 }
			 System.out.println( );
			space -= 1;
			star += 2;		
		 }
		
		 
		 System.out.println( );
		 int gap = 9;
		 int sta = 1;
		 for(int i = 0; i < 9; i++) {
			 for(int j = 0; j < sta; j++) {
				 System.out.print(" ");
			 }
			 for(int x= 0; x < gap; x++) {
				 System.out.print("*");
			 }
			 gap -= 2;
			 sta += 1;
			 
		 System.out.println( );
		 }
		
		//for square
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(j == 0 || j == 4) {
					System.out.print("*");
				}else if(i == 0 || i == 4) {
					System.out.print("*");
				}else {
				System.out.print(" ");
				}
			}
			System.out.println( );
		}
		
		int a = 7;
		int x = 5;
		for(int i = 0; i < a; i++) {
			for(int j = 0; j <= i ; j++) {
					System.out.print("*");	
			}
			System.out.println( );	
	}
		System.out.println( );
	// right angle with space inside
		int z = 6;
		for (int i=0; i < z ; i++) {
		    for (int j= 0; j <= i; j++) {
		    	//if(j == 0 || j == i || i == z-1)
		       char h = (i == z-1 || j == 0 || j == i) ? '*' : ' ';
		       System.out.print(h); 
		        //System.out.print((i == z-1 || j == 0 || j == i) ? '*' : ' ');
		        //System.out.print((i == a-1 || j == 0 || j == i) ? '*' : ' ');
		    	// else System.out.print(" ");
		    }
		    System.out.println(); 
		}
		//right upside down triangle
		System.out.println( );
		for(int i = 0; i < 5; i++) {
			for(int j = 5; j > i; j--) {
				if(j == 5 || i == 0  || i == (j - 1) )
				System.out.print("*");
				else
					System.out.print(' ');
			}
			System.out.println( );
		}*/
		/*
		//diamond
		System.out.println( );
		 int star = 1;
		 int space = 5;
		 for(int i = 0; i < 5; i++) {
			 for(int sp = 0; sp < space; sp++) {
				 System.out.print(" ");
			 }
			 for(int st = 0; st < star; st++){
				  if(i == 0 ) {
				
				 System.out.print("*");				 
				  }else if( i != 0 || i != 4) {
					  if(st == 0 || st == star-1) {
						  
						 System.out.print("*");
					  }else {
						 System.out.print(" ");
					  }
				  }
			 }
			 System.out.println( );
			space -= 1;
			star += 2;		
		 }
		
		 
		 System.out.println( );
		 int gap = 9;
		 int sta = 1;
		 for(int i = 0; i < 9; i++) {
			 for(int j = 0; j < sta; j++) {
				 System.out.print(" ");
			 }
			 for(int x= 0; x < gap; x++) {
				 if(i == 4) {
				 System.out.print("*");
				 }else if(i != 4) {
					// if(j == 0 || j == sta - 1) {
						 System.out.print("*");
					 //}
				 }
			 }
			 gap -= 2;
			 sta += 1;
			 
		 System.out.println( );
		 }*/
		 
/*		int number = 5;
		 int star = 1;
	        int space = number ;

	            for(int i = 0; i < number; i++)
	            {
	                   for(int s = 0; s < space ; s++)
	                   {
	                       System.out.print(" ");
	                   }
	                    for(int s = 0; s < star ; s++)
	                    {
	                       if(s == 0 || s == star - 1)
	                        {
	                            System.out.print("*");
	                        }
	                        else 
	                        {
	                            System.out.print(" ");
	                        }
	                    }
	                   if(i == number-1)
	                   {
	                    break;
	                   }
	                   else{
	                     System.out.println();
	                     star += 2;
	                        space--;
	                   }
	            }


	        //second

	          int x = (number * 2) - 1;

	          int y = 1;

	            for(int l = 0; l < number; l++)
	            {
	               for(int s = y; s >= 1; s--)
	                {
	                   System.out.print(" ");
	                }

	               for(int s = 0; s < x ; s++)
	               {
	                 if(l >= 1)
	                 {
	                   if(s == 0 || s == x - 1)
	                   {
	                       System.out.print("*");
	                   }
	                   else
	                   {
	                   System.out.print(" ");
	                   }

	                 }

	               }
	                  System.out.println();

	                  x-=2;

	                  y++;

	            }*/
		
	}

}
