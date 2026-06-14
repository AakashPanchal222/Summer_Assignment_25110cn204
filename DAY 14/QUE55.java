package DAY14;
import java.util.Scanner;
//SECOND LARGEST ELEMENT IN AN ARRAY.

public class QUE55 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // VARIABLES TO STORE THE LARGEST AND SECOND LARGEST ELEMENTS.
        // here, Integer.MIN_VALUE IS USED TO INITIALIZE THE VARIABLES TO THE SMALLEST POSSIBLE INTEGER VALUE,
        // SO THAT ANY ELEMENT IN THE ARRAY WILL BE LARGER THAN THIS INITIAL VALUE.
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;


        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("Second Largest Element = " + secondLargest);

        sc.close();
    }
}
    

