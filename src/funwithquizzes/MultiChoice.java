package funwithquizzes;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiChoice extends Question {

    private ArrayList<String> possibleAnswers;
    private int correctAnswer;

    public MultiChoice (int pointValue, String text, int correctAnswer, ArrayList<String> possibleAnswers) {
        super(pointValue, text);
        this.correctAnswer = correctAnswer;
        this.possibleAnswers = possibleAnswers;
        setPointValue(1);
    }

    @Override
    public void displayAnswers () {
        for (int i = 0; i < possibleAnswers.size(); i++) {
            System.out.println(possibleAnswers.get(i));
        }
    }

    public boolean isCorrectAnswer (int possibleAnswer) {
        if (possibleAnswer == correctAnswer) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public int getAnswers () {
        Scanner answer = new Scanner(System.in);
        System.out.println("What will your answer be? Enter the number of the option you believe is correct.");
        String userAnswer = answer.nextLine();
        int result = Integer.parseInt(userAnswer);
        if (isCorrectAnswer(result)) {
            return 1;
        }
        else {
            return 0;
        }
    }

}
