package sdu.bigdata.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @RequestMapping("/log")
    public String toLogin(){
        return "view/loginbak";
    }
}
