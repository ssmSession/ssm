package com.zking.ssm.admin.controller;

import com.zking.ssm.admin.service.IAdminRealthService;
import com.zking.ssm.model.Realauth;
import com.zking.ssm.util.DataProtocol;
import com.zking.ssm.util.PageBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class AdminRealthController {

    @Resource
    private IAdminRealthService adminRealthService;

    @RequestMapping("/loadReath")
    public Object loadRealth(Realauth realauth, HttpServletRequest request){
        DataProtocol data=new DataProtocol();
        PageBean pageBean=new PageBean();
        pageBean.setRequest(request);
        List<Realauth> realth = adminRealthService.getRealthPage(realauth,pageBean);
        data.setCode(DataProtocol.SUCCESS);
        data.setTotal(pageBean.getTotal());
        data.setData(realth);
        return data;
    }

}
