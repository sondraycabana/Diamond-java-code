package arrayExample;


		// TODO Auto-generated method stub
		// Fig. 7.15: GradeBookTest.java
		 // GradeBookTest creates a GradeBook object using an array of grades,
		 // then invokes method processGrades to analyze them.
public class GradeBookTest {
	public static void main(String[] args) {
		 // array of student grades
		/*
		 int[] gradesArray = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
		
		 GradeBook myGradeBook = new GradeBook(
		 "CS101 Introduction to Java Programming", gradesArray);
		 System.out.printf("Welcome to the grade book for%n%s%n%n",
		 myGradeBook.getCourseName());
		 
		 myGradeBook.processGrades();*/
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
		 }*/
		
		 /*
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
		 }*/
		/*
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
		}*/
		/*
		int a = 7;
		int x = 5;
		for(int i = 0; i < a; i++) {
			for(int j = 0; j <= i ; j++) {
					System.out.print("*");	
			}
			System.out.println( );	
	}*/
		int a = 6;
		for (int i=0; i < a ; i++) {
		    for (int j= 0; j <= a; j++) {
		    	if(j == 0 || j == i || i == a-1)
		       //char h = (i == a-1 || j == 0 || j == i) ? '*' : ' ';
		       System.out.print("*"); 
		        //System.out.print((i == a-1 || j == 0 || j == i) ? '*' : ' ');
		        //System.out.print((i == a-1 || j == 0 || j == i) ? '*' : ' ');
		    	// else System.out.print(" ");
		    }
		    System.out.println(); 
		}

		}}

