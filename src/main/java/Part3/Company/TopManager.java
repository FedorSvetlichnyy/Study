package Part3.Company;

public class TopManager extends Employee {

    int bonus = (int) ((int) super.getMonthSalary() * 1.5);


    public TopManager() {
        if (new Company().getIncome() > 10000000) setMonthSalary(super.getMonthSalary());
    }

    @Override
    public void setMonthSalary(int monthSalary) {
        super.setMonthSalary((monthSalary) + bonus);
    }
}
