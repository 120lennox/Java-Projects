public class DegToFah {
    public static void main(String[] args) {

        //table titles
        System.out.print("Celsius           ");
        System.out.println("Fahrenheit");

        int celcius = 0;

        //conversion session 
        while (celcius <= 100){
            // converting celsius to fahrenheit
            double celcius_cpy = (double) (celcius);
            double fahrenheit = (celcius_cpy * 9/5) + 32;

            // printing table
            System.out.print(celcius + "                    ");
            System.out.println(fahrenheit);

            //incrementing celsius
            celcius += 2;
        }

    }
}
