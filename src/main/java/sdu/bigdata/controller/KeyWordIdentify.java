package sdu.bigdata.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class KeyWordIdentify {
    @RequestMapping("DG/KeyWordIdentify")
    public String keyWordIdentify() {
        return "view/KeyWordIdentify";
    }
}




