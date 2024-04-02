public class Multiplication {
    public static void main (String []args){
        int [][]a = {{2,4,3},
                    {2,6,10},
                    {4,15,21}};
                        
       int [][]b = {{6,7,8,9},
                           {3,1,7,20},
                           {15,2,2,4}};
     int[][] sum = new int[a.length][b[0].length];
    for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < b[0].length; j++){
            for(int y = 0; y<b.length; y++){
                sum[i][j] += a[i][y] * b[j][y];
            }
        }
    }

    for (int i = 0; i < sum.length; i++) {
        for (int j = 0; j < sum.length; j++){
            System.out.print(sum[i][j] + " ");
        }
        System.out.println();
    }
    
    }
}