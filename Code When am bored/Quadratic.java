public class Quadratic{
	public static void main(String args[]){
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);

		//calculating numerator
		double descriminant = (b * b) - (4 * a * c);
		if (descriminant > 0){
			double sqrt_descriminant = Math.sqrt(descriminant);
			double root1 = -(b) + sqrt_descriminant;
			double root2 = -(b) - sqrt_descriminant;
			double denominator = 2 * a;
			if (denominator > 0){
				double soln1 = root1 / denominator;
				double soln2 = root2 / denominator;
				
				System.out.println("x = " + soln1 + " or x = " + soln2);
			
			}
			else
				System.out.println("Error! division by 0");
		}
		else 
			System.out.println("Undefined");
	}
}