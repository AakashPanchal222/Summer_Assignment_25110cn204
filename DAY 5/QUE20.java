import java.util.Scanner;

public class QUE20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter NO. ");
        int n = sc.nextInt();

        int orino =n;
        int largestPF = -1;
         
        
        while (n % 2 == 0) {// here we divivde by 2 to remove all even factors..
            largestPF = 2;
            n /= 2;
          }

          for (int i = 3; i <= Math.sqrt(n); i += 2) {// here by 3.. for odds..
            while (n % i == 0) {
              largestPF = i;
              n /= i;
            }
          }

          // remaining no. would be prime if its bigger than 2..
          if (n > 2) {
            largestPF = n;
          }
          System.out.println("The largest prime factor of " + orino + " is: " + largestPF);
          sc.close();
    }
}
