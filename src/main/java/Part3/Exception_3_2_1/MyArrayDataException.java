package Part3.Exception_3_2_1;

public class MyArrayDataException extends RuntimeException{
    // в €чейке массива лежит что-то не то
    public MyArrayDataException(String message) {
        super(message);
    }
}
