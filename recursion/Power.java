package recursion;

import java.util.Scanner;

public class Power {
    static int pow(int p, int q){
        if(q==0) return 1; //! Base Case
        return pow(p, q-1) * p; //! Recursive Case

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int p = sc.nextInt();
        System.out.println("Enter the power: ");
        int q = sc.nextInt();
        System.out.println("Answer: "+pow(p,q));
        sc.close();
    }
}
