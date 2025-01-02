class RotateArray{
    // Function with extra Space
    static int[] rotateArray(int[] a,int n,int k){
        int[] ans = new int[n];
        k = k % n;
        int j = 0;
        for(int i = n-k;i<n;i++){
            ans[j++] = a[i];
        }
        for(int i = 0;i<n-k;i++){
            ans[j++] = a[i];
        }
        return ans;
    }
    static void printArray(int[] array){
        for(int i : array){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,6,8,9};
        int n = arr.length;
        int k = 109;
        int [] ans = rotateArray(arr,n,k);
        printArray(ans);
    }
}