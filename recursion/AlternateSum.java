package recursion;

import java.util.Scanner;

public class AlternateSum {
    static int alternateSum(int n){
        if(n==0) return 0;
        if(n%2==1){
            return alternateSum(n-1) + n;
        }
        else{
            return alternateSum(n-1) - n;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        System.out.println(alternateSum(n));
    }
}
