package Part4.Library;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();

        // 1. Получить список всех книг библиотеки, отсортированных по году издания.
        List<Book> sortedBooks = getSortedBooks(library);
        System.out.println("1. Список книг, отсортированных по году издания:");
        sortedBooks.forEach(System.out::println);

        // 2. Создать список рассылки (объекты типа EmailAddress) из адресов всех читателей.
        List<EmailAddress> allEmails = getAllEmails(library);
        System.out.println("\n2. Список всех email-адресов читателей:");
        allEmails.forEach(email -> System.out.println(email.getEmail()));

        // 3. Создать список рассылки только для согласившихся на рассылку и взявших > 1 книги.
        List<EmailAddress> subscribedEmails = getSubscribedEmails(library);
        System.out.println("\n3. Список email-адресов согласившихся читателей с > 1 книгой:");
        subscribedEmails.forEach(email -> System.out.println(email.getEmail()));

        // 4. Получить список всех книг, взятых читателями (без дубликатов).
        List<Book> uniqueBooks = getUniqueBooks(library);
        System.out.println("\n4. Список уникальных книг, взятых читателями:");
        uniqueBooks.forEach(System.out::println);

        // 5. Проверить, взял ли кто-то книги Оруэлла.
        boolean hasOrwellBooks = checkForOrwellBooks(library);
        System.out.println("\n5. Взял ли кто-то книги Оруэлла? " + hasOrwellBooks);

        // 6. Узнать наибольшее число книг, которое сейчас на руках у читателя.
        int maxBooks = getMaxBooksPerReader(library);
        System.out.println("\n6. Наибольшее число книг на руках у читателя: " + maxBooks);

        // 7. Разделить email-адреса на группы OK и TOO_MUCH.
        Map<String, List<EmailAddress>> groupedEmails = groupEmailsByBookCount(library);
        System.out.println("\n7. Группы email-адресов:");
        groupedEmails.forEach((group, emails) -> {
            System.out.println(group + ":");
            emails.forEach(email -> System.out.println("  " + email.getEmail()));
        });
    }

    // 1. Получить список всех книг библиотеки, отсортированных по году издания.
    public static List<Book> getSortedBooks(Library library) {
        return library.getBooks().stream()
                .sorted(Comparator.comparing(Book::getIssueYear))
                .collect(Collectors.toList());
    }

    // 2. Создать список рассылки из адресов всех читателей.
    public static List<EmailAddress> getAllEmails(Library library) {
        return library.getReaders().stream()
                .map(reader -> new EmailAddress(reader.getEmail()))
                .collect(Collectors.toList());
    }

    // 3. Создать список рассылки только для согласившихся на рассылку и взявших > 1 книги.
    public static List<EmailAddress> getSubscribedEmails(Library library) {
        return library.getReaders().stream()
                .filter(Reader::isSubscriber)
                .filter(reader -> reader.getBooks().size() > 1)
                .map(reader -> new EmailAddress(reader.getEmail()))
                .collect(Collectors.toList());
    }

    // 4. Получить список всех книг, взятых читателями (без дубликатов).
    public static List<Book> getUniqueBooks(Library library) {
        return library.getReaders().stream()
                .flatMap(reader -> reader.getBooks().stream())
                .distinct()
                .collect(Collectors.toList());
    }

    // 5. Проверить, взял ли кто-то книги Оруэлла.
    public static boolean checkForOrwellBooks(Library library) {
        return library.getReaders().stream()
                .flatMap(reader -> reader.getBooks().stream())
                .anyMatch(book -> "Оруэлл".equals(book.getAuthor()));
    }

    // 6. Узнать наибольшее число книг, которое сейчас на руках у читателя.
    public static int getMaxBooksPerReader(Library library) {
        return library.getReaders().stream()
                .mapToInt(reader -> reader.getBooks().size())
                .max()
                .orElse(0);
    }

    // 7. Разделить email-адреса на группы OK и TOO_MUCH.
    public static Map<String, List<EmailAddress>> groupEmailsByBookCount(Library library) {
        return library.getReaders().stream()
                .filter(Reader::isSubscriber)
                .collect(Collectors.groupingBy(
                        reader -> reader.getBooks().size() <= 2 ? "OK" : "TOO_MUCH",
                        Collectors.mapping(reader -> new EmailAddress(reader.getEmail()), Collectors.toList())
                ));
    }
}
