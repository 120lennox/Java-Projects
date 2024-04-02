public class Factorial{
	public static void main(String args[]){
		int num = Integer.parseInt(args[0]);
		int i = 1;
		int product = 1;
		while (i <= num){
			product *= i;
			i++;
		}
		
		System.out.println("Factorial of " + args[0] + " = " + product);
	}
}