package Part2.CoolNumbers;

import java.util.*;

public class CoolNumbers {

    public static List<String> generateCoolNumbers() {
        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();
        Random rand = new Random();
        String rus = "АВЕКМНОРСТУХ";
        String dig = "123456789";
        for (int i = 0; i < 2000000; i++) {
            char c = rus.charAt(r.nextInt(rus.length()));
            char d = dig.charAt(r.nextInt(dig.length()));
            char e = rus.charAt(r.nextInt(rus.length()));
            char f = rus.charAt(r.nextInt(rus.length()));
            int randomNum = rand.nextInt((199 - 1) + 1) + 1;
            String g = String.format("%03d", randomNum);
            list.add("" + c + d + d + d + e + f + g);
        }
        return list;
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
