import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadComplexFile {
    public static void read_file(){ //throws FileNotFoundException{
        //File file = new File("D:\\CODE ROOM\\Java Learn\\Code When am bored\\ArraysWhenBored");
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int digit = 0;

        while (scanner.hasNext()){

            if (scanner.hasNextInt()){
                sum += scanner.nextInt();
            }
            else{
                scanner.next();
            }
            }
            System.out.println(sum);
    }

    public static void main(String[] args){//throws FileNotFoundException {
        read_file();
    }
    
}
