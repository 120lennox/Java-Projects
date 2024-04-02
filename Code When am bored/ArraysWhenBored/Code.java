import java.io.FileReader;
import java.util.Scanner;

public class Code {
    public static void tyr() {
        int [] num = {1, 2, 3 ,4 ,5};

        for (int i = 0; i < num.length; i++) {
            num[i] = 8;
        }
    }
    public static void scanner_methods() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (scanner.hasNextInt()){
            System.out.print("Number: ");
            int numbers = scanner.nextInt();
            sum = sum + numbers;
        }
        
    }

    public static void main(String[] args) {
        scanner_methods();
    }
}
