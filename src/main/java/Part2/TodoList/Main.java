package Part2.TodoList;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Integer.parseInt;

public class Main {
    private static TodoList todoList = new TodoList();

    public static void main(String[] args) {
        // TODO: написать консольное приложение для работы со списком дел todoList
        System.out.println("Список дел. Возможные команды: ");
        System.out.println("LIST — выводит дела с их порядковыми номерами \n" +
                "ADD — добавляет дело на указанное место \n" +
                "EDIT — заменяет дело с указанным номером \n" +
                "DELETE — удаляет дело с указанным номером \n" +
                "EXIT - выход");
        int doWhile = 1;
        do {
            int checkingEnteredWords = 1;
            System.out.println("Введите нужную команду: ");

            Scanner scanner = new Scanner(System.in);
            String todo = scanner.nextLine();
            String menu = null;
            String todoText = null;
            String todoText2 = null;
            int numberOfList = -1;
            int numberOfDelete = -1;
            try {
                int value = todo.indexOf(' ');
                menu = todo.substring(0, value);
                todoText = todo.substring(value + 1);
                try {
                    numberOfDelete = parseInt(todoText) - 1;
                } catch (NumberFormatException e) {
                    numberOfDelete = numberOfList;
                }
                int value2 = todoText.indexOf(' ');
                String init = todoText.substring(0, value2);
                todoText2 = todoText.substring(value2 + 1);
                try {
                    numberOfList = parseInt(init) - 1;
                } catch (NumberFormatException e) {
                    numberOfList = -1;
                }
            } catch (StringIndexOutOfBoundsException e) {
                menu = todo;
            }
            Pattern add = Pattern.compile("ADD");
            Matcher matcherAdd = add.matcher(menu);
            if (matcherAdd.find()) {
                if (todoText == null) {
                    System.out.println("Вы не указали никаких дел. Попробуйте еще");
                } else if (numberOfList >= 0) {
                    todoList.add(numberOfList, todoText2);
                } else {
                    todoList.add(todoText);
                }
                checkingEnteredWords = 0;
            }
            Pattern list = Pattern.compile("LIST");
            Matcher matcherList = list.matcher(menu);
            if (matcherList.find()) {
                todoList.list();
                checkingEnteredWords = 0;
            }
            Pattern edit = Pattern.compile("EDIT");
            Matcher matcherEdit = edit.matcher(menu);
            if (matcherEdit.find()) {
                if (todoText == null) {
                    System.out.println("Вы ничего не указали. Попробуйте еще");
                } else if (numberOfList >= 0) {
                    todoList.edit(numberOfList, todoText2);
                } else {
                    System.out.println("Вы ничего не указали. Попробуйте еще");
                }
                checkingEnteredWords = 0;
            }
            Pattern delete = Pattern.compile("DELETE");
            Matcher matcherDelete = delete.matcher(menu);
            if (matcherDelete.find()) {
                if (numberOfDelete >= 0) {
                    todoList.delete(numberOfDelete);
                } else {
                    System.out.println("Вы ничего не указали для удаления. Попробуйте еще");
                }
                checkingEnteredWords = 0;
            }
            Pattern exit = Pattern.compile("EXIT");
            Matcher matcherExit = exit.matcher(menu);
            if (matcherExit.find()) {
                System.out.println("Выход из программы.");
                checkingEnteredWords = 0;
                doWhile = 0;
            }

            if (checkingEnteredWords == 1) {
                System.out.println("Вы ввели неверную команду, попробуйте еще раз.");
                checkingEnteredWords = 0;
            }

        } while (doWhile == 1);

    }
}
