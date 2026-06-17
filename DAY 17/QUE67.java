package DAY17;
//Intersection of arrays..

public class QUE67{
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        System.out.println("Intersection Elements:");

        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr2.length; j++) {
                

                //Printing only those elemets which are common in both the arrays.
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    break;
                }
            }
        } 
    }
}
    

