package Part2.Printer;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Document> print = new LinkedList<>();
        Printer printer = new Printer(print);
        Document document = new Document(2);
        Document document2 = new Document(6);

        printer.append(print, document);
        printer.append(print, document2);
        System.out.println(printer.getPendingPagesCount(print));
        System.out.println(printer.getAllPagesCount(print));
        //printer.clear(print);
        printer.print(print);
        System.out.println(printer.getPendingPagesCount(print));
        System.out.println(printer.getAllPagesCount(print));



    }
}
