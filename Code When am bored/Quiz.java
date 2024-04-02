import java.util.*;
public class Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long start_time = System.currentTimeMillis();


        int i = 0;
        for (; i < 10; i++){
            double num = Math.random() * 12;
            double num0 = Math.random() * 12;
            int num2 = (int) num0;
            int num1 = (int) num;
            if (num1 > 0 && num2 > 0){
                int multiplier = num1;
                int multiplicand = num2;

                int result = multiplier * multiplicand;
                System.out.print(multiplier + " x " + multiplicand + " = "); 
                scanner.nextInt();
                System.out.println(result);
            }
        }

        long end_time = System.currentTimeMillis();

        long time_taken = end_time - start_time;
        System.out.println("Test time: " + time_taken + "ms");
    }
}
