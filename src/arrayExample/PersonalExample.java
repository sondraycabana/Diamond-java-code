package arrayExample;

public class PersonalExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int a[][] = {
				 {1,22,3,4,5},
				 {1,22,3,4,5},
				 {1,22,3,4,5}
		};
				
		for(int i[]:a) {
			for(int x:i) {
				System.out.print(" "+x);
			}
			System.out.println( );
		}*/
		
		
		int a [][] = {
				{3},
				{6,7},
				{2,5,7},
				{5,23,8,9,}
				};
	
	for(int i = 0; i < a.length; i++) {
		for(int j = 0; j < a[i].length; j++) {
			System.out.print(" "+a[i][j]);
		}
		System.out.println( );
	}
	System.out.println( );
	//enhance for 
	int [] f = {1,4,5,6,7,8,9,};
	for(int z: f) {
		System.out.print(" "+z);
	}
	
	System.out.println( );
	System.out.println( );
	
	int p [][] = {
			{1,2,3,5,6},
			{9,4,5,6,7},
			{3,4,5,6,3}
	};
	/*
	for(int i = 0; i < 3; i++) {
		for(int j = 0; j < 5; j++) {
			System.out.print(" "+p[i][j]);
		}
		System.out.println( );
	}*/
	
	for(int u[]:p) {
		for(int t:u) {
			System.out.print(" "+t);
		}
		System.out.println( );
	}

		}
		
	}


