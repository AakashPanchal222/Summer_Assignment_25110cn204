package DAY7;
import java.util.Scanner;
// recursive reverse no..
public class QUE28 {
    static void reverse(int n) {
        if (n == 1) {
            System.out.print(n);
            return;
        }
        System.out.print(n % 10);
        reverse(n / 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no: ");
        int n = sc.nextInt();

    System.out.print("reverse is: ");
        
    
        reverse(n);
        sc.close();
    }
}
