package Part3.ConsoleCustomerList;

import Part3.ConsoleCustomerList.Exception.InvalidEmail;
import Part3.ConsoleCustomerList.Exception.InvalidPhoneNumber;
import Part3.ConsoleCustomerList.Exception.MyException;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomerStorage {
    private HashMap<String, Customer> storage;

    public CustomerStorage() {
        storage = new HashMap<>();
    }

    public void addCustomer (String data) throws InvalidEmail, InvalidPhoneNumber, MyException {
        String[] components = data.split("\\s+");
        
        if (components.length>4){
            throw new MyException("Много элементов в команде");
        }
        Pattern patternPhone = Pattern.compile("^\\+\\d{11}$");
        Matcher matcherPhone = patternPhone.matcher(components[3]);

        String name = components[0] + " " + components[1];
        if (!matcherPhone.matches()){
            throw new InvalidPhoneNumber("Неверный формат номера (нужно + и 11 цифр)");
        }
        Pattern patternEmail = Pattern.compile("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$");
        Matcher matcherEmail = patternEmail.matcher(components[2]);

        if (!matcherEmail.matches()){
            throw new InvalidEmail("Неверный формат электронной почты (нужен стандарт RFC5322)");
        }
        storage.put(name, new Customer(name, components[3], components[2]));
    }

    public void listCustomers() {
        storage.values().forEach(System.out::println);
    }

    public void removeCustomer(String name) {
        storage.remove(name);
    }

    public int getCount() {
        return storage.size();
    }
}