package Part3.Company;

public abstract class Employee {
    private int monthSalary = 50000; //фиксированная часть
    public int getMonthSalary() {
        return monthSalary;
    }

    public void setMonthSalary(int monthSalary) {
        this.monthSalary = monthSalary;
    }

}
