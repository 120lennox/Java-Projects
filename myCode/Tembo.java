public class Tembo{
	public static void main(String args[]){
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);
		
		//calculate descriminant 
		double descriminant = b*b - 4.0 * a * c;
		double sqrt_descriminant = Math.sqrt(descriminant);
		
		//calculate numerator factors
		double factor1 = -b - sqrt_descriminant;
		double factor2 = -b + sqrt_descriminant;

		//calculate first and second root
		double root1 = factor1 / 2.0*a;
		double root2 = factor2 / 2.0*a;

		//printing roots
		System.out.println("root 1 = " + root1);
		System.out.println("root 2 = " + root2);		
	}
}