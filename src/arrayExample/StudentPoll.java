package arrayExample;
public class StudentPoll {
	public static void main(String[] args) {
		
		 int[] responses =
		 {1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2};
		 int[] frequency = new int[6]; // array of frequency counters
		 for (int answer = 0; answer < responses.length; answer++) {
			 ++frequency[responses[answer]];
			 /*
		 try {
		 ++frequency[responses[answer]];
		 }
		 catch (ArrayIndexOutOfBoundsException e) {
		 System.out.println(e); // invokes toString method
		 System.out.printf(" responses[%d] = %d%n%n",
		 answer, responses[answer]);
		 }*/
		 }
		 System.out.printf("%7s%15s%n", "Rating", "Frequency");
		 // output each array element's value
		 for (int rating = 1; rating < frequency.length; rating++) {
		 System.out.printf("%6d%10d%n", rating, frequency[rating]);
		 }
		/*
		int x = 1, sum = 0;
		while(x < 11) {
			sum += 1;
			System.out.println(x);
			x++;
		}
		/*
		try {
			int a = 19;
			int b = 0;
			int c = a % b;
			System.out.println(c);
		}
		catch(Exception e) {
			System.err.println("Miscalculation Error, ensure you type in the right thing.");
		}
		finally {
			System.out.println("you're welcome");
		}*/
	}
		}


