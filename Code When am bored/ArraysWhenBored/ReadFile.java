import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadFile{
    public static void main (String args[]) throws FileNotFoundException{
        File file = new File("data.txt");
        
        
             Scanner scanner = new Scanner(file);
             int sum = 0;
             
             System.out.println();
            //skipping header
                if (scanner.hasNextLine()){
                    scanner.nextLine();
            
            while (scanner.hasNext()){
                //adding all tokens in one line
                String regNo = scanner.next();
                for (int i = 1; i <= 8; i++){
                    int x = scanner.nextInt();
                    sum += x;
                }
                //printing sum
                System.out.printf("%.3s%10d\n" ,regNo,sum);
                sum = 0;
            }
    }
    }
}