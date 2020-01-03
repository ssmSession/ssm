package com.zking.ssm.mapper;

import com.zking.ssm.model.Iplog;

import java.util.List;

/**
 * 登录日志mapper接口
 */
public interface IplogMapper {

    /**
     * 添加
     * @return
     */
    int addIplog(Iplog iplog);


    /**
     *  查询
     * @param iplog
     * @return
     */
    List<Iplog> getIplog(Iplog iplog);

    /**
     * 根据当前用户 最后登录时间
     * @return
     */
    Iplog getIplogByMaxDate (Iplog iplog);



}
