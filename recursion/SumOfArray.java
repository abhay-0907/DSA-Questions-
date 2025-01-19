package recursion;

public class SumOfArray {
    static int sumOfArray(int[] arr, int idx){
        if(idx==arr.length) return 0;
        int sum = arr[idx] + sumOfArray(arr,idx+1);
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {3,2,4,1,0};
        System.out.println("Sum of Array: "+sumOfArray(arr,0));
    }
}
