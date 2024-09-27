package Part3.ConsoleCustomerList.Exception;

public class InvalidPhoneNumber extends Exception{
    private String message;
    public InvalidPhoneNumber(String message){
        super(message);
        this.message = message;
    }
}
