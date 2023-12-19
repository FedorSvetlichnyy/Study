package Part3.Inheritance_Extends;

import java.time.LocalDate;
import java.time.Month;

public class DepositAccount extends BankAccount {
    @Override
    public void take(double amountToTake) {
        LocalDate nowDate = LocalDate.now();
        if (nowDate.minusMonths(1).isBefore(lastIncom)) {
            System.out.println("A month has not passed since the last replenishment of the account");
        } else {
            if (amountToTake > bankAccount) {
                bankAccount = bankAccount - 0;
            } else bankAccount = bankAccount - amountToTake;
        }
    }
}
