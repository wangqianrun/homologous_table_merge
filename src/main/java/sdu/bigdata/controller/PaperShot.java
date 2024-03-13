package sdu.bigdata.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PaperShot {
    @RequestMapping("DG/PaperShot")
    public String paperShot(){
        return "view/PaperShot";
    }
}
