package quiz_protectora;

public class Answer {
    private char letter;
    private String text;
    private boolean correct;

    public Answer(char letter, String text, Boolean correct) {
        this.letter = letter;
        this.text = text;
        this.correct = correct;
    }

    public char getLetter() {
        return letter;
    }

    public String getText() {
        return text;
    }

    public Boolean isCorrect() {
        return correct;
    }
}
