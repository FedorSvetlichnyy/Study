package Part3.ConsoleCustomerList.Exception;

public class MyException extends Exception{
    private String message;
    public MyException (String message){
        super(message);
        this.message = message;
    }
}
