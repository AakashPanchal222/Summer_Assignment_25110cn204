package DAY19;
import java.util.Scanner;
// Matrics addition..

public class QUE73 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[2][2];
        int[][] b = new int[2][2];
        int[][] sum = new int[2][2];
        
        // loops to print and gey first matrics
        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // loop to get second matrics and print
        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        // loop to get third sum matrics..
        for (int i = 0; i < 2; i++) {//loop for rows
            for (int j = 0; j < 2; j++) {// loop for cocloumsn
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        // loop to pribnt sum matrics..
        System.out.println("Sum Matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
    

