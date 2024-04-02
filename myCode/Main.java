import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tempereture: ");
        int temp = scanner.nextInt();
        if (temp <= 10){
            System.out.println("temp is "+ temp+" degrees, " +"Get yourself warm");

        }else if(temp >=10 && temp <=35){
            System.out.println("Yes! it's " + temp+"degrees. What a nice weather");

        }else{
            System.out.println("You're being roasted my friend");
        }
    }
}
