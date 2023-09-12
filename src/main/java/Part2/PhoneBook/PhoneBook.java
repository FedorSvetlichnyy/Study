package Part2.PhoneBook;

import java.util.*;

public class PhoneBook {

    Map<String, String> phoneBook = new TreeMap<>();

    public void start(String input){
        String menu = input;
        Scanner scanner = null;
        if ("LIST".equals(menu)) {
            System.out.println(getAllContacts());
        } else if (checkNameOrNumber(input)){
            if (phoneBook.containsValue(input)) {
                System.out.println(getContactByPhone(input));
            } else {
                System.out.println("Такого номера в телефонной книге нет. \nВведите имя абонента для номера " + "“" + input + "“" + ":");
                scanner = new Scanner(System.in);
                String name = scanner.nextLine();
                addContact(input, name);
                System.out.println("Контакт сохранен!");
            }
        } else if (!checkNameOrNumber(input)){
            if (getContactByName(input) != null) {
                System.out.println(getContactByName(input));
            } else if (isCyrillic( input)) {
                System.out.println("Такого имени в телефонной книге нет. \nВведите номер телефона для абонента " + "“" + input + "“" + ":");
                scanner = new Scanner(System.in);
                String number = scanner.nextLine();
                addContact(number, input);
                System.out.println("Контакт сохранен!");
            } else System.out.println("Неверный формат ввода");
        } else {
            System.out.println("Что-то не так, попробуйте еще раз.");
        }
    }

    public void addContact(String phone, String name) {
        // проверьте корректность формата имени и телефона
        // (рекомедуется написать отдельные методы для проверки является строка именем/телефоном)
        // если такой номер уже есть в списке, то перезаписать имя абонента
        // если такое имя уже есть в списке, то добавить еще один номер (новый) и хранить несколько номеров
        // ключ - Имя, значение - телефон. Как и обычная книга. Из минусов - Имя можно написать по разному, но для демонстрации пойдет.
        boolean hasValue = true;
        boolean hasKey = true;
        String removeName = null;
        String addPhone = null;
        if (phoneBook.containsValue(phone)){
            for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (value.equals(phone)) removeName = key;
            }
            phoneBook.remove(removeName);
            phoneBook.put(name, phone);
        } else if (phoneBook.containsKey(name)){
            System.out.println("Это имя уже есть в справочнике, добавим еще один номер");
            for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (key.equals(name)) {
                    removeName = key;
                    addPhone = value + ", " + phone;
                }
            }
            phoneBook.remove(removeName);
            phoneBook.put(name, addPhone);
        }else phoneBook.put(name, phone);
    }

    public boolean checkNameOrNumber(String s) {
        long number;
        try {
            number = Long.parseLong(s);
        } catch (NumberFormatException e) {
            number = 0;
        }
        if (number > 0) {
            return true;
        }
        return false;
    }

    public boolean isCyrillic(String s) {
        boolean result = false;
        for (char a : s.toCharArray()) {
            if (Character.UnicodeBlock.of(a) == Character.UnicodeBlock.CYRILLIC) {
                result = !result;
                break;
            }
        }
        return result;
    }

    public String getContactByPhone(String phone) {
        // формат одного контакта "Имя - Телефон" или "Имя - Телефон, Телефон, Телефон ..."
        // если контакт не найден - вернуть пустую строку
          //String element1 =(String) mapA.get("key1");
        /*String name = null;
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (value.equals(phone)) name = key;
        }
        if (name != null) return name;
        else return null;*/
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (value.equals(phone)) return key;
        }
        return "";
    }

    public String getContactByName(String name) {
        // формат одного контакта "Имя - Телефон" или "Имя - Телефон, Телефон, Телефон ..."
        // если контакт не найден - вернуть пустую строку
        return phoneBook.get(name);
    }

    public Set<String> getAllContacts() {
        // формат одного контакта "Имя - Телефон" или "Имя - Телефон, Телефон, Телефон ..."
        // если контактов нет в телефонной книге - вернуть пустой TreeSet
        Set<String> phonebook = new TreeSet();
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            phonebook.add(key + " - " + value);
        }
        return phonebook;
        //return new TreeSet<>();
    }

    // для обхода Map используйте получение пары ключ->значение Map.Entry<String,String>
    // это поможет вам найти все ключи (key) по значению (value)
    /*
        for (Map.Entry<String, String> entry : map.entrySet()){
            String key = entry.getKey(); // получения ключа
            String value = entry.getValue(); // получения ключа
        }
    */
}