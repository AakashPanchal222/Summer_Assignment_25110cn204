package DAY6;
import java.util.Scanner;


public class QUE21 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal no.: ");
        double decimal = sc.nextDouble();
       
        String binary = "";
        while (decimal > 0) {
            int remainder = (int)(decimal % 2);
            binary = remainder + binary;
            decimal = decimal / 2;

        
        }
        System.out.println("Binary: " + binary);
        sc.close();
    }
    
}
