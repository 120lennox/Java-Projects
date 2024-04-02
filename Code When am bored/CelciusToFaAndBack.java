public class CelciusToFaAndBack {
    public static void main(String[] args) {

        //constructing table headers
        System.out.printf("%1s %20s %15s %20s %20s", "Celsius", "Fahrenheit", "|", "Fahrenheiti", "Celcius");
        System.out.println("");

        // initializing loop to iterate through range 0 tio 100
        for (int celsius = 0, fahrenheit = 20; celsius <= 100; celsius += 2, fahrenheit +=5){
            double converted_fahrenheit = (celsius * 9.0/5) + 32;
            double converted_celsius = (fahrenheit - 32) / (5.0/9);

            //printing results in a table
            System.out.printf("%1d %20f %15s", celsius, converted_fahrenheit, "|");
            System.out.printf("%20d %20f\n", fahrenheit, converted_celsius);
        }


    }
}
