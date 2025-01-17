import java.util.Scanner;

class MaximumConsectiveOnes{
    public static int countConsectiveOnes(int[] a){
        int maxCount = 0;
        int count = 0;
        for(int i = 0;i<a.length;i++){
            if(a[i]==1){
                count++;
                maxCount = Math.max(count, maxCount);
            }
            if(a[i]==0){
                count = 0;
            }
        }
        return maxCount;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Length of the Array: ");
        int n = sc.nextInt();
        System.out.println("Enter the Element in the Array: ");
        int[]a = new int[n];
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int number = countConsectiveOnes(a);
        System.out.println("Maximum No of One's in array: "+number);
    }
}