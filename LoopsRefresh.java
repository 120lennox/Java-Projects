import java.util.Scanner;

public class LoopsRefresh {

    public static void repeat_addition_quiz(){
        Scanner input = new Scanner(System.in);
        System.out.println("===Hello, do you want to take the quiz?(y/n)===");
        String option = input.next();

        while (!option.equals("n") && !option.equals("N")){
            int num1 = (int)(Math.random() * 10);
            int num2 = (int)(Math.random() * 10);

            System.out.print(num1 + " + " + num2 + " = ");
            int result = input.nextInt();
            String answer = "";
            int counter = 0;
            while (result != (num1 + num2) || (answer.equals("y") && answer.equals("Y"))){
                System.out.print(num1 + " + " + num2 + " = ");
                result = input.nextInt();
                counter ++;

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
    public static void main(String[] args) {
        repeat_addition_quiz();    
    }
}
