package Part2.PhoneBook;

import java.util.Scanner;

public class Main {
    static PhoneBook phoneBook = new PhoneBook();

    public static void main(String[] args) {

        System.out.println("Телефонная книга. " +
                "Имена и номера телефонов можно добавлять и печатать весь список командой LIST. 0 - выход.");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите номер, имя или команду: ");
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }
            //TODO: write code here
            phoneBook.start(input);

        }
    }
}
