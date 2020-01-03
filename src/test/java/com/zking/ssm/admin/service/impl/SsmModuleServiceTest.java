package com.zking.ssm.admin.service.impl;

import com.zking.ssm.BaseTest;
import com.zking.ssm.admin.service.ISsmModuleService;
import com.zking.ssm.model.SsmModule;
import org.junit.Test;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

public class SsmModuleServiceTest extends BaseTest {

    @Resource
    private ISsmModuleService ssmModuleService;

    @Test
    public void getSsmModules() {
        List<SsmModule> ssmModules = ssmModuleService.getSsmModules();
        ssmModules.forEach(x-> System.out.println(x));
//        System.out.println("as");
    }

}