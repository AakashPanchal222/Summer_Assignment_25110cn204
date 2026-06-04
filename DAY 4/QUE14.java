import java.util.Scanner;
 // nth fibo term...


 public class QUE14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the term no.: ");

        int n = sc.nextInt();
         
      int a = 0, b = 1, c;
        
      if (n == 1) {
            System.out.print(" First Fibo term: " +a);
        } 
        else if (n == 2) {
            System.out.print(" Second Fibo term: " +b);
        } 
        else {
            c = 0;// c is nth term..6
        
            for (int i = 3; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
                }
                System.out.print(" " +n+ "th Fibo term: " +c);
          }
        sc.close();
    
}
 }
