package DAY6;
 import java.util.Scanner;

public class QUE22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int binary = sc.nextInt();

        int decimal = 0;
        int power = 0;

        while (binary > 0) {
            int digit = binary % 10;
            decimal = decimal + digit * (int)Math.pow(2, power);

            power++;
            binary = binary / 10;
        }
        // for conevrting into decimal, we multiply 
        // the last digit with 2 raised to the power of its position and add it to the 
        // decimal value...

        System.out.println("Decimal = " + decimal);
        sc.close();
    }
}