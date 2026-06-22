import java.util.Scanner;
//CHECK PALINDROM STRING..
public class QUE85 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        if (str.equals(reverse)) {// this is used to comapre both if revese is equalst to niramla
            System.out.println("Palindrome String");
        } else {
            System.out.println("Not a Palindrome String");
        }
        sc.close();
    }
}
