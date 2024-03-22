import java.util.Scanner;

public class MultiplicationTableExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int score = 0;
            for (int i = 0; i < 10; i++) {
                int factor1 = (int) (Math.random() * 10) + 1;
                int factor2 = (int) (Math.random() * 10) + 1;
                System.out.println("What is " + factor1 + " * " + factor2 + "?");
                int answer = scanner.nextInt();

                if (answer == factor1 * factor2) {
                    System.out.println("Correct.");
                    score++;
                } else {
                    System.out.println("That is wrong. The correct answer is " + (factor1 * factor2) + ".");
                }
            }

            System.out.println("Score: " + score);

            if (score == 10) {
                System.out.println("Congrats. You know your stuff.");
                break;
            } else {
                System.out.println("Let's try again.");
            }
        }
    }
}

