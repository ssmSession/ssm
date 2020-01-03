package com.zking.ssm.admin.service.impl;

import com.zking.ssm.admin.mapper.SsmModuleMapper;
import com.zking.ssm.admin.service.ISsmModuleService;
import com.zking.ssm.model.SsmModule;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 左侧菜单栏 service 实现类
 */
@Service
public class SsmModuleService implements ISsmModuleService {

    @Resource
    private SsmModuleMapper ssmModuleMapper;

    @Override
    public List<SsmModule> getSsmModules() {

        List<SsmModule> modules = ssmModuleMapper.getModules(-1);
        for(SsmModule  ssmModule : modules){
            System.err.println(ssmModule + "=====");
//            if(ssmModule.getPid() == -1){
                ssmModule.setSsmModules(ssmModuleMapper.getModules(ssmModule.getId()));
//            }
        }

        return modules;
    }

    @Override
    public List<SsmModule> getSsmUserModules() {

        List<SsmModule> modules = ssmModuleMapper.getUserModules(-1);
        for(SsmModule  ssmModule : modules){
            System.err.println(ssmModule + "=====");
//            if(ssmModule.getPid() == -1){
            ssmModule.setSsmModules(ssmModuleMapper.getUserModules(ssmModule.getId()));
//            }
        }

        return modules;
    }
}
