public class Trys{
	public static void main(String []args){
		int n = 10;
		for (int i = 0; i < n; i++){
			int rnd = (int) (Math.random() * n);
			System.out.println(rnd);
		}
	}
}