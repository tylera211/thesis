

public class Question {

    // Class variables
    int points;
    String question;
    String[] answers;
    char correctAnswer;
    char selectedAnswer;

    public Question(int points, String question, String[] answers, char correctAnswer) {
        points = points;
        question = question;
        answers = answers;
        correctAnswer = correctAnswer;
    }

}