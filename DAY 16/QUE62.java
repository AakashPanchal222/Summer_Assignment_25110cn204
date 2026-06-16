package DAY16;
import java.util.Scanner;
//FINDING MAX. FREQUECY NO.


public class QUE62 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxFreq = 0;// variable to store the value of frequecy..
    
        int element = arr[0];// variable to store the element with max freq...

        for (int i = 0; i < n; i++) {
            int count = 0;// counter to travesre the array..

            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > maxFreq) {// to cahnge if the frequecy of a n no. changes...
                maxFreq = count;
                element = arr[i];
            }
        }

        System.out.println("Element with Maximum Frequency = " + element);
        System.out.println("Frequency = " + maxFreq);
        sc.close();
    }
}
// to ask if there is no duoble element in the array, then how to write the code.

