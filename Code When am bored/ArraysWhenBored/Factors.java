public class Factors {
    public static void main(String[] args) {
        int num = 6;
        int factors[];
        for (int i = 2; i < num; i++) {
            if (num % i == 0){
                factors[i] = i;
            }
        }
    }
}
