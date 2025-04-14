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

        // 1. �������� ������ ���� ���� ����������, ��������������� �� ���� �������.
        List<Book> sortedBooks = getSortedBooks(library);
        System.out.println("1. ������ ����, ��������������� �� ���� �������:");
        sortedBooks.forEach(System.out::println);

        // 2. ������� ������ �������� (������� ���� EmailAddress) �� ������� ���� ���������.
        List<EmailAddress> allEmails = getAllEmails(library);
        System.out.println("\n2. ������ ���� email-������� ���������:");
        allEmails.forEach(email -> System.out.println(email.getEmail()));

        // 3. ������� ������ �������� ������ ��� ������������� �� �������� � ������� > 1 �����.
        List<EmailAddress> subscribedEmails = getSubscribedEmails(library);
        System.out.println("\n3. ������ email-������� ������������� ��������� � > 1 ������:");
        subscribedEmails.forEach(email -> System.out.println(email.getEmail()));

        // 4. �������� ������ ���� ����, ������ ���������� (��� ����������).
        List<Book> uniqueBooks = getUniqueBooks(library);
        System.out.println("\n4. ������ ���������� ����, ������ ����������:");
        uniqueBooks.forEach(System.out::println);

        // 5. ���������, ���� �� ���-�� ����� �������.
        boolean hasOrwellBooks = checkForOrwellBooks(library);
        System.out.println("\n5. ���� �� ���-�� ����� �������? " + hasOrwellBooks);

        // 6. ������ ���������� ����� ����, ������� ������ �� ����� � ��������.
        int maxBooks = getMaxBooksPerReader(library);
        System.out.println("\n6. ���������� ����� ���� �� ����� � ��������: " + maxBooks);

        // 7. ��������� email-������ �� ������ OK � TOO_MUCH.
        Map<String, List<EmailAddress>> groupedEmails = groupEmailsByBookCount(library);
        System.out.println("\n7. ������ email-�������:");
        groupedEmails.forEach((group, emails) -> {
            System.out.println(group + ":");
            emails.forEach(email -> System.out.println("  " + email.getEmail()));
        });
    }

    // 1. �������� ������ ���� ���� ����������, ��������������� �� ���� �������.
    public static List<Book> getSortedBooks(Library library) {
        return library.getBooks().stream()
                .sorted(Comparator.comparing(Book::getIssueYear))
                .collect(Collectors.toList());
    }

    // 2. ������� ������ �������� �� ������� ���� ���������.
    public static List<EmailAddress> getAllEmails(Library library) {
        return library.getReaders().stream()
                .map(reader -> new EmailAddress(reader.getEmail()))
                .collect(Collectors.toList());
    }

    // 3. ������� ������ �������� ������ ��� ������������� �� �������� � ������� > 1 �����.
    public static List<EmailAddress> getSubscribedEmails(Library library) {
        return library.getReaders().stream()
                .filter(Reader::isSubscriber)
                .filter(reader -> reader.getBooks().size() > 1)
                .map(reader -> new EmailAddress(reader.getEmail()))
                .collect(Collectors.toList());
    }

    // 4. �������� ������ ���� ����, ������ ���������� (��� ����������).
    public static List<Book> getUniqueBooks(Library library) {
        return library.getReaders().stream()
                .flatMap(reader -> reader.getBooks().stream())
                .distinct()
                .collect(Collectors.toList());
    }

    // 5. ���������, ���� �� ���-�� ����� �������.
    public static boolean checkForOrwellBooks(Library library) {
        return library.getReaders().stream()
                .flatMap(reader -> reader.getBooks().stream())
                .anyMatch(book -> "������".equals(book.getAuthor()));
    }

    // 6. ������ ���������� ����� ����, ������� ������ �� ����� � ��������.
    public static int getMaxBooksPerReader(Library library) {
        return library.getReaders().stream()
                .mapToInt(reader -> reader.getBooks().size())
                .max()
                .orElse(0);
    }

    // 7. ��������� email-������ �� ������ OK � TOO_MUCH.
    public static Map<String, List<EmailAddress>> groupEmailsByBookCount(Library library) {
        return library.getReaders().stream()
                .filter(Reader::isSubscriber)
                .collect(Collectors.groupingBy(
                        reader -> reader.getBooks().size() <= 2 ? "OK" : "TOO_MUCH",
                        Collectors.mapping(reader -> new EmailAddress(reader.getEmail()), Collectors.toList())
                ));
    }
}
