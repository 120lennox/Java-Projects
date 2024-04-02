import java.util.Scanner;

public class Sheets {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of sheets: ");
        int sheets = scanner.nextInt();

        if (sheets % 5 == 0){
            int num = sheets / 5;
            System.out.println(num);
        }
        else{
            double num2 = sheets / 5.0;
            double num3 = Math.ceil(num2);
            System.out.println(num3);
        }
            
    }
}
