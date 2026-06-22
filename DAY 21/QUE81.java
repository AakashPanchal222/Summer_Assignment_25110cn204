import java.util.Scanner;
//Finding string lenght without length()..

public class QUE81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int count = 0;
         
        for (char _ : str.toCharArray()) {//this is a enhanced for loop
            // here in (char - ; str,to char array ) is used to seperate each ketter of string just like 
            // putten them in diffenrt boxes..
            count++;// here we incsre the count of each letter
        }

        System.out.println("Length of string = " + count);
        sc.close();
    }
}
