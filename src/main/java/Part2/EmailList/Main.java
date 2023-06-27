package Part2.EmailList;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static final String WRONG_EMAIL_ANSWER = "Неверный формат email";

    static EmailList emailList = new EmailList();

    
    /* TODO:
        Пример вывода списка Email, после ввода команды LIST в консоль:
        test@test.com
        hello@mail.ru
        - каждый адрес с новой строки
        - список должен быть отсортирован по алфавиту
        - email в разных регистрах считается одинаковыми
           hello@yandex.ru == HeLLO@YANdeX.RU
        - вывод на печать должен быть в нижнем регистре
           hello@yandex.ru
        Пример вывода сообщения об ошибке при неверном формате Email:
        "Неверный формат email"
    */

    public static void main(String[] args) {
        System.out.println("Программа для хранения адресов электронной почты. " +
                "Адреса можно добавлять командой ADD и печатать весь список командой LIST. 0 - выход.");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }

            //TODO: write code here
            int value = input.indexOf(' ');
            String menu;
            String email = input.substring(value + 1);
            try {
                menu = input.substring(0, value);
            } catch (StringIndexOutOfBoundsException e) {
                menu = input;
            }
            /*try {
                email = input.substring(value + 1);
            } catch (StringIndexOutOfBoundsException e) {
                email = null;
            }*/
            switch (menu) {
                case "LIST":
                    emailList.printSortedEmails();
                    break;
                case "ADD":
                    emailList.add(email);
                    break;
                default:
                    System.out.println("Что-то не так, попробуйте еще раз.");
                    break;
            }
        }
    }
}
