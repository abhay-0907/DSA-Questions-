package recursion;

public class MaxValue {
    static int maxValue(int[] arr, int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }
        int max = maxValue(arr,idx+1);
        return Math.max(max,arr[idx]);
    }
    public static void main(String[] args) {
        int[] arr = {14,5,7,2,9,1};
        System.out.println(maxValue(arr,0));
    }
}
