package com.zking.ssm.admin.service.impl;

import com.zking.ssm.admin.mapper.AdminSystemdictionaryMapper;
import com.zking.ssm.admin.service.IAdminSystemdictionaryService;
import com.zking.ssm.model.Systemdictionary;
import com.zking.ssm.util.PageBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AdminSystemdictionaryServiceImpl implements IAdminSystemdictionaryService {

    @Resource
    private AdminSystemdictionaryMapper adminSystemdictionaryMapper;

    @Override
    public List<Systemdictionary> selectAllState(Systemdictionary systemdictionary){
        return  adminSystemdictionaryMapper.selectAllState(systemdictionary);
    }

    @Override
    public List<Systemdictionary> getSystemdictionaryPage(Systemdictionary systemdictionary, PageBean pageBean) {
        return adminSystemdictionaryMapper.getSystemdictionary(systemdictionary);
    }

    @Override
    public int delSystemdictionary(Systemdictionary systemdictionary) {
        return adminSystemdictionaryMapper.delSystemdictionary(systemdictionary);
    }

    @Override
    public int updateSystemdictionary(Systemdictionary systemdictionary) {
        return adminSystemdictionaryMapper.updateSystemdictionary(systemdictionary);
    }


}
