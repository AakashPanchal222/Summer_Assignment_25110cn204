import java.util.Scanner;
//QUIZ APPLICATION..
public class QUE104 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int score = 0;
        int answer;

        System.out.println("===== JAVA QUIZ =====");

        System.out.println("\nQ1. Java was developed by?");
        System.out.println("1. James Gosling");
        System.out.println("2. Dennis Ritchie");
        System.out.println("3. Bjarne Stroustrup");
        System.out.print("Answer: ");
        answer = sc.nextInt();

        if (answer == 1)
            score++;

        System.out.println("\nQ2. Which keyword is used to create an object?");
        System.out.println("1. class");
        System.out.println("2. new");
        System.out.println("3. object");
        System.out.print("Answer: ");
        answer = sc.nextInt();

        if (answer == 2)
            score++;

        System.out.println("\nQ3. Java is?");
        System.out.println("1. Platform Independent");
        System.out.println("2. Platform Dependent");
        System.out.println("3. None");
        System.out.print("Answer: ");
        answer = sc.nextInt();

        if (answer == 1)
            score++;

        System.out.println("\nYour Score = " + score + "/3");

        if (score == 3)
            System.out.println("Excellent!");
        else if (score == 2)
            System.out.println("Good Job!");
        else
            System.out.println("Keep Practicing!");

        sc.close();
    }
}

