package sdu.bigdata.server.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sdu.bigdata.dao.Disability_InformationMapper;
import sdu.bigdata.dao.Subsidy_ApplicationMapper;
import sdu.bigdata.dao.Two_Subsidy_ApplicationMapper;
import sdu.bigdata.server.tablemerge.MergeSevice;

import java.util.HashMap;
import java.util.Map;

@Service
public class MergeServiceImpl implements MergeSevice {

    @Autowired
    private Disability_InformationMapper disabilityInformationMapper;

    @Autowired
    private Subsidy_ApplicationMapper subsidyApplicationMapper;

    @Autowired
    private Two_Subsidy_ApplicationMapper twoSubsidyApplicationMapper;

    @Override
    public Map<String, String> tablemerge() {

        Map<String,String> map = new HashMap<>();











        map.put("message", "success");
        return map;




    }
}
