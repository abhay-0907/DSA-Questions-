

public class SortEvenOdd {
    static void printArray(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");

        }
        System.out.println(" ");
    }

    static void sortEvenOdd(int[] a){
        int l = 0;
        int r = a.length-1;
        while(l<r){
            if(a[l]%2!=0&&a[r]%2==0){
                int temp = a[l];
                a[l] = a[r];
                a[r] = temp;
                l++;
                r--;
            }
            if(a[l]%2==0){
                l++;
            }
            if(a[r]%2!=0){
                r--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        sortEvenOdd(arr);
        printArray(arr);

    }
}
