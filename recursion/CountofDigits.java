package recursion;

import java.util.Scanner;

public class CountofDigits {
    static int countOfDigits(int n){
        if(n>=0&&n<=9){ //! base Case
            return 1;
        }
        return countOfDigits(n/10)+1; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        System.out.println("The number of digit in the "+n + " is = "+countOfDigits(n));
    }
}
