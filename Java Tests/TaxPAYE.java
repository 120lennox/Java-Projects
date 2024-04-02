import java.util.Scanner;

public class TaxPAYE {
    public static void main(String[] args) {
        //getting input from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your salary (MWK): ");
        long salary = scanner.nextInt();
        long PAYE = 0;
        long TAXABLE_INCOME = 0;
        int NON_TAXABLE_INCOME = 100000;

        //calculating tax PAYE
        if (salary > 0 && salary <= NON_TAXABLE_INCOME){
            System.out.println("your PAYE is (MWK): 0");
        }
        else if (salary > 100000 && salary <= 1000000){
            TAXABLE_INCOME = salary - NON_TAXABLE_INCOME;
            PAYE = (long) (0.25 * TAXABLE_INCOME);
            System.out.println("your PAYE is (MWK): " + PAYE);
        }
        else if (salary > 10000000 && salary <= 3000000){
            TAXABLE_INCOME = salary - NON_TAXABLE_INCOME;
            PAYE = (long) (0.3 * TAXABLE_INCOME);
            System.out.println("Your PAYE is (MWK): " + PAYE);
        }
        else if (salary > 3000000 && salary <= 6000000){
            TAXABLE_INCOME = salary - NON_TAXABLE_INCOME;
            PAYE = (long) (0.35 * TAXABLE_INCOME);
            System.out.println("Your PAYE is (MWK): " + PAYE);
        }
        else{
            TAXABLE_INCOME = salary - NON_TAXABLE_INCOME;
            PAYE = (long) (0.4 * TAXABLE_INCOME);
            System.out.println("Your PAYE is (MWK): " + PAYE);
        }
    }
}
