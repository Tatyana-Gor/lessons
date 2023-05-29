import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        while (true) { // Бесконечный цикл
            System.out.println("Введите сообщение");
            String input = new Scanner(System.in).nextLine(); // Сканнер для ввода слов пользователем

            if(input.equals("Привет")) {
                System.out.println("Привет!");
            } else if(input.equals("Как дела?")) {
                System.out.println("Хорошо! А у тебя как?");
            } else {
                System.out.println("Не понимаю сообщение");
            }

            switch (input) {
                case "Привет": // условие if
                    System.out.println("Привет!");
                    break; // закрываем кейс
                case "Как дела?":
                    System.out.println("Хорошо! А у тебя как?");
                    break;
                default: // значение по умолчанию
                    System.out.println("Не понимаю сообщение");
            }
        }
    }
}
