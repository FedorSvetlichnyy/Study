package Part3.ConsoleCustomerList.Exception;

public class InvalidEmail extends Exception{
    private String msg;
    public InvalidEmail(String msg){
        super(msg);
        this.msg = msg;

    }
}
