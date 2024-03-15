package sdu.bigdata.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//    扶助金申请审批表
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Subsidy_Application {

    private String community;
    private String seq;
    private String name;
    private String sex;
    private String nation;
    private String disability_id;
    private String category;
    private String disability_class;
    private String createtime;
    private String address;
    private String phone;
    private String degree;
    private String guarder;

}
