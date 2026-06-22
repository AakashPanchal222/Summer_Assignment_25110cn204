import java.util.Scanner;
public class QUE84 {
   // Counting lowercase to uppercase..
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter lowercase string: ");
        String str = sc.nextLine();

        String upper = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
                //Thid line converts lowercase to uppercase
            }

            upper += ch;
        }

        System.out.println("Uppercase String = " + upper);
        sc.close();
    }
}
    // a=97,b=98,c=99...
    // A=65,B=66,C=67...
    //DIFFERECE = 97-65=32..
    //SP a-32 =A ETC..

