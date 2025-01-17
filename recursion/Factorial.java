package  recursion;
import java.util.Scanner;

public class Factorial {
    public static int factorial(int x){
        if(x==0)return 1; //! Base Case
        int ans = factorial(x-1) * x; //! Sub Problem 
        return ans; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        System.out.println("Factorial of number " + n +" is " + factorial(n));
        sc.close();   
    }
}
