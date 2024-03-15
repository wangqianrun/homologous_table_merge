package sdu.bigdata.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//    山东省残疾人两项补贴申请审批表
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Two_Subsidy_Application {

    private String name;
    private String sex;
    private String nation;
    private String id;
    private String phone;
    private String household_type;
    private String household_address;
    private String address;
    private String category;
    private String disability_class;
    private String disability_id;
    private String guard_name;
    private String guard_ration;
    private String guard_phone;
    private String bank_account;
    private String account_name;
    private String begin_bank;

}
