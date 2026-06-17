package DAY17;
import java.util.Scanner;
//Merging two arrays..

public class QUE65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();

        int[] arr1 = new int[n1];

        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();

        int[] arr2 = new int[n2];

        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] merged = new int[n1 + n2];//A new bigger array..
    

        for (int i = 0; i < n1; i++) {
            merged[i] = arr1[i];// copying arr1 in new array
        }

        for (int i = 0; i < n2; i++) {
            merged[n1 + i] = arr2[i];// copying arr2 in new array
        }

        System.out.println("Merged Array:");
        for (int num : merged) {
            System.out.print(num + " ");
        }// printing new array..
        sc.close();
    }
}
