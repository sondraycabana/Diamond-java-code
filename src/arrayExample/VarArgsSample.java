package arrayExample;

public class VarArgsSample {
	
public static void fun(int... number) {
	System.out.println("the length of the argument is:"+ number.length );
	for(int i:number) {
		System.out.print(i);
	}
	System.out.println( );
}
public static void main(String[]args) {
	fun(120);
	fun(1,2,3,4,5,6,7);
}
	 
}
