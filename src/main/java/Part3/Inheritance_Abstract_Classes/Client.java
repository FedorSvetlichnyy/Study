package Part3.Inheritance_Abstract_Classes;

public abstract class Client {

    private double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void put(double amountToPut) {
        amount = amount + amountToPut;
    }

    public void take(double amountToTake) {
        amount = amount - amountToTake;
    }

    public String infoAmount(){
        return "Остаток на счету: " + amount;
    };

}
