package DAY7;
import java.util.Scanner;

public class QUE27 {
    static int sum(int n) {
        if (n == 0 ) {
            return 0;// function for recursive sum of n natural numbers...

        }
        return (n%10) + sum(n/10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
           int n =sc.nextInt();

        
        System.out.println("The sum of the digits is: " + sum(n));
        sc.close();
    }
    
}
