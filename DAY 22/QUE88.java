import java.util.Scanner;
//REMOVES SPACES FROM STRINGS..

public class QUE88 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {// check ifcurrent character is NOT a space thern keep it else skip..
                result += str.charAt(i);
            }
        }

        System.out.println("String without spaces = " + result);
        sc.close();
    }
}
    

