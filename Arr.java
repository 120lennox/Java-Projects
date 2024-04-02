public class Arr {
    public static void main(String[] args){
        int a[] = new int[10];
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
