import java.util.Scanner;
// FOR CHECKING STRONG NO.
// STRONG NO. IS A NO WHICH IS EQUAL TO SUM OF FACTORIAL OF ITS DIGIT.
public class QUE18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter NO. ");
            int n = sc.nextInt();
                
            int sum = 0;
            int orino = n;
            while(n>0){
                int digit = n%10;
                
                int fact = 1;// CAlculating factorial..
            
                for (int i = 1; i <= digit; i++) {
                    fact = fact * i;
                }

                sum = sum + fact;
                n = n/10;   

                if(sum == orino){
                    System.out.println("Strong No. ");
                }
                else{
                    System.out.println("Not Strong No. ");
                }
              

                
    }
    sc.close();
}
    
}
