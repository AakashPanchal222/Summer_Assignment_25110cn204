package DAY7;
import java.util.Scanner;
// recursive factorial...
public class QUE25 {

//formula for factorial
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
            }        }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        System.out.println("Enter x.: ");
        int x = sc.nextInt() ;
        System.out  .println("Factorial of " + x + " is: " + factorial(x));
        sc.close();
    }
}
