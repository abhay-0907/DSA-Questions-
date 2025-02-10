import java.util.Scanner;

public class MultiDimensionalArray {

    public static void printArray(int[][] array){
        for(int i = 0;i<array.length;i++) { // for row
            for(int j = 0;j<array[i].length;j++){ // for Column
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        //int [][] twoDArray = {{1,2,3},{5,7,9},{12,15,18}}; // using Array Literals
        //printArray(twoDArray);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Rows: ");
        int r = sc.nextInt();
        System.out.println("Enter the Number of Columns: ");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        printArray(arr);
    }
}
