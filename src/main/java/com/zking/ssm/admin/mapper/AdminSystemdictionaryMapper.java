package com.zking.ssm.admin.mapper;

import com.zking.ssm.model.Systemdictionary;

import java.util.List;

public interface AdminSystemdictionaryMapper {

    /**
     * 查询所有审核状态
     * @param systemdictionary
     * @return
     */
    public List<Systemdictionary> selectAllState(Systemdictionary systemdictionary);





}
