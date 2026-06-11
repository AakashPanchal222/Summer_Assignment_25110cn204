package DAY11;
import java.util.Scanner;


public class QUE43 {
    static boolean Prime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    } public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no.: ");
        int n = sc.nextInt();

        if (Prime(n)) {
            System.out.println(n + " is prime no.");  
            }
        else {
            System.out.println(n + " is not aprime no.");  
        }
        sc.close();
    }
    
}
