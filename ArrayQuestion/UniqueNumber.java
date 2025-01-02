public class UniqueNumber {
    public static int uniqueNumber(int[] a){
        int number = -1;
        for(int i = 0;i<a.length;i++){
            for(int j = i+1;j<a.length;j++){
                if(a[i] == a[j]){
                    a[i] = -1;
                    a[j] = -1;
                }
            }
        }
        for(int i = 0;i<a.length;i++){
            if(a[i]>-1){
                number = a[i];
            }
        }
        return number;
    }
    public static void main(String[] args) {
        int[] a = {1,3,2,0,2,1,3};
        System.out.println("Unique Number: "+uniqueNumber(a));
    }
}
