package com.zking.ssm.admin.controller;

import com.github.pagehelper.Page;
import com.zking.ssm.admin.service.IAdminSystemdictionaryService;
import com.zking.ssm.model.Systemdictionary;
import com.zking.ssm.util.DataProtocol;
import com.zking.ssm.util.PageBean;
import org.apache.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class AdminSystemdictionaryController {

    @Resource
    private IAdminSystemdictionaryService adminSystemdictionaryService;

    /**
     * 查询所有审核状态
     * @param systemdictionary
     * @return
     */
    @RequestMapping("/loadState")
    public Object loadState(Systemdictionary systemdictionary){
        DataProtocol data=new DataProtocol();
        List<Systemdictionary> list = adminSystemdictionaryService.selectAllState(systemdictionary);
        data.setCode(DataProtocol.SUCCESS);
        data.setData(list);
        return data;
    }

    /**
     * 查询所有数据字典
     * @param systemdictionary
     * @return
     */
    @RequestMapping("/loadSystemdictionary")
    public Object loadSystemdictionary(Systemdictionary systemdictionary, HttpServletRequest request){
        DataProtocol data=new DataProtocol();
        PageBean pageBean=new PageBean();
        pageBean.setRequest(request);
        List<Systemdictionary> systemdictionaries = adminSystemdictionaryService.getSystemdictionaryPage(systemdictionary,pageBean);
        data.setData(systemdictionaries);
        data.setTotal(pageBean.getTotal());
        return data;
    }

    /**
     * 删除数据字典
     * @param systemdictionary
     * @return
     */
    @RequestMapping("/delSystemdictionary")
    public Object delSystemdictionary(Systemdictionary systemdictionary){
        DataProtocol data=new DataProtocol();
        try {
            adminSystemdictionaryService.delSystemdictionary(systemdictionary);
            data.setCode(DataProtocol.SUCCESS);
        }catch(Exception e){
            data.setCode(DataProtocol.FAIL);
        }
        return data;
    }

    /**
     *
     * 编辑数据字典
     * @param systemdictionary
     * @return
     */
    @RequestMapping("/updateSystemdictionary")
    public Object updateSystemdictionary(Systemdictionary systemdictionary){
        DataProtocol data=new DataProtocol();
        try {
            adminSystemdictionaryService.updateSystemdictionary(systemdictionary);
            data.setCode(DataProtocol.SUCCESS);
        }catch(Exception e){
            data.setCode(DataProtocol.FAIL);
        }
        return data;
    }



}
