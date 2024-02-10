package Part3.Company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Company {
    private int income = 120000000; //доход компании
    private List<Employee> employees;

    public Company() {
        employees = new ArrayList<>();
    }

    public void hire(Employee e) {
        employees.add(e);
    }

    public void hireAll(List<Employee> e) {
        employees.addAll(0, e);
    }

    public void fire(Employee e) {
        employees.remove(e);
    }

    public int getIncome() {
        return income;
    }

    @Override
    public String toString() {
        return "Company  " + employees;
    }

    public List<Employee> getTopSalaryStaff(int count) {
        List<Employee> getTopSalaryStaff = new ArrayList<>(employees);
        getTopSalaryStaff.sort(Comparator.comparing(Employee::getMonthSalary));
        Collections.reverse(getTopSalaryStaff);
        for (int i = getTopSalaryStaff.size() - 1; i >= count; --i) getTopSalaryStaff.remove(i);
        return getTopSalaryStaff;
    }

    public List<Employee> getLowestSalaryStaff(int count) {
        List<Employee> getLowestSalaryStaff = new ArrayList<>(employees);
        getLowestSalaryStaff.sort(Comparator.comparing(Employee::getMonthSalary));
        for (int i = getLowestSalaryStaff.size() - 1; i >= count; --i) getLowestSalaryStaff.remove(i);
        return getLowestSalaryStaff;
    }

    //test
    public static void main(String[] args) {
        Company company = new Company();
        List<Employee> newList = new ArrayList<>();
        for (int y = 0; y < 180; y++) {
            newList.add(y, new Operator());
        }
        for (int y = 0; y < 80; y++) {
            newList.add(y, new Manager());
        }
        for (int y = 0; y < 10; y++) {
            newList.add(y, new TopManager());
        }

        company.hireAll(newList);
        System.out.println(company.employees.size() + " сотрудников в компании.");

        for (int i = 0; i < company.getTopSalaryStaff(10).size(); i++) {
            System.out.println(company.getTopSalaryStaff(10).get(i).getMonthSalary() + " руб.");
        }

        System.out.println();

        for (int i = 0; i < company.getLowestSalaryStaff(30).size(); i++) {
            System.out.println(company.getLowestSalaryStaff(30).get(i).getMonthSalary() + " руб.");
        }

        System.out.println();

        //уволить 50% сотрудников
        for (int i = 0; i < company.employees.size() / 2; i++) {
            for (Employee y : company.employees) {
                company.fire(y);
                break;
            }
        }
        System.out.println(company.employees.size() + " сотрудников в компании.");

        for (int i = 0; i < company.getTopSalaryStaff(10).size(); i++) {
            System.out.println(company.getTopSalaryStaff(10).get(i).getMonthSalary() + " руб.");
        }

        System.out.println();

        for (int i = 0; i < company.getLowestSalaryStaff(30).size(); i++) {
            System.out.println(company.getLowestSalaryStaff(30).get(i).getMonthSalary() + " руб.");
        }

    }
}
