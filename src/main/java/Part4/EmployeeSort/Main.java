package Part4.EmployeeSort;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    private static String staffFile = "D:\\JAVA\\Study\\src\\main\\resources\\part4/employeeSort/staff.txt";
    private static String dateFormat = "dd.MM.yyyy";

    public static void main(String[] args) {
        ArrayList<Employee> staff = loadStaffFromFile();
        System.out.println(staff);
        //сортировка сотрудников по ЗП и алфавиту
        List<Employee> staffSorted = staff.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(staffSorted);

        //сотрудник с максимум ЗП в 2017 году
        Calendar calendar = Calendar.getInstance();
        calendar.set(2017, Calendar.JANUARY, 1);

        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(2017, Calendar.DECEMBER, 31);

        staff.stream()
                .filter (e ->e.getWorkStart().after(calendar.getTime()) && e.getWorkStart().before(calendar1.getTime()))
                .max(Comparator.comparing(Employee::getSalary))
                .ifPresent(System.out::println);

    }

    private static ArrayList<Employee> loadStaffFromFile() {
        ArrayList<Employee> staff = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Paths.get(staffFile));
            for (String line : lines) {
                String[] fragments = line.split("\t");
                if (fragments.length != 3) {
                    System.out.println("Wrong line: " + line);
                    continue;
                }
                staff.add(new Employee(
                        fragments[0],
                        Integer.parseInt(fragments[1]),
                        (new SimpleDateFormat(dateFormat)).parse(fragments[2])
                ));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return staff;
    }
}