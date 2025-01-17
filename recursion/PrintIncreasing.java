package recursion;
import java.util.Scanner;
public class PrintIncreasing {
    // printing all natural number 1 to n
    static void printIncreasing(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        printIncreasing(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        printIncreasing(n);
    }
}
