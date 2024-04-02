import java.util.Scanner;

public class Transfer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] integers = new int[1000];
        while (scanner.hasNext()){
            for (int i = 0; i < integers.length; i++) {
                integers[i] = scanner.nextInt();
            }

            for (int i = 0; i < integers.length/2; i++) {
                int temp = integers[i];
                integers[i] = integers[integers.length - 1 - i];
                integers[integers.length - 1 - i] = temp;
            }

            for (int i = 0; i < integers.length; i++) {
                System.out.print(integers[i] + "\t");
            }
        }
    }
}
