public class Prep{
	public static void main(String args[]){
		int year = Integer.parseInt(args[0]);
		//calculate leap year
		if (year % 4 == 0 && year % 100 != 0){
			System.out.println(args[0] + " is leap year");
		}
		else if(year % 100 == 0 && year % 400 == 0){
			System.out.println(args[0] + " is leap year");
		}
		else 
			System.out.println(args[0] + " is not leap year");
		
	}
}