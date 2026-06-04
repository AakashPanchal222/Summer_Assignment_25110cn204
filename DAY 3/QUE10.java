import java.util.Scanner;
// dont forget to import scanner...

// to print prime no. range...
public class QUE10 {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lower no.:");
        int lower = sc.nextInt();
        System.out.println("Enter upper no.:");
        int upper = sc.nextInt();

        System.out.println("Prime no. bt " + lower + " and " + upper + "are:");
// for loop checking...
        for (int i = lower; i <= upper; i++) {
            boolean isPrime = true;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && i > 1) {
                System.out.print(i);// for printing , can give gap too...
            }
        }
        sc.close();
    }
}
