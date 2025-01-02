
class SortSquaredArray{
    static void printArray(int[] a){
        for(int i:a){
            System.out.print(i+" ");
        }
        System.out.println(" ");
    }
    static void swap(int[] a,int i,int j ){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    static void reverseArray(int[] a){
        int i = 0;
        int j = a.length-1;
        while(i<j){
            swap(a, i, j);
            i++;
            j--;
        }
    }
    static int[] sortSquaredArray(int[] a){
        int [] squaredArray = new int[a.length];
        int k = 0;
        int left = 0;
        int right = a.length-1;
        while(left<=right){
            if(Math.abs(a[left])>Math.abs(a[right])){
                squaredArray[k++] = a[left] * a[left];
                left++;
            }
            else
            {
                squaredArray[k++] = a[right] * a[right];
                right--;
            }
        }
        reverseArray(squaredArray);
        return squaredArray;
    }
    public static void main(String[] args) {
        int[] arr = {-10,-3,-1,2,4,5};
        int[] sortedArray = sortSquaredArray(arr);
        printArray(sortedArray);
    }
}