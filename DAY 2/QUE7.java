import java.util.Scanner;

public class QUE7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int pro = 1;
        while(n>0) {
            pro = pro * (n%10);
            n = n/10;
        }
        System.out.println(pro);   
        
        sc.close(); // to close scanner we use this.

    }

}