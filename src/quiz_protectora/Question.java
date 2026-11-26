package quiz_protectora;

public class Question {
    private String text;
    private String category;
    private Answer[] answers;

    public Question(String text, String category, Answer[] answers) {
        this.text = text;
        this.category = category;
        this.answers = answers;
    }

    public String getText() {
        return text;
    }

    public String getCategory() {
        return category;
    }

    public Answer[] getAnswers() {
        return answers;
    }

    public boolean isCorrectAnswer(char letter) {
        for (int i = 0; i < answers.length; i++) {
            if (answers[i].getLetter() == letter) {
                return answers[i].isCorrect();
            }
        }

        return false;
    }

    public String getFormattedQuestion() {
        String question = text;

        for(int i = 0; i < answers.length; i++) {
            question += "\n" + answers[i].getFormattedAnswer();
        }

        return question;
    }
}
