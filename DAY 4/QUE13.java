import java.util.Scanner;
// for fibonacci series..

public class QUE13 {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the no. of terms: ");
    int n = sc.nextInt();

    int a = 0, b = 1, c;// herecis for next term.
    System.out.print("Fibonacci Series: ");

    for (int i = 1; i <= n; i++) {
        System.out.print(a + " ");
        c = a + b;  // for next term...

        a = b;
        b = c;
        
    }
    sc.close();
    
} 
    
}
