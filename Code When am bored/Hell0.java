public class Hell0{
	public static boolean detect_leap_year(int year){
		boolean is_leap_year = year % 4 == 0 && year % 100 != 0;
		is_leap_year = is_leap_year || year % 400 == 0;
		
		return is_leap_year;
	}
	
	public static void sum_of_natural_numbers(int n){
		int i = 1;
		int sum = 0;
		while (i <= n){
			sum += i;
			System.out.println(sum);
		}
	}

	public static void main(String args[]){
		//test cases
		int year = Integer.parseInt(args[0]);
		
		boolean is_leap_year = detect_leap_year(year);
		
		if (is_leap_year){
			System.out.println(year + " is leap year");
		}
		else 
			System.out.println(year + " is not leap year");
	}
}