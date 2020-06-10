package chapter7_question;

public class Question7_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Display the value of element 6 of array f.
		// question a
		//f[6];
		//question b
//		Initialize each of the five elements of one-dimensional integer
//		array g to 8.
		 int g[] = { 8, 8, 8, 8, 8 );
		//question c
		//Total the 100 elements of floating-point array c.
		int total = 0;
		int [] f = new int [100];
		for(int a = 0; a < f.length;a++){
			total += f[a];
			System.out.print( total);
		}
		{
			///question d
//			Copy 11-element array a into the first portion of array b, which
//			contains 34 elements
			 double a[] = new double[ 11 ];
			 double b[] = new double[ 34 ];
			
			 // d)
			 for ( int j = 0; j < a.length; j++ )
			 b[ j ] = a[ j ];
			
			 } // end class PartD
		//question e
		//Determine and display the smallest and largest values contained
		//in 99-element floating-point array w.
		double w[] = new double[ 99 ];
		 double small = w[ 0 ];
		 double large = w[ 0 ];
		 for ( int i = 0; i < w.length; i++ )
		 if ( w[ i ] < small )
		 small = w[ i ];
		 else if ( w[ i ] > large )
		 large = w[ i ];
		
		 System.out.printf( "%f %f\n", small, large );
	}

}
