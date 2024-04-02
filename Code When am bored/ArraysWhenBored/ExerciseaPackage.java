import java.util.Scanner;

public class ExerciseaPackage {
    public static void fibonacci(int n){
        int next_num = 1, first = 1, second = 0; 

        for (int i = 0; i < n; i++){
            System.out.print(next_num + " ");
            next_num = first + second;
            second = first;
            first = next_num;

        }
    }

    public static void print_some(int limit){
        int counter = 0;
        for (int i = 0; i < limit; i++){
            System.out.print(i + " ");
            counter++;

            if (counter == 10){
                System.out.println();
                counter = 0;
            }
            
        }
    }

    public static void reverse_int(int number){
        int reversed = 0;

        while (number != 0){
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        System.out.print(reversed + " \n");

    }

    public static void main(String[] args) {
        //fibonacci(20);
        //reverse_int(2345);
        print_some(56);
    }
}
