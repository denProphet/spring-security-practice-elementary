package prophet.security.practise.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class MainController {

    @GetMapping("/")
    public String home(){
        return "home page some text. Page is allowed for everyone";
    }

    @GetMapping("/auth")
    public String pageForAuthenticatedUsers(Principal principal){
        return "secured text" + principal.getName();
    }



}
