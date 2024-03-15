package sdu.bigdata.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//  残疾人信息表
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Disability_Information {

    private String name;
    private String sex;
    private String birth;
    private String category;
    private String disability_id;
    private String address;
    private String phone;
    private String family_type;
    private String office;
    private String community;
    private String createtime;

}
