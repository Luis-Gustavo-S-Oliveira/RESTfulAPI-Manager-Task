package Manager.task.RESTfulApi.controller;

import Manager.task.RESTfulApi.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserControl {

    @GetMapping("/user")
    public User user() {
        return new User();
    }
    @GetMapping("/ping")
    public String ping(){
        return "pong";
    }
}
