package Part3.Registartion;

public class AuthException extends Exception{
    private String msg;

    public AuthException (String msg){
        super(msg);
        this.msg = msg;
    }
    public AuthException (){

    }

}
