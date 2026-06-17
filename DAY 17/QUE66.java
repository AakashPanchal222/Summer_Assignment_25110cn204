package DAY17;
import java.util.Scanner;
// Union of two arrays..

public class QUE66 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};

        System.out.println("Union Elements:");

        // Print ing  all elements of first arr..
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        // Printing only new elements from second arr..
        for (int i = 0; i < arr2.length; i++) {
            boolean found = false;

            for (int j = 0; j < arr1.length; j++) {//checking if any element in array is present in both arrays..
                if (arr2[i] == arr1[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.print(arr2[i] + " ");
            }
        }
        sc.close();
    }
}
    

