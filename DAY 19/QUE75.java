package DAY19;
import java.util.Scanner;
// Transpose of matrics..

public class QUE75 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[3][3];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        // this just requires cange in printing setings
        System.out.println("Transpose Matrix:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[j][i] + " ");// change in j and i elemnts..
            }
            System.out.println();
        }
        sc.close();
    }
}
    

