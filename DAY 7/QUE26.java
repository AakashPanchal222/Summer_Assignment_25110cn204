package DAY7;
import java.util.Scanner;

// RECURSIVE FIBONACCI SERIES..

public class QUE26 {

    static int fibonacci(int n) {
        if (n <= 1) {
        return n;// function for recursive fibonaccci...
 }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args) {// main class..
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of terms: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        sc.close();
        
    }
    
}
