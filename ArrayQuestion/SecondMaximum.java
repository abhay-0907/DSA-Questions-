public class SecondMaximum {
    public static int firstMax(int []a){
        int maximumNumber = Integer.MIN_VALUE;
        for(int i = 0;i<a.length;i++){
            if(maximumNumber<a[i]){
                maximumNumber = a[i];
                a[i] = Integer.MIN_VALUE;
            }
        }
        return maximumNumber;
    }
    public static int secondMaximumNumber(int[] a){
        int maximumNumber = firstMax(a);
        int secondMax = Integer.MIN_VALUE;
        for(int i = 0;i<a.length;i++){
            if(a[i]==maximumNumber){
                a[i] = Integer.MIN_VALUE;
            }
        }
        secondMax = firstMax(a);
        return secondMax;
    }
    public static void main(String[] args) {
        int [] a = {9,4,5,3,1,3,7,8,9};
        System.out.println("Second Maximum Number: "+secondMaximumNumber(a));
    }
}
