package DAY12;
import java.util.Scanner;


public class QUE46 {

    static boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum = sum + (digit * digit * digit);
            num = num / 10;
        }

        return original == sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a no: ");
        int num = sc.nextInt();

        if (isArmstrong(num))
            System.out.println("Armstrong No");
        else
            System.out.println("Not an Armstrong NO");
        sc.close();
    }
}
    

