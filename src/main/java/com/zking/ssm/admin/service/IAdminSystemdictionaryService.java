package com.zking.ssm.admin.service;

import com.zking.ssm.model.Systemdictionary;
import com.zking.ssm.util.PageBean;

import java.util.List;

public interface IAdminSystemdictionaryService {

    List<Systemdictionary> selectAllState(Systemdictionary systemdictionary);


    public List<Systemdictionary> getSystemdictionaryPage(Systemdictionary systemdictionary, PageBean pageBean);

    int delSystemdictionary(Systemdictionary systemdictionary);

    int updateSystemdictionary(Systemdictionary systemdictionary);

}
