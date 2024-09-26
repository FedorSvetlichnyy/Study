package Part3.Inheritance_Abstract_Classes;

public class LegalPerson extends Client {
    @Override
    public String infoAmount(){
        return "Инфо о счете: снятие с комиссией 1%. " + super.infoAmount();
    };

    @Override
    public void take(double amountToTake) {
        super.setAmount(super.getAmount() - amountToTake - amountToTake/100);
    }
}
