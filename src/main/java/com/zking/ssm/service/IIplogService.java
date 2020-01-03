package com.zking.ssm.service;

import com.zking.ssm.model.Iplog;
import sun.rmi.runtime.Log;

/**
 * 登录日志
 */
public interface IIplogService {

    public void addIplog(Iplog iplog);


    Iplog getIplogByMaxDate(Iplog iplog);
}
