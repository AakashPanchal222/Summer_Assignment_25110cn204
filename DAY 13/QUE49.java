package DAY13;
import java.util.Scanner;
//Input and display array element..

public class QUE49 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //FOR ARRAY SIZE
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        // FOR ARRAY SIZE
        int arr[] = new int[n];

        System.out.println("Enter array element:");// FOR ARRAY ELEMENT
        for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
        }

        System.out.println("Array element:");// FOR DISPLAYING ARRAY ELEMENT
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
    

