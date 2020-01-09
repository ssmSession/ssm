package com.zking.ssm.admin.service.impl;

import com.zking.ssm.admin.mapper.AdminSystemdictionaryMapper;
import com.zking.ssm.admin.service.IAdminSystemdictionaryService;
import com.zking.ssm.model.Systemdictionary;
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



}
