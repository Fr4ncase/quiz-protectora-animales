package quiz_protectora;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        Pruebas para ver el funcionamiento
//        Answer answer1 = new Answer('a', "opcion a", false);
//        Answer answer2 = new Answer('b', "opcion b", false);
//        Answer answer3 = new Answer('c', "opcion c", true);
//
//        Question question = new Question("question1", "category1", new Answer[] {answer1, answer2, answer3});
//
//        System.out.println(question.isCorrectAnswer('a'));
//        System.out.println(question.isCorrectAnswer('b'));
//        System.out.println(question.isCorrectAnswer('c'));
//
//        System.out.println(question.getFormattedQuestion());
//
//        GameRecord gameRecord1 = new GameRecord("Franco", LocalDateTime.now(), 18, 2, 100);
//
//        System.out.println(gameRecord1.getFormattedRecord());
        QuestionBank qb = new QuestionBank();
        String[] categories = qb.getCategories();

        System.out.println(qb.getQuestionsByCategory(categories[0]).size());
        System.out.println(qb.getQuestionsByCategory(categories[1]).size());

        ArrayList<Question> five = qb.getRandomQuestions(categories[0], 5);
        for (int i = 0; i < five.size(); i++) {
            System.out.println(five.get(i).getFormattedQuestion());
            System.out.println();
        }


    }
}