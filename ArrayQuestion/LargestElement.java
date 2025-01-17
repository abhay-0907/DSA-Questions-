
import java.util.Scanner;

class LargestElement{
    public static int largestElement(int[] a){
        int maxValue = Integer.MIN_VALUE;
        for(int i = 0;i<a.length;i++){
            if(a[i]>maxValue){
                maxValue = a[i];
            }
        }
        return maxValue;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the Array: ");
        int n = sc.nextInt();
        System.err.println("Enter the Element in the Array: ");
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The largest Element in the array = "+ largestElement(arr));
    }
}