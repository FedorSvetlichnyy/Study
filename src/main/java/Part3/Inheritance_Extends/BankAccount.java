package Part3.Inheritance_Extends;

import java.time.LocalDate;

public class BankAccount {

    double bankAccount = 0.0;
    LocalDate lastIncom;

    public double getAmount() {
        return bankAccount;
    }

    public void put(double amountToPut) {
        if (amountToPut < 0) {
            bankAccount = bankAccount + 0;
        } else {
            bankAccount = bankAccount + amountToPut;
            lastIncom = LocalDate.now();
        }
    }

    public void take(double amountToTake) {
        if (amountToTake > bankAccount) {
            bankAccount = bankAccount - 0;
        } else bankAccount = bankAccount - amountToTake;
    }

    public boolean send(BankAccount receiver, double amount) {
        try {
            receiver.bankAccount = receiver.bankAccount + amount;
            bankAccount = bankAccount - amount;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //test
    /*public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount();
        System.out.println(bankAccount1.getAmount());
        bankAccount1.put(1.3);
        System.out.println(bankAccount1.getAmount());
        bankAccount1.take(2.0);
        System.out.println(bankAccount1.getAmount());
        bankAccount1.put(-1.3);
        System.out.println(bankAccount1.getAmount());
        BankAccount bankAccount2 = new BankAccount();
        System.out.println(bankAccount2.getAmount());
        bankAccount1.send(bankAccount2, 1.0);
        System.out.println(bankAccount1.getAmount());
        System.out.println(bankAccount2.getAmount());
        CardAccount cardAccount = new CardAccount();
        System.out.println(cardAccount.getAmount());
        cardAccount.put(150.0);
        System.out.println(cardAccount.getAmount());
        cardAccount.take(60.0);
        System.out.println(cardAccount.getAmount());
        System.out.println(bankAccount1.lastIncom);
        DepositAccount depositAccount1 = new DepositAccount();
        depositAccount1.put(2.3);
        depositAccount1.take(1.0);
    }*/
}


