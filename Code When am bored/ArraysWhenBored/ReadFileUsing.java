import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileUsing {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("data.txt");
        Scanner input = new Scanner(file);

        // count number of columns
        int countCol = 0;
        while (input.) {
            input.next();
            countCol++;
            if (()) {
                break;
            }
        }

        // count number of rows
        /* int countRow = 0;
        while (input.hasNextLine()) {
            while (input.hasNext()) {
                input.next();
                countCol++;
            }
            input.nextLine();
            countRow++;
        } */
       // System.out.println(countRow);
        System.out.println(countCol);

    }
}
