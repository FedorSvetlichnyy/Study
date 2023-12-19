package Part3.Inheritance_Extends;

public class CardAccount extends BankAccount {
    @Override
    public void take(double amountToTake) {
        if (amountToTake > bankAccount) {
            bankAccount = bankAccount - 0;
        } else bankAccount = bankAccount - (amountToTake + amountToTake / 100);
    }
}
