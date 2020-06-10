package arrayExample;

public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 9;
		int space = row/2;
		int star = 1;
		int midPoint = row/2;
		for(int i = 1; i < row; i++) {
			for(int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k <= star; k++) {
				System.out.print("*");
			}
			if(i < midPoint) {
				space--;
				star += 2;
			}else {
				space++;
				star -= 2;
			}
			System.out.println( );
		}

	}

}
