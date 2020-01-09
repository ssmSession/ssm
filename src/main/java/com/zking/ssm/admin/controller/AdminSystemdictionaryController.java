package com.zking.ssm.admin.controller;

import com.zking.ssm.admin.service.IAdminSystemdictionaryService;
import com.zking.ssm.model.Systemdictionary;
import com.zking.ssm.util.DataProtocol;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class AdminSystemdictionaryController {

    @Resource
    private IAdminSystemdictionaryService adminSystemdictionaryService;

    /**
     * 查询所有审核状态
     * @param systemdictionary
     * @return
     */
    @RequestMapping("/loadState")
    public Object loadState(Systemdictionary systemdictionary){
        DataProtocol data=new DataProtocol();
        List<Systemdictionary> list = adminSystemdictionaryService.selectAllState(systemdictionary);
        data.setCode(DataProtocol.SUCCESS);
        data.setData(list);
        return data;
    }



}
