package Part3.Inheritance_Abstract_Classes;

public class IndividualBusinessman extends Client {

    @Override
    public String infoAmount(){
        return "Инфо о счете: пополнение с комиссией 1%, если сумма меньше 1000 рублей. " +
                "И с комиссией 0,5%, если сумма больше либо равна 1000 рублей. " + super.infoAmount();
    };

    @Override
    public void put(double amountToPut) {
        if (amountToPut < 1000) {
        super.setAmount(super.getAmount() + amountToPut - amountToPut/100);
        } else super.setAmount(super.getAmount() + amountToPut - amountToPut*0.005);
    }

    //test
    /*public static void main(String[] args) {
        Client individualBusinessman = new IndividualBusinessman();
        Client legalPerson = new LegalPerson();
        Client physicalPerson = new PhysicalPerson();
        System.out.println(individualBusinessman.infoAmount());
        System.out.println(legalPerson.infoAmount());
        System.out.println(physicalPerson.infoAmount());

        physicalPerson.put(1.0);
        physicalPerson.take(0.6);
        System.out.println(physicalPerson.infoAmount());

        legalPerson.put(1000.0);
        legalPerson.take(100.0);
        System.out.println(legalPerson.infoAmount());

        individualBusinessman.put(300.0);
        individualBusinessman.take(100.0);
        System.out.println(individualBusinessman.infoAmount());

    }*/

}
