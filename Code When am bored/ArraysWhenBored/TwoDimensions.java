public class TwoDimensions {
    public static void two_d_arr(){
        double init1[][] = {{1, 3, 4},
                            {2, 4, 6},
                            {0, 9, 5},
                            {3, 5, 1},
                            {5, 6, 7}};

        for (int i = 0; i < init1.length; i++){
            for (int j = 0; j < init1[j].length; j++){
                System.out.println(init1[i][j]);
            }
        }
    }
    public static void test(){
        int num[][] = {{1, 2, 3, 4}, {2, 3, 4, 6}, {3, 4, 5, 9}};
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 3; j++)
                System.out.print(num[j][i] + " ");
            System.out.println();
        }
    }

    //sum of 2D arrays
    public static void sum(){
        int num[][] = {{1, 2, 3, 4}, {2, 3, 4, 6}, {3, 4, 5, 9}};
        int num2[][] = {{2, 4, 6, 8}, {10, 12, 14, 16}, {18, 20, 22, 24}};

        int sum = 0;

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++){
                sum += num[i][j];
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        //test();
        //two_d_arr();
        sum();
    }
}
