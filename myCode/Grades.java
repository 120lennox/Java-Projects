public class Grades {
	public static void main(String args[]){
		int grade = Integer.parseInt(args[0]);

		if (grade >= 80){
			System.out.println(grade + " ==> A");
		}
		else if (grade >= 70 && grade <= 79){
			System.out.println(grade + " ==> B");
		}
		else if (grade >= 60 && grade <= 69){
			System.out.println(grade + " ==> C");
		}
		else if (grade >= 50 && grade <= 59){
			System.out.println(grade + " ==> D");
		}
		
		else 
			System.out.println(grade + " ==> Fail (F)");
	}

}