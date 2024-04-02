public class Matrix {

    public static void arrays_print(){
        int arr[][] = {{1, 2, 3, 5}, {5, 6, 7, 8}, {4, 5, 67, 0}};
        
        for (int i = 0; i < arr.length; i++){
            for (int x = 0; x < arr[0].length; x++){
                System.out.print(arr[i][x] + "  ");
            }
            System.out.println();
                
        }
    }

    public static void matrix_multiply() {
        int arrA[][] = {{1, 2, 3}, {3, 4, 5}, {0, 1, 6}, {0, 1, 1}};
        int arrB[][] = {{2, 3, 5, 1}, {1, 3, 5, 6}, {0, 3, 1, 9}};
        int arrC[][] = new int[arrA.length][arrB[0].length];
        // multiplying
        for (int i = 0; i < arrA.length; i++) {
            for (int j = 0; j < arrB[0].length; j++) {
                for (int k = 0; k < arrB.length; k++) {
                    arrC[i][j] += arrA[i][k] * arrB[k][j];
                }
            }
        }

        for (int i = 0; i < arrC.length; i++) {
            for (int j = 0; j < arrC[i].length; j++) { // Use j++ instead of i++ here
                System.out.print(arrC[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        matrix_multiply();
        //arrays_print();
    }
}
