import java.util.*;

public class Mandla{
    public static void main(String[] args){
        //prompt user input 
        Scanner input = new Scanner(System.in);
        System.out.print("enter an integer:  ");
        int usersNumber = input.nextInt();
        

        // to find how many intervals of five  with any given integer
        if (usersNumber % 5 == 0 ){
            int value = usersNumber / 5;
            System.out.println("your number is :  " + value);
               
        }
        else{
            Double returnvalue = usersNumber / 5.0;
            double value = Math.ceil(returnvalue);
            System.out.println("your number is :  " + value);
            
        }
        

   
    }
}