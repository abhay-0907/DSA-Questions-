package recursion;

import java.util.Scanner;

public class Fibonacci {
    static int fibbonacci(int n){
        if(n==0 || n==1) return n;
        int ans = fibbonacci(n-1) + fibbonacci(n-2);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth term ");
        int n = sc.nextInt();
        System.out.println("The "+ n +"th term of Fibbonacci series is: "+ fibbonacci(n));   
    }
}
