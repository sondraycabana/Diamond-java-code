package arrayExample;
import java.util.Random;
public class Personalrandom2 {
	public static void main(String[] args) {

		Random obj = new Random();
		int number;
		for(int i = 1; i < 10; i++) {
			number = 1 + obj.nextInt(6);
			System.out.println(number);
		}
		}

	}


