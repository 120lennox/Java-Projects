import java.util.Scanner;

public class BinarySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary string: ");
        String input = scanner.nextLine();

        if (isBinaryString(input)) {
            System.out.println("\"" + input + "\" is a binary string.");
        } else {
            System.out.println("\"" + input + "\" is not a binary string.");
        }

        scanner.close();
    }
/**
 * @pa isBinaryString - checks string if its binary
 * @return boolean
 */
    public static boolean isBinaryString(String input) {
        // loop converts string to char array
        for (char c : input.toCharArray()) {
            if (c != '0' && c != '1') {
                return false;
            }
        }
        return true;
    }
}
