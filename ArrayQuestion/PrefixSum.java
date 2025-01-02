
import java.util.Scanner;

public class PrefixSum {
    static int[] prefixSum(int[] a){
        int sum = 0;
        for(int i = 0;i<a.length;i++){
            sum = a[i] + sum;
            a[i] = sum;
        }
        return a;
    }
    static void printArray(int [] a){
        for(int i : a){
            System.out.print(i+" ");
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of the Array: ");
        int n = sc.nextInt();
        System.out.println("Enter the number in Array");
        int[] a = new int[n];
        for(int i = 0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        int[] ans = prefixSum(a);
        System.out.print("Prefix sum of Array: ");
        printArray(ans);

        sc.close();
    }   
}
