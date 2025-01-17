package recursion;

import java.util.Scanner;

public class PrintDecreasing {
    public static void printDecreasing(int x){
        if(x==1){
            System.out.println(1);
            return;
        }
        System.out.println(x);
        printDecreasing(x-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        printDecreasing(n);
    }
}
