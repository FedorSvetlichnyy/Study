package Part2.Printer;

import java.lang.reflect.Array;
import java.util.*;

public class Printer {

    Queue<Document> print = new LinkedList<>();
    static int countPages;
    static int allPrintPages;

    public Printer(Queue<Document> print) {
        this.print = print;
    }

    public void append(Queue<Document> print, Document b) {
        countPages += b.getCountPages();
        allPrintPages += b.getCountPages();
        print.add(b);
    }

    public void clear(Queue<Document> print) {
        print.clear();
        countPages = 0;
    }

    public void print(Queue<Document> print) {
        System.out.println(Arrays.toString(print.toArray()));
        print.clear();
        countPages = 0;
    }

    public int getPendingPagesCount(Queue<Document> print) {
        return countPages;
    }

    public int getAllPagesCount(Queue<Document> print) {
        return allPrintPages;
    }

}

class Document {
    int countPages;

    public Document(int countPages) {
        this.countPages = countPages;
    }

    public int getCountPages() {
        return countPages;
    }
}
