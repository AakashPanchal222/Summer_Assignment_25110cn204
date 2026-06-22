import java.util.Scanner;
// REVERSING A STRING..
public class QUE82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {// here we are using length-1 as  i i.e. taking laST INDEX
            reverse += str.charAt(i);//Take current character and add it to reverse string.
        }

        System.out.println("Reversed String = " + reverse);
        sc.close();
    }
}
    
