import java.util.Scanner;

public class PassOrFail{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isNotNegative1 = true;

        while (isNotNegative1){
            System.out.print("Enter your score: ");
            int score = scanner.nextInt();

            if (score == -1){
                System.out.println("No numbers are entered except 0");
                isNotNegative1 = false;
            }
            else if (score >= 60)
                System.out.println("You have passed exams!");
            
            else if (score < 60)
                System.out.println("You have failed the exams!");
            
        }
    }
}