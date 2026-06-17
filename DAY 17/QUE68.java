package DAY17;
//FInding common elemnts of both the arrays.


public class QUE68 {
    
    public static void main(String[] args) {

        int[] arr1 = {10,20, 30,40, 50};
        int[] arr2 = {30, 40, 60,70};

        System.out.println("Common Elements:");

        for (int i = 0; i < arr1.length; i++) {
            //In second loop we travesre the second array and comapre it with 1st array to find a common elements in both the arrays
            //and print it only them , just like intersection.
            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                }
            }
        }
    }
}
    

