import java.util.Scanner;
// for armstrong no. check....
public class QUE15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("No. is: ");
        int n = sc.nextInt();

        int originalN = n; //original number for later comparison
        int temp = n;
        int digits = 0;
        int sum = 0;
        
        // digits count
        while (temp > 0) {
            temp /= 10;
            digits++;
        }

        temp = n; // reseting of original no. we do here..
         while (temp > 0) {
            int digit = temp % 10; //last digit
            sum += Math.pow(digit, digits); 
            temp /= 10; // removeing  last digit....
        }

        if (sum == originalN) {
            System.out.println(originalN + " is Armstrong no.");
        } else {
            System.out.println(originalN + " is not Armstrong no.");
        }

        sc.close();
    }
}