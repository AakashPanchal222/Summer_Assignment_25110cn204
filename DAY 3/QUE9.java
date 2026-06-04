import java.util.Scanner;
// check whether a givine no. is prime or not.

public class QUE9 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.:");
        int num = sc.nextInt();
        boolean isPrime = true; // here we take boolean variable for true and false...

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Prime");
        } 
        else {
            System.out.println("NotPrime");
        }
        sc.close();
    }
}
