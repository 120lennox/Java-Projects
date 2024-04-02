import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double PI = 3.14159;
        final int fixedAngle = 180;
        System.out.print("Angle: ");
        double  angle = scanner.nextDouble();
        System.out.print("1. Degree \n 2. Radians \n Choose: ");
        int measure = scanner.nextInt();

        if (measure == 1){
            double result_in_rad = (angle * PI) / fixedAngle;
            System.out.println("Angle: " + result_in_rad +"rad");
        } else if (measure == 2) {
            double result_in_degrees = (angle * fixedAngle) / PI;
            System.out.println("Angle: " + result_in_degrees + "degrees");
        } else{
            System.out.println("Choose 1 or 2");
        }

    }
}