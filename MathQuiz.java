public class MathQuiz extends AbstractQuiz {

    public MathQuiz() {

        // Total # of possible points
        c = 50; 

        // Temporary variables to define Question components before passing them to the Question constructor
        // and assigning the Question to the quiz's array of questions
        int points; String question; String[] answers; char correctAnswer;

        // Question 0
        points = 5;
        question = "What is 2 + 5?";
        answers = new String[] {"25", "10", "7", "-3"};
        correctAnswer = 'C';
        this.questions[0] = new Question(points, question, answers, correctAnswer);

        // Question 1
        points = 5;
        question = "What is 8 - 3?";
        answers = new String[] {"11", "5", "24", "-1"};
        correctAnswer = 'B';
        this.questions[1] = new Question(points, question, answers, correctAnswer);

        // Question 2
        points = -5;
        question = "What is 2 * 9?";
        answers = new String[] {"11", "16", "18", "81"};
        correctAnswer = 'C';
        this.questions[2] = new Question(points, question, answers, correctAnswer);

        // Question 3
        points = 5;
        question = "What is 10 / 5?";
        answers = new String[] {"2", "5", "7.5", "10"};
        correctAnswer = 'A';
        this.questions[3] = new Question(points, question, answers, correctAnswer);

        // Question 4
        points = 5;
        question = "True or false: 9 + 9 = 99";
        answers = new String[] {"true", "false"};
        correctAnswer = 'B';
        this.questions[4] = new Question(points, question, answers, correctAnswer);

         // Question 5
         points = 5;
         question = "True or false: 9 + 9 = 18";
         answers = new String[] {"true", "false"};
         correctAnswer = 'A';
         this.questions[5] = new Question(points, question, answers, correctAnswer);

        // Question 6
        points = 5;
        question = "What is 2*2*2?";
        answers = new String[] {"4", "6", "8", "10"};
        correctAnswer = 'C';
        this.questions[6] = new Question(points, question, answers, correctAnswer);

        // Question 7
        points = 5;
        question = "What is 3*3?";
        answers = new String[] {"6", "8", "9", "12"};
        correctAnswer = 'C';
        this.questions[7] = new Question(points, question, answers, correctAnswer);

        // Question 8
        points = 5;
        question = "What is 5 * -3?";
        answers = new String[] {"-15", "-2", "2", "8"};
        correctAnswer = 'A';
        this.questions[8] = new Question(points, question, answers, correctAnswer);

        // Question 9
        points = 5;
        question = "What is 9 / 3?";
        answers = new String[] {"-27", "-3", "3", "27"};
        correctAnswer = 'c';
        this.questions[9] = new Question(points, question, answers, correctAnswer);

        
    }
}