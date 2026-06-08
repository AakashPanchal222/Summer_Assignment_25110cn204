//A
//AB
//ABC
//ABCD
//ABCDE

public class QUE31 {
    
    public static void main(String[] args) {
    int rows = 5;

        for (int i= 1; i<= rows;i++) {
        for (char ch = 'A'; ch < 'A' + i; ch++) {
        System.out.print(ch);
            }
            System.out.println();
        }
    }
}
    
