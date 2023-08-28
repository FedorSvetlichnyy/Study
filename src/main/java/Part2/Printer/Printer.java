package Part2.Printer;

import java.lang.reflect.Array;
import java.util.*;

public class Printer {

    Queue<Document> documentsQueue;
    private static int countPages;
    private static int allPrintPages;

    public Printer() {
        documentsQueue = new LinkedList<>();
    }

    public void append(Document b) {
        countPages += b.getCountPages();
        allPrintPages += b.getCountPages();
        documentsQueue.add(b);
    }
    public void append(List<Document> documents) {
        for (Document a: documents) {
            System.out.println(a);
            countPages += a.getCountPages();
            allPrintPages += a.getCountPages();
            documentsQueue.add(a);
        }
    }

    public void clear() {
        documentsQueue.clear();
        countPages = 0;
    }

    public void print() {
        System.out.println(Arrays.toString(documentsQueue.toArray()));
        documentsQueue.clear();
        countPages = 0;
    }

    public int getPendingPagesCount() {
        return countPages;
    }

    public int getAllPagesCount() {
        return allPrintPages;
    }

}