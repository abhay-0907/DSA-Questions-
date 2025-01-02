public class RotateArray2 {

    static void swap(int[] a, int i, int j){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
    }
    static void reverseArray(int[]a, int st, int end){
        
        while(st<end){
            swap(a, st, end);
            st++;
            end--;
        }
    }

    static int[] rotateArray(int[] a, int k){
        int n = a.length;
        k = k % n;
        reverseArray(a, 0, n-k-1);
        reverseArray(a, n-k, n-1);
        reverseArray(a, 0, n-1);
        return a;

    }
    static void printArray(int[] a){
        for(int i:a){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] ans = rotateArray(arr, 155);
        printArray(ans);
    }
}
