
import java.util.Scanner;


public class QueriesPresent {

    static int[] makeFrequencyArray(int[] arr){
        int[] frequencyArray = new int[100004];
        for(int i = 0;i<arr.length;i++){
            frequencyArray[arr[i]]++;
        }
        return frequencyArray;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the Array Length: ");
            int n = sc.nextInt();
            
            int[] arr = new int[n];
            System.out.println("Enter the value of Array: ");
            for(int i = 0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int[] freq = makeFrequencyArray(arr);
            
            System.out.println("Enter the No of Queries: ");
            int q = sc.nextInt();
            while(q!=0){
                System.out.print("Enter the Number to be Searched: ");
                int x = sc.nextInt();
                String res = freq[x]>0 ? "YES":"NO";
                System.out.println(res);
                q--;
            }
        }
    }
}
