import java.util.Scanner;


public class QUE8 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
           int tem = n;// temporary variable for storing original value of n.
           int rev = 0;// for reversing..

           while (n>0){
            rev = rev*10 + (n%10);
            n= n/10;
           }
// condition..
           if (tem == rev){
            System.out.println("Palindrome");
           }
           else{
            System.out.println("no Palindrome");
           }
    }
    
}
