import java.util.Scanner;

class Question {
    private String question;
    private String answer;

    public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public boolean answerCorrect(String userAnswer) {
        return userAnswer.toLowerCase().equals(answer.toLowerCase());
    }
}

public class Quiz {
    int MAX_QUESTIONS = 25;
    Question[] questions;
    int current, correctAns, incorrectAns;

    public Quiz() {
        questions = new Question[MAX_QUESTIONS];
        current = 0;
        correctAns = 0;
        incorrectAns = 0;
    }

    public void add(Question newQuestion) {
        if (current < MAX_QUESTIONS)
            questions[current++] = newQuestion;
    }

    public void giveQuiz() {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < current; i++) {
            System.out.println(questions[i].getQuestion());
            if (questions[i].answerCorrect(scan.nextLine()))
                correctAns++;
            else
                incorrectAns++;
        }
    }

    public int getNumCorrect() {
        return correctAns;
    }

    public int getNumIncorrect() {
        return incorrectAns;
    }

    public static void main(String[] args) {
        Quiz q = new Quiz();

        q.add(new Question("What is the average temperature of the human body?", "37 C"));
        q.add(new Question("What does RGB stand for?", "Red, Green, Blue"));
        q.add(new Question("What is the most abundant element in the universe?", "Hydrogen"));
        q.add(new Question("What is the name of WALL-Es companion?", "EVA"));
        q.add(new Question("How many strings are there on a guitar?", "Six"));
        q.add(new Question("How many sides does a scutoid have?", "Six"));

        q.giveQuiz();

        System.out.print("\nYou have got "+ q.getNumCorrect()  + " questions correct");
        System.out.println("\nYou have got " + q.getNumIncorrect() + " questions incorrect");
    }
}


// this program was written with help from example programs provided in an email.
// necessary classes to complete the program were; quiz, add, givequiz and the main class which provides the question and answers from the established array Question[] questions
// i provided the class question to instantiate the questions and answers as strings which would subsequently be used in the main class.
// i made minor changes to the code such as renaming variables to aid my understanding of the program and differ it from the examples.
