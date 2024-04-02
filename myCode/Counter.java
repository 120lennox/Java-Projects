public class Counter{
	public static void main(String args[]){
		int num = Integer.parseInt(args[0]);
		
		int i;	
		for (i = 1; i <= num; i++){
			System.out.print(i);
			if (i % 100 >= 11 && i % 100 <= 20){
				System.out.print("th");
				}
			else if (i % 10 == 1)
				System.out.print("st");
			else if (i % 10 == 2)
				System.out.print("nd");
			else if (i % 10 == 3)
				System.out.print("rd");
			else 
				System.out.print("th");
			
			System.out.println(" hello");
		}
	}
}