public class IsLeapYear{
	public static void main(String args[]){
		int year = Integer.parseInt(args[0]);
		boolean isLeapYear;
		
		isLeapYear = year % 4 == 0 && year % 100 != 0;
		isLeapYear = year % 100 == 0 && year % 400 == 0;
		System.out.println(args[0] + " leap year ? " + isLeapYear);
	}
}