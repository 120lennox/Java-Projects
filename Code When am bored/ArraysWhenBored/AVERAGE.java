import java.util.Scanner;

public class AVERAGE {
    public static void average() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of elements: ");
        int limit = scanner.nextInt();

        double numbers[] = new double[limit];
        double sum = 0;

        System.out.print("Enter number: ");
        for (int i = 0; i < limit; i++) {
            numbers[i] = scanner.nextDouble();
            sum += numbers[i];
        }

        double average = sum / limit;
        int count = 0;

        for (double i = 0; i < numbers.length; i++) {
            int conter = 0;
            if (i > average) {

                conter++;
            }
            count = conter;
        }

        System.out.println("Average: " + average + " numbers greater than average: " + count);

    }

    public static void main(String[] args) {
        average();
    }
}
