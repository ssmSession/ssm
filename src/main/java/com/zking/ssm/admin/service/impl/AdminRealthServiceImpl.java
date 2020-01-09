package com.zking.ssm.admin.service.impl;

import com.github.pagehelper.Page;
import com.zking.ssm.admin.mapper.AdminRealthMapper;
import com.zking.ssm.admin.service.IAdminRealthService;
import com.zking.ssm.model.Realauth;
import com.zking.ssm.util.PageBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AdminRealthServiceImpl implements IAdminRealthService {

    @Resource
    private AdminRealthMapper adminRealthMapper;

    @Override
    public List<Realauth> getRealthPage(Realauth realauth, PageBean pageBean){
        return  adminRealthMapper.getRealth(realauth);
    }

}
