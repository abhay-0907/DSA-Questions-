public class ReverseArray {
    // Reverse an array using an other Array
    public static int[] reverse(int []a){
        int[] ans = new int[a.length];
        int j = 0;
        int i = a.length - 1;
        while(i>=0){
            ans[j++] = a[i--];
        }
        return ans;
    }

    // Reverse an array using swap method
    
    public static void swap(int[]a,int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static int[] reverseArray(int[] a){
        int i = 0;
        int j = a.length - 1;
        while(i<j){
            swap(a,i,j);
            i++;
            j--;
        }
        return a;
    }
    static void printArray(int[]a){
        for(int i : a){
            System.out.print(i+ " ");
        }
    }

    public static void main(String[] args) {
        int[] a = {2,5,1,6,2,4};
        int []ans = reverse(a);
        int [] ar = {1,2,3,4,5};
        int[] ans1 = reverseArray(ar); 
        printArray(ans);
        printArray(ans1);
    }
}
