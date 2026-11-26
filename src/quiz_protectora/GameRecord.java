package quiz_protectora;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GameRecord {
    private String username;
    private LocalDateTime endDateTime;
    private int correctAnswers;
    private int incorrectAnswers;
    private int bonus;

    public GameRecord(String username, LocalDateTime endDateTime, int correctAnswers, int incorrectAnswers, int bonus) {
        this.username = username;
        this.endDateTime = endDateTime;
        this.correctAnswers = correctAnswers;
        this.incorrectAnswers = incorrectAnswers;
        this.bonus = bonus;
    }

    public String getUsername() {
        return username;
    }

    public LocalDateTime getEndDateTime() {
        return endDateTime;
    }

    public int getCorrectAnswers() {
        return correctAnswers;
    }

    public int getIncorrectAnswers() {
        return incorrectAnswers;
    }

    public int getBonus() {
        return bonus;
    }

    DateTimeFormatter dateTimeFormatter =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    public String getFormattedRecord() {
        return ("Usuario: " + username + " | Fecha: " + endDateTime.format(dateTimeFormatter) + " | Correctas: " + correctAnswers + " | Incorrectas: " + incorrectAnswers + " | Bonus: " + bonus);
    }
}
