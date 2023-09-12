package Part2.CoolNumbers;

import java.util.*;

public class CoolNumbers {

    public static List<String> generateCoolNumbers() {
        ArrayList<String> list = new ArrayList<>();
        String[] rus = new String[]{"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};
        String[] dig = new String[]{"111", "222", "333", "444", "555", "666", "777", "888", "999"};
        String[] rus2 = new String[]{"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};
        String[] rus3 = new String[]{"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};
        String[] dig2 = new String[]{"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12",
                "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28",
                "29", "30", "31", "32", "33", "34", "35", "36", "37", "38",
                "39", "40", "41", "42", "43", "44", "45", "46", "47", "48",
                "49", "50", "51", "52", "53", "54", "55", "56", "57", "58",
                "59", "60", "61", "62", "63", "64", "65", "66", "67", "68",
                "69", "70", "71", "72", "73", "74", "75", "76", "77", "78",
                "79", "80", "81", "82", "83", "84", "85", "86", "87", "88",
                "89", "90", "91", "92", "93", "94", "95", "96", "97", "98",
                "99", "100", "101", "102", "103", "104", "105", "106", "107", "108",
                "109", "110", "111", "112", "113", "114", "115", "116", "117", "118",
                "119", "120", "121", "122", "123", "124", "125", "126", "127", "128",
                "129", "130", "131", "132", "133", "134", "135", "136", "137", "138",
                "139", "140", "141", "142", "143", "144", "145", "146", "147", "148",
                "149", "150", "151", "152", "153", "154", "155", "156", "157", "158",
                "159", "160", "161", "162", "163", "164", "165", "166", "167", "168",
                "169", "170", "171", "172", "173", "174", "175", "176", "177", "178",
                "179", "180", "181", "182", "183", "184", "185", "186", "187", "188",
                "189", "190", "191", "192", "193", "194", "195", "196", "197", "198", "199"};
        for (int i1 = 0; i1 < rus.length; i1++) {
            for (int i2 = 0; i2 < dig.length; i2++) {
                for (int i3 = 0; i3 < rus2.length; i3++) {
                    for (int i4 = 0; i4 < rus3.length; i4++) {
                        for (int i5 = 0; i5 < dig2.length; i5++) {
                            list.add("" + rus[i1] + dig[i2] + rus2[i3] + rus3[i4] + dig2[i5]);
                        }
                    }
                }
            }
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
