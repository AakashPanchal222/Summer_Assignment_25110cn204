package DAY13;
import java.util.Scanner;
//FINDING SUM AND AVERAGE OF ARRAY ELEMENTS..

public class QUE50 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        int sum = 0;

        System.out.println("Enter element:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];// FOR SUM..
        }

        double average = (double) sum / n;// FOR AVG...

        System.out.println("Sum = " +sum);// FOR PRINTIING SUM..
        System.out.println("Average = " + average);//FOR PRINTING AVG..
        sc.close();
    }
}

    

