public class MatrixMultiplication {

    public static void printArray(int[][] array){
        for(int i = 0;i<array.length;i++) { // for row
            for(int j = 0;j<array[i].length;j++){ // for Column
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    static void matrixMultiplication(int[][] matrix1, int[][] matrix2){
        int r1 = matrix1.length;
        int c1 = matrix1[0].length;
        int r2 = matrix2.length;
        int c2 = matrix2[0].length;

        if(c1!=r2){
            System.out.println("Matrix Multiplication not possible");
            return;
        }
        int[][] ans = new int[r1][c2];
        for(int i = 0;i<r1;i++){
            for(int j = 0;j<c2;j++) {
                for(int k =0;k<c1;k++){
                    ans[i][j] += (matrix1[i][k] * matrix2[k][j]);
                }
            }
        }

        printArray(ans);
    }
    public static void main(String[] args) {
        int matrix1[][] = {{1,2,1},{3,1,2}};
        int matrix2[][] = {{2,1},{1,3},{1,1}};
        matrixMultiplication(matrix1,matrix2);
    }
}
