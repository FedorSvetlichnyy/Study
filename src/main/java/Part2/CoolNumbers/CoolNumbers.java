package Part2.CoolNumbers;

import java.util.*;

public class CoolNumbers {

    public static List<String> generateCoolNumbers() {
        ArrayList<String> list = new ArrayList<>();
        String[] rus = new String[]{"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};
        for (int i1 = 0; i1 < rus.length; i1++) {
            for (int i2 = 1; i2 < 10; i2++) {
                for (int i3 = 0; i3 < rus.length; i3++) {
                    for (int i4 = 0; i4 < rus.length; i4++) {
                        for (int i5 = 1; i5 < 200; i5++) {
                            list.add("" + rus[i1] + i2+ i2+ i2 + rus[i3] + rus[i4] + String.format("%03d", i5));
                        }
                    }
                }
            }
        }
        return list;
        // как из задания XNNNYZR — пример, A111BC197, Y777HC006.
        //return Collections.emptyList(); // было в начале
    }


    public static void searchNumber(List<String> list, String number) {
        //System.out.println(list);
        long start = System.nanoTime();
        boolean result = bruteForceSearchInList(list, number);
        long finish = System.nanoTime();
        long elapsed = finish - start;
        String a = "найден";
        String b = "не найден";
        String c = null;
        if (result) {
            c = a;
        } else c = b;
        System.out.println("Поиск перебором: номер " + c + ", поиск занял " + elapsed + "нс");

        List<String> listSort = new ArrayList<>();
        listSort = list;
        Collections.sort(listSort);
        //System.out.println(list);
        long startBinary = System.nanoTime();
        boolean resultBinary = binarySearchInList(listSort, number);
        long finishBinary = System.nanoTime();
        long elapsedBinary = finishBinary - startBinary;
        if (resultBinary) {
            c = a;
        } else c = b;
        System.out.println("Бинарный поиск: номер " + c + ", поиск занял " + elapsedBinary + "нс");

        HashSet<String> hashSet = new HashSet<>(list);
        long startHashSet = System.nanoTime();
        boolean resultHashSet = searchInHashSet(hashSet, number);
        long finishHashSet = System.nanoTime();
        long elapsedHashSet = finishHashSet - startHashSet;
        if (resultHashSet) {
            c = a;
        } else c = b;
        System.out.println("Поиск в HashSet: номер " + c + ", поиск занял " + elapsedHashSet + "нс");

        TreeSet tSet = new TreeSet(list);
        long startTreeSet = System.nanoTime();
        boolean resultTreeSet = searchInTreeSet(tSet, number);
        long finishTreeSet = System.nanoTime();
        long elapsedTreeSet = finishTreeSet - startTreeSet;
        if (resultTreeSet) {
            c = a;
        } else c = b;
        System.out.println("Поиск в TreeSet: номер " + c + ", поиск занял " + elapsedTreeSet + "нс");

    }

    public static boolean bruteForceSearchInList(List<String> list, String number) {
        return list.contains(number);
    }

    public static boolean binarySearchInList(List<String> sortedList, String number) {
        int res = Collections.binarySearch(sortedList, number);
        if (res >= 0)
            return sortedList.contains(number);
        else
            return false;
    }

    public static boolean searchInHashSet(HashSet<String> hashSet, String number) {
        return hashSet.contains(number);
    }

    public static boolean searchInTreeSet(TreeSet<String> treeSet, String number) {
        return treeSet.contains(number);
    }

}
