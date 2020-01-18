package com.zking.ssm.controller;

import com.amazonaws.services.codecommit.model.UserInfo;
import com.zking.ssm.model.Bidrequest;
import com.zking.ssm.model.Systemdictionary;
import com.zking.ssm.model.Systemdictionaryitem;
import com.zking.ssm.model.Userinfo;
import com.zking.ssm.service.IBidrequestService;
import com.zking.ssm.util.DataProtocol;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * TOOD
 *
 * @author ${qiaoqiao}
 * @date 2020/1/6 19:41
 */
@RestController
public class BidrequestController {

    @Resource
    private IBidrequestService bidrequestService;


    /**
     * 根据用户id查询状态是否为已完成实名认证
     * @param userInfo
     * @return
     */
    @RequestMapping("/getUserInfoByState")
    public Object getUserInfoByState(Userinfo userInfo){
        DataProtocol dataProtocol = new DataProtocol();
        try {
            List<UserInfo> user = bidrequestService.getUserInfoByState(userInfo);
            dataProtocol.setData(user);
        }catch (Exception e){
            dataProtocol.setCode(-1);
        }
        return dataProtocol;
    }

    /**
     * 查询月份
     * @param systemdictionary
     * @return
     */
    @RequestMapping("/getMonths")
    public Object getMonths(Systemdictionary systemdictionary){
        DataProtocol dataProtocol = new DataProtocol();
        try {
            List<Systemdictionaryitem> sysDict = bidrequestService.getMonths(systemdictionary);
            dataProtocol.setData(sysDict);
        }catch (Exception e){
            dataProtocol.setCode(-1);
        }
        return  dataProtocol;
    }


    /**
     * 查询招标天数
     * @param systemdictionary
     * @return
     */
    @RequestMapping("/getDays")
    public Object getDays(Systemdictionary systemdictionary){
        DataProtocol dataProtocol = new DataProtocol();
        try {
            List<Systemdictionaryitem> sysDictDay = bidrequestService.getDays(systemdictionary);
            dataProtocol.setData(sysDictDay);
        }catch (Exception e){
            dataProtocol.setCode(-1);
        }
        return  dataProtocol;
    }

    /**
     * 提交申请
     * @param bidrequest
     * @return
     */
    @RequestMapping("/submitApplication")
    @ResponseBody
    public Map<String,Object> submitApplication(Bidrequest bidrequest){
        int insert = bidrequestService.submitApplication(bidrequest);
        Map<String,Object> map = new HashMap<>();
        if (insert>0){
            map.put("success",true);
            map.put("message","提交成功");
        }
        return map;
    }
}
