package Part4.StreamAPI_4_1;

import java.util.*;
import java.util.stream.Collectors;

public class TestStreamApi {

    public static void main(String[] args) {
        //task 1
        String[] strings = {"Aa", "Bb", "Cc", "Aa"};
        List<String> list = Arrays.asList(strings);

        Map<String, Long> wordsByCount = list.stream()
                .collect(Collectors.groupingBy(String::valueOf, Collectors.counting()));

        String prevalentWord = wordsByCount.entrySet().stream()
                .max(Map.Entry.comparingByValue()).get().getKey();

        System.out.println(prevalentWord);


        //task 2
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Bob", 100, 30);
        employees[1] = new Employee("Dod", 95, 29);
        employees[2] = new Employee("Zub", 80, 28);
        employees[3] = new Employee("Fom", 50, 25);
        employees[4] = new Employee("Rey", 130, 50);

        Double averageSalary = Arrays.stream(employees)
                .collect(Collectors.averagingInt(Employee::getSalary));

        System.out.println(averageSalary);

        //task 3

        int maxSizeOfEmployee = 2;

        TreeMap<Integer, List<Employee>> myNewMap = Arrays.stream(employees)
                .collect(Collectors.groupingBy(Employee::getAge, TreeMap::new, Collectors.toList()))
                .entrySet().stream()
                .collect(TreeMap::new, (m, e) -> m.put(e.getKey(), e.getValue()), Map::putAll);

        Collection<List<Employee>> values = myNewMap.descendingMap().values().stream().limit(maxSizeOfEmployee).collect(Collectors.toList());

        System.out.println(maxSizeOfEmployee + " самых старших сотрудников зовут: " + values);


    }


}
