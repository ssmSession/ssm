package com.zking.ssm.admin.controller;

import com.zking.ssm.admin.service.ISsmModuleService;
import com.zking.ssm.model.SsmModule;
import com.zking.ssm.util.DataProtocol;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class LeftController {

    @Resource
    private ISsmModuleService iSsmModuleService;

    /**
     * 获取左侧菜单栏
     *
     * @return
     */
    @RequestMapping("/getModules")
    public Object getModules() {
        DataProtocol dataProtocol = new DataProtocol();

        List<SsmModule> ssmModules = iSsmModuleService.getSsmModules();

        dataProtocol.setData(ssmModules);

        return dataProtocol;
    }

    /**
     * 获取左侧菜单栏
     *
     * @return
     */
    @RequestMapping("/getUserModules")
    public Object getUserModules() {
        DataProtocol dataProtocol = new DataProtocol();

        List<SsmModule> ssmModules = iSsmModuleService.getSsmUserModules();

        dataProtocol.setData(ssmModules);

        return dataProtocol;
    }


}
