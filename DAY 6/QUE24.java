package DAY6;
import java.util.Scanner;

public class QUE24 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in) ;
       System.out.println("Enter x.: ");
        int x = sc.nextInt() ;
              System.out.println("Enter y.: ");
        int y = sc.nextInt() ;
        
        int result = 1;
        
        
         for(int i=1; i<=y; i++) {
            result = result * x ;
        }
        System.out.println("Result: " + result);
        sc.close();
    }
    
}
