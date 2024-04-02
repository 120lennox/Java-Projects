import java.util.Scanner;
public class Average{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		double sum = 0;
		int limit = 0;
		double average = 0;
		
		while (scanner.hasNextInt()){
			sum += scanner.nextDouble();
			limit++;
		}
		average = sum / limit;
		System.out.println("average: " + average);	
	}
}