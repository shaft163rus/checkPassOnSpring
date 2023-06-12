package pro.sky.checkPass.service;

public class CheckPasswordImpl implements CheckPasswordService {

    @Override
    public boolean checkLogin(String login) {
        return true;
    }

    @Override
    public boolean checkPassword(String password) {
        return true;
    }

    @Override
    public boolean checkPasswordsMatch(String password, String userInputPassword) {
        return true;
    }
}
