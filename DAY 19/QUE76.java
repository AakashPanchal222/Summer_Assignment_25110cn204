package DAY19;
import java.util.Scanner;
// Diagonal Sum..

public class QUE76 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[3][3];
        int sum = 0;

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            sum = sum + matrix[i][i];
            // matrics [i][i] = [0][0],[1][1],[2][2]..
        }

        System.out.println("Diagonal Sum = " + sum);
        sc.close();
    }
}
    

