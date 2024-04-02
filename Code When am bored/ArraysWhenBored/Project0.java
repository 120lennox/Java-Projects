public class Project0 {
    public static void main(String[] args) {
        double rnds [] = new double[10];
        for (int i = 0; i < rnds.length; i++){
            rnds[i] += Math.random() * 10; 
        }

        for (int j = 0; j < rnds.length; j++){
            System.out.println(rnds[j]);
        }

    }
}
