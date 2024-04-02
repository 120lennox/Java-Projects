public class Matrix{
	public static void matrix_multiply(){
		int arrA[][] = {{1, 2, 3}, {3, 4, 5}, {0, 1, 6}, {0, 1, 1}};
		int arrB[][] = {{2, 3, 5, 1}, {1, 3, 5, 6}, {0, 3, 1, 9}};
		int arrC[][] = new int[arrA.length][arrB.length];
		//multiplying
		for (int i = 0; i < arrA.length; i++){
			for (int j = 0; j < arrB[i].length; i++){
				for (int k = 0; k <arrB[j]; i++){
					arrC[i][j] = arrA[i][k] * arrB[j][k];
				}
			}
		}
		
		for (int i = 0; i < arrC.length; i++){
			for (int j = 0; j < arrC[i].length; i++){
				System.out.print(arrC[i][j]);
			}
			System.out.println();
		}
	}
}