package Part4.Person;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Wowa", "Dima", "Sasha", "Jack", "Connor", "Harry", "George", "Samuel", "John");
        List<String> families = Arrays.asList("Evans", "Young", "Harris", "Wilson", "Davies", "Adamson", "Brown");
        Collection<Person> persons = new ArrayList<>();
        for (int i = 0; i < 90; i++) {
            persons.add(new Person(
                    names.get(new Random().nextInt(names.size())),
                    families.get(new Random().nextInt(families.size())),
                    new Random().nextInt(100),
                    Sex.values()[new Random().nextInt(Sex.values().length)])
            );
        }
        //System.out.println(persons);

        long countPeople = persons.stream().count();
        System.out.println("Общее количество людей: " + countPeople);
        long countMan = persons.stream()
                .filter(person -> person.getSex() == Sex.MAN)
                .count();
        System.out.println("Общее количество мужчин: " + countMan);
        long countWoman = persons.stream()
                .filter(person -> person.getSex() == Sex.WOMAN)
                .filter(person -> person.getAge()<18)
                .count();
        System.out.println("Сколько женщин несовершеннолетних: " + countWoman);
        long pens = persons.stream()
                .filter(person -> person.getSex() == Sex.MAN ? person.getAge() >= 18 && person.getAge() <= 65
                        : person.getAge() >= 18 && person.getAge() <= 60).count();
        System.out.println("Сколько мужчин и женщин пенсионного возраста (учитывая последнюю пенсионную реформу): "
                + pens);
    }
}
