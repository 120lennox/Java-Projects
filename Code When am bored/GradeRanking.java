import java.util.Scanner;

public class GradeRanking{
    public static void main(String[] args) {
        //first student credentials
        Scanner scanner = new Scanner(System.in);
        System.out.print("First student Name: ");
        String name1 = scanner.next();
        System.out.print("First Student Grade: ");
        double grade1 = scanner.nextDouble();
        //second student credentials
        System.out.print("Second student Name: ");
        String name2 = scanner.next();
        System.out.print("Second Student Grade: ");
        double grade2 = scanner.nextDouble();
        //third student credentials
        System.out.print("Third student Name: ");
        String name3 = scanner.next();
        System.out.print("Third Student Grade: ");
        double grade3 = scanner.nextDouble();
        //Fourth student credentials
        System.out.print("Fourth student Name: ");
        String name4 = scanner.next();
        System.out.print("Fourth Student Grade: ");
        double grade4 = scanner.nextDouble();

        //initalizing maximum grade
        double max_grade = grade1;

        //finding the highest grade
        if (grade2 > max_grade){
            max_grade = grade2;
        }
        if (grade3 > max_grade){
            max_grade = grade3;
        }
        if (grade4 > max_grade){
            max_grade = grade4;
        }

        //finding second highest
        double second_highest = grade1;

        if (grade2 > second_highest && grade2 < max_grade){
            second_highest = grade2;
        }
        if (grade3 > second_highest && grade3 < max_grade){
            second_highest = grade3;
        }
        if (grade4 > second_highest && grade4 < max_grade){
            second_highest = grade4;
        }

        //who has the highest grade?
        if (max_grade == grade1){
            System.out.println(name1 + " is the highest with " + grade1 + "%");
        }
        else if (max_grade == grade2){
            System.out.println(name2 + " is the highest with " + grade2 + "%");
        }
        else if (max_grade == grade3){
            System.out.println(name3 + " is the highest with " + grade3 + "%");
        }

        else 
            System.out.println(name4 + " is the highest with " + grade4 + "%");  

        //who is the second highest
        if (second_highest == grade1){
            System.out.println(name1 + " is the second highest with " + grade1 + "%");
        }
        else if (second_highest == grade2){
            System.out.println(name2 + " is the second highest with " + grade2 + "%");
        }
        else if (second_highest == grade3){
            System.out.println(name3 + " is the second highest with " + grade3 + "%");
        }

        else 
            System.out.println(name4 + " is the second highest with " + grade4 + "%");
    }
}