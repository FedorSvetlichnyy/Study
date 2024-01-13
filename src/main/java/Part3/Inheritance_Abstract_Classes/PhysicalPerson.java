package Part3.Inheritance_Abstract_Classes;

public class PhysicalPerson extends Client {
    @Override
    public String infoAmount(){
        return "Инфо о счете: пополнение и снятие происходит без комиссии. " + super.infoAmount();
    };
}
