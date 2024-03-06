package Part3.Exception_3_2_1;

public class MyArraySizeException extends RuntimeException{
    // неправильный размер массива
    public MyArraySizeException(String message) {
        super(message);
    }
}
