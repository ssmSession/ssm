package com.zking.ssm.service;

import com.zking.ssm.mapper.RealauthMapper;
import com.zking.ssm.model.Realauth;
import com.zking.ssm.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RealauthService implements IRealauthService {

    @Resource
    private RealauthMapper realauthMapper;

    @Override
    public void addRealauth(Realauth realauth) {
        realauthMapper.addRealauth(realauth);
    }

    @Override
    public void delRealauth(Realauth realauth) {
        realauthMapper.delRealauth(realauth);
    }

    @Override
    public void updateRealauth(Realauth realauth) {
        realauthMapper.updateRealauth(realauth);
    }

    @Override
    public List<Realauth> selectRealauthByAppId(Realauth realauth) {
        return realauthMapper.selectRealauthByAppId(realauth);
    }

    @Override
    public List<Realauth> selectRealauths(Realauth realauth) {
        return realauthMapper.selectRealauths(realauth);
    }

    @Override
    public List<Realauth> selectRealauthByIdNumber(Realauth realauth) {
        return realauthMapper.selectRealauthByIdNumber(realauth);
    }

    @Override
    public List<Realauth> selectRealauthPage(Realauth realauth, PageBean pageBean){
        return realauthMapper.selectRealauths(realauth);
    }

}
