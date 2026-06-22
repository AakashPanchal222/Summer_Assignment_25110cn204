import java .util.Scanner;
//CHARACTER FREQUENCY..
// means how many tike s spoecific letter a[pperas in a words]

public class QUE87 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter character to find frequency: ");
        char ch = sc.next().charAt(0);

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {//Is current character equal to the character user entered?
                count++;
            }
        }

        System.out.println("Frequency = " + count);
        sc.close();
    }
}
    

