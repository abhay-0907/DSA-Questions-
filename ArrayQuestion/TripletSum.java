class TripletSum{
    public static int threePairSum(int[] a, int target){
        int ans = 0;
        for(int i = 0;i<a.length;i++){
            for(int j = i+1;j<a.length;j++){
                for(int k = j+1;k<a.length;k++){
                    if(a[i]+a[j]+a[k]==target) ans++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int a[] = {1,4,5,6,3};
        int target = 12;
        System.out.println(threePairSum(a, target));
    }
}