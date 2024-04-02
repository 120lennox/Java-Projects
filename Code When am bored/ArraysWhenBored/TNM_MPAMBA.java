import java.util.Scanner;

public class TNM_MPAMBA {

    static double BALANCE = 0.00;

    public static void main_menu(){
            //
    }
    public static void airtime_topup(){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("1%10s\n", "Airtime");
        System.out.printf("2%10s\n", "Bundles");
        System.out.printf("3%12s\n", "Main Menu");
        System.out.println();
        System.out.print("OPTION: ");
        String option = scanner.next();

        if (option.equals("1")){
            System.out.printf("1%15s\n", "Airtime Top up");
            System.out.printf("2%10s\n", "Main Menu");
            System.out.println();
            System.out.print("OPTION: ");

            option = scanner.next();

            if (option.equals("1")){
                System.out.printf("1%22s\n", "Self Airtime Top up");
                System.out.printf("2%30s\n", "Other Mobile Airtime Top up");
                System.out.printf("3%12s\n", "Main Menu");
                System.out.println();
                System.out.print("OPTION: ");
                option = scanner.next();

                if (option.equals("1")){
                    System.out.printf("%15s", "Enter amount: ");
                    double amount = scanner.nextDouble();

                    if (amount < BALANCE){
                        System.out.println("You have recharged your TNM account with MK" + amount);
                    }
                    else 
                        System.out.println("Insufficient funds!");
                }

                else if (option.equals("2")){
                    System.out.println("Enter customer number");

                    int number_limit = 10;
                    String customer_number[] = new String[number_limit];
                    for (int i = 0; i < number_limit; i++){
                        String number = scanner.next();
                        customer_number[i] = number;
                    }

                    if (customer_number[1].equals("8")){
                        System.out.printf("1%15s", "Enter amount: ");
                        double amount = scanner.nextDouble();

                        if (amount < BALANCE){
                            System.out.println("You have recharged your TNM account with MK" + amount);
                        }
                        else 
                            System.out.println("Insufficient funds!");
                    }

                    else 
                        System.out.println("Transaction Failed. Check your input and retry");
                    
                }


            }
        }

    }

    public static void main(String[] args) {
        airtime_topup();
    }
}
