package sdu.bigdata.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MultiTableMerge {
    @RequestMapping("DG/MultiTableMerge")
    public String multiTableMerge() {
        return "view/MultiTableMerge";
    }
}
