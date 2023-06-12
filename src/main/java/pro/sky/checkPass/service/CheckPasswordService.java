package pro.sky.checkPass.service;

public interface CheckPasswordService {
    boolean checkLogin(String username);

    boolean checkPassword(String password);

    boolean checkPasswordsMatch(String password, String userInputPassword);

}
