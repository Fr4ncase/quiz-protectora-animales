package quiz_protectora;

import java.util.ArrayList;
import java.util.Collections;

public class QuestionBank {
    private static final int TOTAL_QUESTIONS = 40;
    private static final String NAME_CATEGORY_1 = "Cuidados diarios de tu mascota";
    private static final String NAME_CATEGORY_2 = "Adopción y tenencia responsable";
    private Question[] questions = new Question[TOTAL_QUESTIONS];
    private String[] categories = {NAME_CATEGORY_1, NAME_CATEGORY_2};

    public QuestionBank() {
        loadQuestions();
    }

    public String[] getCategories() {
        return categories;
    }

    private Question createQuestion(String text, String category, String optionA, String optionB, String optionC, char correctLetter) {
        Answer answerA = new Answer('a', optionA, 'a' == correctLetter);
        Answer answerB = new Answer('b', optionB, 'b' == correctLetter);
        Answer answerC = new Answer('c', optionC, 'c' == correctLetter);

        return new Question(text, category, new Answer[] {answerA, answerB, answerC});
    }

    private void loadQuestions() {
        // Categoria 1
        questions[0] = createQuestion("¿Qué debe tener siempre disponible tu mascota?", NAME_CATEGORY_1,
                "Leche de vaca", "Agua fresca y limpia", "Refrescos", 'b');
        questions[1] = createQuestion("¿Cuántas veces al día necesita salir a pasear un perro adulto?", NAME_CATEGORY_1,
                "Varias veces al día", "Una vez a la semana", "Solo cuando ladra", 'a');
        questions[2] = createQuestion("¿Cuál de estos alimentos es peligroso para perros y gatos?", NAME_CATEGORY_1,
                "Chocolate", "Arroz cocido sin sal", "Zanahoria", 'a');
        questions[3] = createQuestion("¿Cada cuánto conviene llevar a tu mascota al veterinario, aunque esté sana?", NAME_CATEGORY_1,
                "Solo cuando se pone enferma", "Al menos una vez al año", "Cada cinco años", 'b');
        questions[4] = createQuestion("¿Para qué sirven las vacunas?", NAME_CATEGORY_1,
                "Para que engorde", "Para protegerla de enfermedades graves", "Para que crezca más rápido", 'b');
        questions[5] = createQuestion("¿Qué es el microchip de una mascota?", NAME_CATEGORY_1,
                "Un juguete electrónico", "Un collar con luces", "Un dispositivo pequeño que se pone bajo la piel y sirve para identificarla", 'c');
        questions[6] = createQuestion("¿Qué debes hacer con las cacas de tu perro en la calle?", NAME_CATEGORY_1,
                "Recogerlas y tirarlas a la papelera", "Dejarlas, porque el viento se las lleva", "Taparlas con hojas", 'a');
        questions[7] = createQuestion("¿Cómo debes cepillar el pelo de tu mascota?", NAME_CATEGORY_1,
                "Nunca, no hace falta", "Con un cepillo adecuado y de forma regular", "Con mucha fuerza para quitar todo el pelo", 'b');
        questions[8] = createQuestion("¿Cuánta comida debes darle a tu mascota?", NAME_CATEGORY_1,
                "Toda la que pida", "Lo que sobre de nuestra comida", "La cantidad que indiquen el envase y el veterinario", 'c');
        questions[9] = createQuestion("¿Qué necesita un gato para cuidarse las uñas?", NAME_CATEGORY_1,
                "Un sofá", "Una alfombra de baño", "Un rascador", 'c');
        questions[10] = createQuestion("¿Cada cuánto debe limpiarse el arenero de un gato?", NAME_CATEGORY_1,
                "A diario, retirando lo sucio", "Una vez al mes", "Cada tres meses", 'a');
        questions[11] = createQuestion("¿Qué debes hacer si tu mascota pasa mucho calor en verano?", NAME_CATEGORY_1,
                "Dejarla en el coche con la ventanilla un poco abierta", "Hacerla correr al mediodía", "Darle agua fresca y ofrecerle sombra y un sitio fresco", 'c');
        questions[12] = createQuestion("¿Por qué es importante jugar con tu mascota?", NAME_CATEGORY_1,
                "Para que haga ejercicio y no se aburra", "Para que se vuelva agresiva", "Solo para hacerle fotos", 'a');
        questions[13] = createQuestion("¿Qué es la esterilización?", NAME_CATEGORY_1,
                "Una limpieza de dientes", "Una operación que evita que tenga crías no deseadas", "Un baño especial", 'b');
        questions[14] = createQuestion("¿Cómo debe salir a la calle un perro?", NAME_CATEGORY_1,
                "Con correa y bajo control", "Suelto, aunque haya coches", "Con un abrigo", 'a');
        questions[15] = createQuestion("¿Cuántas horas duerme al día, aproximadamente, un gato adulto?", NAME_CATEGORY_1,
                "Entre 2 y 4 horas", "Unas 6 horas", "Entre 12 y 16 horas", 'c');
        questions[16] = createQuestion("¿Qué debes hacer si tu mascota deja de comer o se comporta de forma rara?", NAME_CATEGORY_1,
                "Esperar un mes a ver qué pasa", "Llamar o llevarla al veterinario", "Darle más premios", 'b');
        questions[17] = createQuestion("¿Cuál es la mejor forma de premiar a tu perro cuando hace bien una orden?", NAME_CATEGORY_1,
                "Gritarle", "Castigarle", "Darle un premio o caricias en ese momento", 'c');
        questions[18] = createQuestion("¿Cada cuánto debe desparasitarse una mascota?", NAME_CATEGORY_1,
                "Siguiendo el calendario que indique el veterinario", "Una vez en la vida", "Solo en verano", 'a');
        questions[19] = createQuestion("¿Dónde debe dormir tu mascota?", NAME_CATEGORY_1,
                "En el balcón, sin protección", "En cualquier sitio, da igual", "En un lugar tranquilo, cómodo y resguardado del frío", 'c');
        // Categoria 2
        questions[20] = createQuestion("¿Qué es mejor para reducir el número de animales abandonados?", NAME_CATEGORY_2,
                "Comprar un cachorro por internet a alguien que no conoces", "Dejar que tengan muchas crías", "Adoptar un animal de una protectora", 'c');
        questions[21] = createQuestion("Tener una mascota es...", NAME_CATEGORY_2,
                "Un regalo para pasar la Navidad", "Un juguete que se deja cuando aburre", "Un compromiso para muchos años", 'c');
        questions[22] = createQuestion("¿Cuánto puede vivir un perro o un gato?", NAME_CATEGORY_2,
                "Muchos años, normalmente entre 10 y 20", "Hasta 2 años", "Hasta 5 años", 'a');
        questions[23] = createQuestion("¿Qué debes pensar antes de adoptar una mascota?", NAME_CATEGORY_2,
                "Si tienes tiempo, espacio y dinero para cuidarla", "Solo si es bonita", "Si su color combina con el sofá", 'a');
        questions[24] = createQuestion("¿Qué debes hacer si ya no puedes cuidar a tu mascota?", NAME_CATEGORY_2,
                "Abandonarla", "Buscar una solución responsable, como una familia o una protectora", "Soltarla lejos de casa", 'b');
        questions[25] = createQuestion("Abandonar a un animal es...", NAME_CATEGORY_2,
                "Algo permitido si no te ve nadie", "Un delito castigado por la ley", "Solo una falta de educación", 'b');
        questions[26] = createQuestion("¿Qué es una protectora de animales?", NAME_CATEGORY_2,
                "Una organización que cuida animales abandonados y les busca un hogar", "Una tienda de animales", "Un zoo", 'a');
        questions[27] = createQuestion("¿Cómo es una adopción responsable?", NAME_CATEGORY_2,
                "Se entrega el animal sin hacer preguntas", "Se vende al mejor postor", "Se conoce a los adoptantes, se firma un contrato y se hace seguimiento", 'c');
        questions[28] = createQuestion("¿Por qué ayuda la esterilización a reducir los abandonos?", NAME_CATEGORY_2,
                "Porque evita camadas no deseadas", "Porque hace que ladren más", "Porque así no necesitan veterinario", 'a');
        questions[29] = createQuestion("¿Qué gastos tiene una mascota, además de la comida?", NAME_CATEGORY_2,
                "Ninguno", "Solo el collar", "Veterinario, vacunas, cuidados y accesorios", 'c');
        questions[30] = createQuestion("¿Quién debe estar de acuerdo antes de que llegue una mascota a casa?", NAME_CATEGORY_2,
                "Solo el niño que la pide", "Toda la familia que va a convivir con ella", "El vecino", 'b');
        questions[31] = createQuestion("¿Qué ventaja tiene adoptar un animal adulto?", NAME_CATEGORY_2,
                "Siempre es agresivo", "No necesita ningún cuidado", "Su carácter ya se conoce, y es más fácil elegir uno que encaje contigo", 'c');
        questions[32] = createQuestion("¿Puede un animal adoptado ser un buen compañero?", NAME_CATEGORY_2,
                "No, solo los que vienen de un criador", "Sí, muchos son cariñosos y agradecidos", "Solo si es de raza", 'b');
        questions[33] = createQuestion("¿Qué debes hacer cuando llega un animal nuevo a casa?", NAME_CATEGORY_2,
                "Obligarlo a jugar con todos desde el primer minuto", "Dejarlo solo, sin supervisión", "Darle tiempo para adaptarse, con paciencia y un lugar tranquilo", 'c');
        questions[34] = createQuestion("¿Por qué no es buena idea regalar una mascota por sorpresa?", NAME_CATEGORY_2,
                "Porque quien la recibe quizá no pueda o no quiera cuidarla", "Porque los animales se asustan con los paquetes", "Porque nadie sabe cuidar a un animal que ha recibido de regalo", 'a');
        questions[35] = createQuestion("¿Qué significa tenencia responsable?", NAME_CATEGORY_2,
                "Tener al animal solo mientras es cachorro", "Cuidar al animal durante toda su vida y respetar a los demás", "Dejarlo salir sin control", 'b');
        questions[36] = createQuestion("¿Qué debe llevar tu mascota para poder encontrarla si se pierde?", NAME_CATEGORY_2,
                "Un lazo de colores", "Un microchip y una identificación", "Nada, ella sabe volver", 'b');
        questions[37] = createQuestion("¿Cómo puedes ayudar a una protectora si no puedes adoptar?", NAME_CATEGORY_2,
                "Siendo voluntario, donando o difundiendo sus animales", "No se puede ayudar de ninguna forma", "Dejando animales en su puerta", 'a');
        questions[38] = createQuestion("¿Los animales sienten dolor y emociones?", NAME_CATEGORY_2,
                "Sí, tienen necesidades y emociones, y merecen respeto", "No, son como objetos", "Solo los perros", 'a');
        questions[39] = createQuestion("¿Qué debes hacer antes de elegir una mascota?", NAME_CATEGORY_2,
                "Elegirla solo por su aspecto", "Pedir la primera que veas", "Informarte sobre sus necesidades y su carácter", 'c');
    }

    public ArrayList<Question> getQuestionsByCategory(String category) {
        ArrayList<Question> categoryQuestions = new ArrayList<>();

        for (int i = 0; i < questions.length; i++) {
            if (questions[i].getCategory().equals(category)) {
                categoryQuestions.add(questions[i]);
            }
        }

        return categoryQuestions;
    }

    public ArrayList<Question> getRandomQuestions(String category, int amount) {
        ArrayList<Question> categoryQuestions = getQuestionsByCategory(category);
        ArrayList<Question> randomQuestions = new ArrayList<>();
        Collections.shuffle(categoryQuestions);

        for (int i = 0; i < amount; i++) {
            randomQuestions.add(categoryQuestions.get(i));
        }

        return randomQuestions;
    }

}
