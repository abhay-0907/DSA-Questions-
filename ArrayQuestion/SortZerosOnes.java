public class SortZerosOnes {
    static void sortZerosOnes(int[] a){
        int l = 0;
        int r = a.length-1;
        while(l<r){
            if(a[l]==1&&a[r]==0){
                int temp = a[l];
                a[l] = a[r];
                a[r] = temp; 
                l++;
                r--;
            }
            if(a[l]==0){
                l++;
            }
            if(a[r]==1){
                r--;
            }
            




        
            
        }  
    }
    static void printArray(int[] a){
        for(int i : a){
            System.out.print(i + " ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        int[] arr = {1,0,1,0,1,1,1,0,1,0};
        int[] arr1 = {0,1,1,0};
        sortZerosOnes(arr1);
        sortZerosOnes(arr);
        printArray(arr);
        printArray(arr1);
    }
}
