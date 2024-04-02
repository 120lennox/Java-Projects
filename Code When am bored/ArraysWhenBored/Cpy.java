import java.util.Scanner;

public class Cpy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int digit = 0;
        int sum = 0;

        while (scanner.hasNext()){
            if (scanner.hasNextInt()){
                digit = scanner.nextInt();
                System.out.println(digit + "\t");
            }
            else if (scanner.hasNextInt()) {
                String name = scanner.next();
                System.out.print(name + "\t");
            }
        }
    }
}
