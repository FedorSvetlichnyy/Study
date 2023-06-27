package Part2.EmailList;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;

import static Part2.EmailList.Main.WRONG_EMAIL_ANSWER;

public class EmailList {
    Set<String> emailList = new TreeSet<>();

    public void add(String email) {
        // TODO: валидный формат email добавляется, email это строка, она быть может любой
        // принять решение добавлять аргумент email или нет должен этот метод
        String toLowerCase = email.toLowerCase();
        String regex = "\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*\\.\\w{1,3}";
        boolean matches = Pattern.matches(regex, toLowerCase);
        if (matches) {
            emailList.add(toLowerCase);
        } else {
            System.out.println(WRONG_EMAIL_ANSWER);
        }
    }

    public void printSortedEmails() {
        // TODO: возвращается сортированный список электронных адресов в алфавитном порядке
        // Класс TreeSet в Java обеспечивает реализацию интерфейса Set,
        // который использует древо для хранения.
        // Объекты хранятся в отсортированном и возрастающем порядке.
        for (String email : emailList) {
            System.out.println(email);
        }
        //return new ArrayList<>();
    }

}
