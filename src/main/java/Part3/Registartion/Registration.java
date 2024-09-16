package Part3.Registartion;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Registration {

    public boolean validate (String login, String password, String confirmPassword) throws AuthException{
        if(login == null || login.trim().length() == 0 || password == null || password.length() == 0 ||
                confirmPassword == null || confirmPassword.length() == 0){
            throw new AuthException("Все поля должны быть заполнены");
        }
        if (login.length() > 20 || password.length() > 20 || confirmPassword.length() > 20){
            throw new AuthException("Длина поля не должна превышать 20 символов");
        }
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9_]");
        Matcher matcher1 = pattern.matcher(login);
        Matcher matcher2 = pattern.matcher(password);
        Matcher matcher3 = pattern.matcher(confirmPassword);
        if (matcher1.find() || matcher2.find() || matcher3.find()){
            throw new AuthException("Введены недопустимые символы");
        }
        if (!password.equals(confirmPassword)){
            throw new AuthException("Пароль и подтверждение не совпадают");
        }
        return true;
    }

    public static void main(String[] args) {
        Registration registration = new Registration();
        try(Scanner scanner = new Scanner(System.in);) {
            String login = scanner.nextLine();
            String password = scanner.nextLine();
            String confirmPassword = scanner.nextLine();
            registration.validate(login, password, confirmPassword);
        } catch (AuthException e){
            e.printStackTrace();
        }


    }
}
