import java.util.Scanner;
// for finding perfect no. 
// perfect no is a no. which is equal to sum of its divisor except itslf.
public class QUE17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter NO. ");
         int n = sc.nextInt();
            int sum = 0;
            
            // thid loop is for finding the all divisor smaller than no..
            for (int i = 1; i <= n; i++) {
            if(n%i==0){
                sum = sum + i;
            }

            if(sum==n){
                System.out.println("PerfectNo. ");
            }
            else{
                System.out.println("Not Perfect No. ");
                    }
                    sc.close();
    }
    }
}