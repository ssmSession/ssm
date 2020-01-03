package com.zking.ssm.controller;

import com.amazonaws.services.cloudwatch.model.Datapoint;
import com.zking.ssm.model.Iplog;
import com.zking.ssm.service.IIplogService;
import com.zking.ssm.util.DataProtocol;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 登录日志 controller
 */
@RestController
public class IplogController {

    @Resource
    private IIplogService iIplogService;

    /**
     * 根据用户id获取最近一次登录iplog
     * @param iplog
     * @return
     */
    @RequestMapping("/getIplogByMaxDate")
    public Object getIplogByMaxDate(Iplog iplog){

        DataProtocol dataProtocol = new DataProtocol();

        try {
            Iplog iplogByMaxDate = iIplogService.getIplogByMaxDate(iplog);
            dataProtocol.setData(iplogByMaxDate);
        }catch (Exception e){
            dataProtocol.setCode(-1);
        }
        return dataProtocol;
    }


}
