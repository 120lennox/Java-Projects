import java.util.Scanner;
/*
 * The following are beginner projects in different methods 
 */

public class LoopsRefresh {
    //Addition quiz
    public static void repeat_addition_quiz(){
        Scanner input = new Scanner(System.in);
        System.out.println("===Hello, do you want to take the quiz?(y/n)===");
        String option = input.next();

        while (!option.equals("n") && !option.equals("N")){

            //generating numbers to add
            int num1 = (int)(Math.random() * 1000);
            int num2 = (int)(Math.random() * 1000);

            System.out.print(num1 + " + " + num2 + " = ");
            int result = input.nextInt();
            String answer = "";
            int counter = 0;

            //start quiz
            while (result != (num1 + num2) || (answer.equals("y") && answer.equals("Y"))){
                System.out.print(num1 + " + " + num2 + " = ");
                result = input.nextInt();
                counter ++;

                //if user fails for 3 times should ask if it can give the answer
                if (counter >= 2){
                    System.out.println("==Do you want to see the answer?(y/n)==");
                    String see_answer = input.next().toUpperCase();
                    if (see_answer.equals("Y")){
                        int correction = num1 + num2;
                        System.out.println(num1 + " + " + num2 + " = " + correction);
                        break;
                    }
                }
            }

            System.out.println("===Congratulations! do you want to continue?(y/n)===");
            option = input.next();

        }


    }

    //Multiplication table
    public static void multiplication_table(){
        Scanner input = new Scanner(System.in);
        System.out.print("Limit: ");
        int multiplicand = input.nextInt();

        int multiplier = 2;

        for (; multiplier <= multiplicand; multiplier++){
            for(int i = 1; i <= multiplicand; i++){
                System.out.println(i + " x " + multiplier + " = " + (i * multiplier));
            }
            
            System.out.println();
            System.out.println("---------------------------------------");
        }



    }

    public static void main(String[] args) {
        //repeat_addition_quiz(); 
        multiplication_table();   
    }
}
