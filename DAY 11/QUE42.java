package DAY11;
import java.util.Scanner;

public class QUE42 {
    static int max(int a, int b) {
        if (a>b) {
            return a;
        } else {
            return b;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first no.: ");
        int a =sc.nextInt();
        System.out.print("Enter second no.: ");
        
        int b = sc.nextInt();
        
        System.out.println("Max: " + max(a, b));
        sc.close();
    
    }
    
}
