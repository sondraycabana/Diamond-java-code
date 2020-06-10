package chapter7_question;
import java.util.Scanner;
public class Question7_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Perform the following tasks for an array called fractions:
			a) Declare a constant ARRAY_SIZE that is initialized to 10.
			ANS: final int ARRAY_SIZE = 10;
			b) Declare an array with ARRAY_SIZE elements of type double, and initialize the elements to 0.
			ANS: double[] fractions = new double[ ARRAY_SIZE ];
			c) Refer to array element 4.
			ANS: fractions[ 4 ]
			d) Assign the value 1.667 to array element 9.
			ANS: fractions[ 9 ] = 1.667;
			e) Assign the value 3.333 to array element 6.
			ANS: fractions[ 6 ] = 3.333;
			f) Sum all the elements of the array, using a for statement. Declare the integer variable x
			as a control variable for the loop.
			ANS: double total = 0.0;
			for ( int x = 0; x < fractions.length; x++ )
 			total += fractions[ x ];
			
			*/
		 
		 Scanner input = new Scanner(System.in);
		    System.out.print("Enter your grade: ");
		    int grade = input.nextInt();
		  //int grade = 70;
		    
		    switch(grade ){
		    case 70:
		      System.out.print("A");
		      break;
		      case 60:
		      System.out.print("B");
		      break;
		      case 50:
		      System.out.print("C");
		      break;
		      case 40:
		      System.out.print("Pass");
		      break;
		       case 39:
		      System.out.print("you failed");
		     default:
		    	 System.out.println("your input is not valid");
		    }
	}

}
