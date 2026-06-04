import java.util.Scanner;
// LCM...

public class QUE12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.1:");
        int n1 = sc.nextInt();
        System.out.println("Enter no.2:");
           int n2 = sc.nextInt();
        int gcd = 1; 
        for (int i= 1; i<= n1 && i<=n2; i++) {
            if (n1% i == 0 && n2 %i == 0) {
            gcd = i;// for updating gcd..
            }
        }

        // lcm formula
        int lcm = (n1 * n2) / gcd;
        System.out.println("lcm is: " + lcm);
        sc.close(); 
    }
}
