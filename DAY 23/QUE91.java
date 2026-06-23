import java.util.Scanner;
import java.util.Arrays;
//CHECK ANAGRAM STRING..
//Two strings are called anagrams if they contain the same letters with the same frequency, but the letters can be arranged in a different order.
public class QUE91 {

public class Q91 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Anagram Strings");
        } else {
            System.out.println("Not Anagram Strings");
        }
        sc.close();
    }
    
}
}
// SILENT,LISTEN
// HEART, EARTH
//ACT,CAT
