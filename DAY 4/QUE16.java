import java.util.Scanner;
// for armstrong no. in range check....

public class QUE16 {
    
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     System.out.print("Enter starting no.: ");
       int start = sc.nextInt();
     System.out.print("Enter ending no.: ");
      int end = sc.nextInt(); 


      System.out.println("Armstrong no. in range are: ");

        for (int n = start; n <= end; n++) {
            int originalN = n; //original number for later comparison
            int temp = n;
             int digits = 0;
              int sum = 0;
    
        while (temp > 0) {
                temp /= 10;
                digits++;
            }
    
            temp = n; 
             while (temp > 0) {
                int digit = temp % 10; //last digit
                 sum += Math.pow(digit, digits); 
                 temp /= 10; // removeing  last digit....
    }
    
        if (sum == originalN) {
            System.out.println(originalN);
        }
}
            sc.close();
}


}
