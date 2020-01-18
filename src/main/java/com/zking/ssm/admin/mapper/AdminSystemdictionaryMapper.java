package com.zking.ssm.admin.mapper;

import com.zking.ssm.model.Systemdictionary;

import java.util.List;

/**
 * 数据字典明细
 */
public interface AdminSystemdictionaryMapper {

    /**
     * 查询所有审核状态
     * @param systemdictionary
     * @return
     */
    public List<Systemdictionary> selectAllState(Systemdictionary systemdictionary);


    /**
     * 查询所有数据字典
     * @param systemdictionary
     * @return
     */
    public List<Systemdictionary> getSystemdictionary(Systemdictionary systemdictionary);

    /**
     * 删除数据字典
     * @param systemdictionary
     * @return
     */
    int delSystemdictionary(Systemdictionary systemdictionary);


    /**
     * 编辑数据字典
     * @param systemdictionary
     * @return
     */
    int updateSystemdictionary(Systemdictionary systemdictionary);

}
