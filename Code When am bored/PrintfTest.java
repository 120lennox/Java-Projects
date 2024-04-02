
public class PrintfTest {
    public static void main(String[] args) {
       System.out.printf("%1s %20s %15s %20s %20s", "Celsius", "Fahrenheit", "|", "Fahrenheit", "Celsius");
       System.out.println(""); 

        for (int i = 0, j = 2; i <= 8;  i++, j+=2){
            System.out.printf("%1d", i);
            System.out.printf("%20d \n", j);
        }
    }
}
