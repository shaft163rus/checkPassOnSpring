package pro.sky.checkPass.service;

import org.springframework.stereotype.Service;

@Service


public class CheckUserInputServiceImpl implements CheckUserInputService {

    private static final String ALLOWED_CHARS = "^[a-zA-Z0-9_]{1,20}$";

    @Override
    public void checkUserInput(String login, String password) {

        if (!login.matches(ALLOWED_CHARS)) {
            throw  new RuntimeException("Login does not match the conditions");
        }

        if (!password.matches(ALLOWED_CHARS)) {
            throw  new RuntimeException("Password does not match the conditions");
        }


    }


}
