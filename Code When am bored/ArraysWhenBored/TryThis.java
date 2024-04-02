import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class TryThis{
    public static void main (String args[]) throws FileNotFoundException{
        File file = new File("datas.txt");
        
        
             Scanner scanner = new Scanner(file);
             double sum = 0;
             double average = 0;

            System.out.println("RegNo \t test1 \t test2 \t test3 \t average");
            while (scanner.hasNext()){
                //skipping header
                if (scanner.hasNextLine()){
                    scanner.nextLine();
                }
                //adding all tokens in one line
                String regNo = scanner.next();
                double num1 = scanner.nextDouble();
                double num2 = scanner.nextDouble();
                double num3 = scanner.nextDouble();
                //printing sum
                sum = num1 + num2 + num3;
                average = sum / 3;
                System.out.println(regNo + "\t" + num1 + "\t" + num2 + "\t" + num3 + "\t" + average + "\t");
                sum = 0;
            }
        
       

    }
}