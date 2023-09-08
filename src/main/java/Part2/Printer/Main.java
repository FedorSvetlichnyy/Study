package Part2.Printer;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        //LinkedList<Document> printQueue = new LinkedList<>();
        Printer printer = new Printer();
        Document document = new Document(2);
        Document document2 = new Document(6);

        printer.append(document);
        printer.append(document2);
        System.out.println(printer.getPendingPagesCount());  //8
        System.out.println(printer.getAllPagesCount());  //8
        printer.print(); // будет print.clear()
        System.out.println(printer.getPendingPagesCount());  //0
        System.out.println(printer.getAllPagesCount()); //8

        LinkedList<Document> printQueue = new LinkedList<>();
        printQueue.add(document);
        printQueue.add(document2);
        printer.append(printQueue); //принимает список документов на печать
        System.out.println(printer.getPendingPagesCount()); //8
        System.out.println(printer.getAllPagesCount()); //16
        printer.print();
        System.out.println(printer.getPendingPagesCount()); //0
        System.out.println(printer.getAllPagesCount()); //16




    }
}
