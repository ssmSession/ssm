package com.zking.ssm.admin.service;

import com.zking.ssm.model.SsmModule;

import java.util.List;

/**
 *  左侧菜单栏 service 接口
 */
public interface ISsmModuleService {

    /**
     * 获取所有左侧菜单栏
     * @return
     */
    public List<SsmModule> getSsmModules();


    List<SsmModule> getSsmUserModules();
}
