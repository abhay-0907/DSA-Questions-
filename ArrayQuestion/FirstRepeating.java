public class FirstRepeating {
    public static int firstRepeatingValue(int[] a){
        for(int i = 0;i<a.length;i++){
            for(int j = i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    return a[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a = {1,5,3,4,3,6,4}; 
        int[] a1 = {1,2,4,6,7};
        System.out.println("First Repeating Value: "+firstRepeatingValue(a));
        System.out.println("First Repeating Value: "+firstRepeatingValue(a1));
    }
}
