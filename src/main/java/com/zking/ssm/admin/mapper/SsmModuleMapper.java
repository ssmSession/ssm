package com.zking.ssm.admin.mapper;

import com.zking.ssm.model.SsmModule;

import java.util.List;

public interface SsmModuleMapper {

    /**
     * 获取到所有的左侧菜单栏
     */
    public List<SsmModule> getModules(int pid);


    /**
     * 查询用户的module
     * @param pid
     * @return
     */
    public List<SsmModule> getUserModules(int pid);

}
