public class Try {
	public static void main(String args[]){
		int num = Integer.parseInt(args[0]);
		int val = 1;
		int i;
		
		for (i = 0; i <= num; i++){
			System.out.println(val);
			val *= 2;
		}
	}
}