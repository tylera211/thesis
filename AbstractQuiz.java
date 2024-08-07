

import java.util.Scanner;

public abstract class AbstractQuiz {

    // Class variables
    Question[] a;
    int c;

    // Returns a letter grade based on score (out of 100)
    public char grade(double score) {
        if(score > 90) return 'A';
        if(score > 80) return 'B';
        if(score > 70) return 'C';
        if(score > 60) return 'D';
        return 'F';
    }
}

    // Executes the console-based quiz by presenting the questions one at a time, listing the possible answers,
    // waiting for and accepting the user input, and displaying their score at the end
    public void run() {
        Scanner input = new Scanner(System.in);
        int userScore = 0;

        for(int i = 0; i < a.length; i++); {
            System.out.printf("Question #%d: ", i+1);
            System.out.println(a[i].question);
            for(int j = 0; j < a[i].answers.length; j++) {
                System.out.printf("%s) %s\n", (char) ('A' + j), a[i].answers[j]);
            }
            System.out.print("Please enter your answer: ");
            
            System.out.println();
        }

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        double score = ((double) userScore / c) * 100;
        System.out.printf("\nYour score: ");

        input.close();
    }

}
