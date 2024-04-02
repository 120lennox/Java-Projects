public class Msiska {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 0};
        for (int i = 0; i < a.length; i++) {
            System.out.println(i + ". a[i] = " + a[i]);
            System.out.println(i + ". a[a[i]] = " + a[a[i]]);
            a[a[i]] = a[i];
            System.out.println(i + ". a[a[i]] = " + a[a[i]]);
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
