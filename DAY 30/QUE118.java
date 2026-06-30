import java.util.Scanner;
//Mini Library Sytem..

public class QUE118 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] books = {
                "Java",
                "Python",
                "C++",
                "HTML",
                "Data Structures"
        };

        boolean found = false;

        System.out.print("Enter book name to search: ");
        String search = sc.nextLine();

        for (int i = 0; i < books.length; i++) {

            if (books[i].equalsIgnoreCase(search)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Book is available.");
        } else {
            System.out.println("Book is not available.");
        }

        sc.close();
    }
}
    

