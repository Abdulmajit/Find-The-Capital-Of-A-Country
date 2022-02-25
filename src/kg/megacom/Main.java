package kg.megacom;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        // Кыргызстан:{бишкек: true,лондон: false}

        Map<String, Boolean> answers = new HashMap<>();
        answers.put("Бишкек", true);
        answers.put("Лондон", false);
        answers.put("париж", false);

        Map<String, Map<String, Boolean>> questions = new HashMap<>();
        questions.put("Кыргызстан", answers);

        for (Map.Entry<String, Map<String, Boolean>> item: questions.entrySet()){
            System.out.println("Столица " + item.getKey());

            Map<String, Boolean> innerMap = item.getValue();
            int row = 1;
            for (Map.Entry<String, Boolean> innerItem: innerMap.entrySet()) {
                System.out.println(row +". "+innerItem.getKey());
                row++;
            }
            System.out.print("Введите название столицы: ");
            String userAnswer = sc.next();

            Boolean value = innerMap.get(userAnswer);
            String answerText = value ? "Верно" : "Неверно";
            System.out.println(answerText);
        }

        /*
            Столица Кыргызстан
            1. Бишкек
            2. Лондон
            3. Париж

            Ответ: Париж

            Неверно!

            10 - 100%

        * */


    }
}
