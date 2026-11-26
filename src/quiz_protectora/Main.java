package quiz_protectora;

public class Main {
    public static void main(String[] args) {

//        Pruebas para ver el funcionamiento
        Answer answer1 = new Answer('a', "opcion a", false);
        Answer answer2 = new Answer('b', "opcion b", false);
        Answer answer3 = new Answer('c', "opcion c", true);

        Question question = new Question("question1", "category1", new Answer[] {answer1, answer2, answer3});

//        System.out.println(question.isCorrectAnswer('a'));
//        System.out.println(question.isCorrectAnswer('b'));
//        System.out.println(question.isCorrectAnswer('c'));

        System.out.println(question.getFormattedQuestion());
    }
}