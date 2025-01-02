

class PairSum{
    public static int twoPairSum(int[] a, int target){
        int ans = 0;
        for(int i = 0;i<a.length;i++){
            for(int j = i + 1;j<a.length;j++){
                if(a[i]+a[j]==target) ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] a = { 4,5,2,1,6,2};
        int target = 9; 
        System.out.println(twoPairSum(a, target));

    }
}