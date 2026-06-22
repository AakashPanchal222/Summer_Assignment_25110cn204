import java.util.Scanner;
//Count words in a sentence..

public class QUE86 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        int words = 1;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                // here the trick is that we count sapces b/w words..
                // so words would be sapce + 1 
                words++;
            }
        }

        System.out.println("Total Words = " + words);
        sc.close();
    }
}
    

