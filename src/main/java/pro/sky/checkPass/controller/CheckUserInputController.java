package pro.sky.checkPass.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.checkPass.service.CheckUserInputService;
import pro.sky.checkPass.service.CheckUserInputServiceImpl;

@RestController

public class CheckUserInputController {

    private final CheckUserInputService checkUserInputService;


    public CheckUserInputController(CheckUserInputServiceImpl checkPasswordService) {
        this.checkUserInputService = checkPasswordService;
    }

    @GetMapping("/checkUserInput")


    public String checkUserInput(@RequestParam("login") String login,
                               @RequestParam("password") String password) {
        try {
            checkUserInputService.checkUserInput(login, password);
        } catch (RuntimeException e) {
           return e.getLocalizedMessage();
        }
         return "Все верно";

    }


}
