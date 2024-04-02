public class Methods {
    public static int add_nummbers(int a, int b){
        return a + b;
    }

    public static int subtract_nummbers(int a, int b){
     return a - b;

    }

    public static double sqrt_nummbers(double a){
     return  Math.sqrt(a);  
    }
    public static void main(String []args){
        System.out.println(add_nummbers(2,5));
        System.out.println(subtract_nummbers(4,2));
        System.out.println(sqrt_nummbers(16));
    }
}
