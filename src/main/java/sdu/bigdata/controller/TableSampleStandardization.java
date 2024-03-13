package sdu.bigdata.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TableSampleStandardization {
    @RequestMapping("DG/TableSampleStandardization")
    public String tableSampleStandardization() {
        return "view/TableSampleStandardization";
    }
}
