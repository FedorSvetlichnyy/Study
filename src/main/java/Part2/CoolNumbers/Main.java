package Part2.CoolNumbers;

import java.lang.reflect.Array;
import java.util.Collections;
import java.util.List;

public class Main {
    /*
    TODO:
     - реализовать методы класса CoolNumbers
     - посчитать время поиска введимого номера в консоль в каждой из структуры данных
     - проанализоровать полученные данные
     */

    public static void main(String[] args) {
        List<String> list = CoolNumbers.generateCoolNumbers();
        CoolNumbers.searchNumber(list, "В111СС134");

        //Напишите в форме ответа, какой поиск — самый быстрый, а какой — самый медленный
        //находит номер быстрее всего "Поиск в TreeSet": пример ответа -
        //Поиск перебором: номер найден, поиск занял 6507500нс
        //Бинарный поиск: номер найден, поиск занял 3421700нс
        //Поиск в HashSet: номер найден, поиск занял 45800нс
        //Поиск в TreeSet: номер найден, поиск занял 39700нс


    }
}
