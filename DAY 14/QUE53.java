package DAY14;
import java.util.Scanner;
//LINEAR SEARCH.

public class QUE53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        boolean found = false;//THIS IS USED TO CHECK IF THE ELEMENT IS FOUND OR NOT. 
        // IT IS INITIALLY SET TO FALSE, AND IF THE ELEMENT IS FOUND, IT WILL BE SET TO TRUE.


        // LOOP TO SEARCH FOR THE ELEMENT IN THE ARRAY.
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {// HERE ! IS USED TO CHECK IF THE ELEMENT IS NOT FOUND IN THE ARRAY. 
        // IF FOUND IS FALSE, IT MEANS THE ELEMENT WAS NOT PRESENT IN THE ARRAY.
            System.out.println("Element not found");
        }

        sc.close();
    }
}
    

