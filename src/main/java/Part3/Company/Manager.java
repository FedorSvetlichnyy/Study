package Part3.Company;

public class Manager extends Employee {

    int bonus = (int) (((Math.random() * 25000) + 115000) * 0.05);

    public Manager() {
        setMonthSalary(super.getMonthSalary());
    }

    @Override
    public void setMonthSalary(int monthSalary) {
        super.setMonthSalary((monthSalary) + bonus);
    }
}
