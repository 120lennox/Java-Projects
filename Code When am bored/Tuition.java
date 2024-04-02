public class Tuition {
    public static void main(String[] args) {
       double tuition = 10000;
       int year = 1;
       float new_tuition = 0;
       
       for (; year <= 14; year++){
            double increment = tuition * 0.06;
            tuition += increment;

            if (year == 10){
                System.out.println("Tution in 10 years: $" + (float) tuition);
            }

            if (year > 10 && year <= 14){
                new_tuition += tuition; 
            }

       }
       System.out.println("Total tuition of 4 years after the 10th year: $" + (float) new_tuition);
    }
}
