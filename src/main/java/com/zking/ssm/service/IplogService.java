package com.zking.ssm.service;

import com.zking.ssm.mapper.IplogMapper;
import com.zking.ssm.model.Iplog;
import com.zking.ssm.util.IpUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Timestamp;

@Service
public class IplogService implements IIplogService {

    @Resource
    private IplogMapper iplogMapper;

    @Override
    public  void addIplog (Iplog iplog){

        iplog.setIp(IpUtil.getV4IP());

        iplog.setState(Byte.valueOf("0"));

        iplog.setUserType(Byte.valueOf("0"));

        iplog.setLogintime(new Timestamp(System.currentTimeMillis()));

        iplogMapper.addIplog(iplog);

    }

    @Override
    public Iplog getIplogByMaxDate(Iplog iplog){
        return  iplogMapper.getIplogByMaxDate(iplog);
    }

}
