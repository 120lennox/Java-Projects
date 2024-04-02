import java.util.Scanner;

public class kadzutsa{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter any word: "); 
        String message = scanner.nextLine();

        char charMessage[] = message.toCharArray();
        int size = charMessage.length;
        char new_message[] = new char[size];
        
        for (int i = 0; i < size; i++){
            new_message[i] = charMessage[(size-1) - i];
        }

        for (int i = 0; i < new_message.length; i++) {
            System.out.print(new_message[i]);
        }
    }
}