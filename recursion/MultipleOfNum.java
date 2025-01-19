package recursion;

import java.util.Scanner;

public class MultipleOfNum {
    static void multipleOfNum(int n, int k){
        if(k==0) return;
        multipleOfNum(n, k-1);
        System.out.print(n*k+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        System.out.println("Enter the multiple of number: ");
        int k = sc.nextInt();
        multipleOfNum(n, k);
    }
}
