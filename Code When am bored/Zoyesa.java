public class Zoyesa{

	public static void t() {
			int a[] = {1, 2, 3, 0};
			
		}
	public static void main(String args[]){
		
		String names[] = {"he", "her", "him", "she"};
		
		for (int i = 0; i < names.length/2; i++){
			String temp = names[i];
			names[i] = names[names.length - 1 - i];
			names[names.length - 1 - i] = temp;
		}

		for (int i = 0; i < names.length; i++){
			System.out.println(names[i]);
		}
	}
}