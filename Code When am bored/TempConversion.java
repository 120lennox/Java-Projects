public class TempConversion {
    public static void main(String[] args) {
        // titles
        System.out.print("Celsius               ");
        System.out.println("Fahrenheit");
        int i = 0;

        // logic, layout and conversions
        for (; i <= 100; i++){
            int fahrenheit = (i * 9/5) + 32;
            System.out.print(i + "                          ");
            System.out.println(fahrenheit);
        }
    }
}
