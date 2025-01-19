package recursion;



class PrintArrayRecursivly{
    static void printArray(int[] arr, int idx){
        if(idx==arr.length){
            return;
        }
        System.out.print(arr[idx]+" ");
        printArray(arr, idx+1);
    }
    public static void main(String[] args) {
        int[] arr = {2,4,3,6,4,9};
        printArray(arr,0);
    }
}