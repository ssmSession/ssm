package com.zking.ssm.controller;

import com.sun.corba.se.spi.ior.ObjectKey;
import com.zking.ssm.model.Realauth;
import com.zking.ssm.service.IRealauthService;
import com.zking.ssm.util.DataProtocol;
import com.zking.ssm.util.IdCodeUtil;
import com.zking.ssm.util.PageBean;
import jdk.nashorn.internal.runtime.RewriteException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 实名认证
 */
@RestController
public class RealauthController {

    @Resource
    private IRealauthService iRealauthService;

    /**
     * 测试身份是否正确
     * @return
     */
    @RequestMapping("/testIdentity")
    public Object testIdentity(Realauth realauth){
        DataProtocol dataProtocol = new DataProtocol();
        try {
            List<Realauth> realauths = iRealauthService.selectRealauthByIdNumber(realauth);
            Realauth real = realauths.get(0);

            //判断数据库有没有数据
            if(real != null){
                dataProtocol.setCode(-1);
                dataProtocol.setMessage("抱歉已经进行过认证了");
            }else {
                boolean b = IdCodeUtil.testIdCode(realauth.getIdNumber(), realauth.getRealname());
                if(b){
                    dataProtocol.setMessage("认证成功");
                }else {
                    dataProtocol.setCode(-1);
                    dataProtocol.setMessage("身份证认证失败");
                }
            }
        }catch (Exception e){
            dataProtocol.setCode(-1);
            dataProtocol.setMessage("身份证和姓名不匹配");
        }
        return dataProtocol;
    }


    /**
     * 添加实名认证消息
     * @return
     */
    @RequestMapping("/addRealauth")
    public Object addRealauth(Realauth realauth){
        DataProtocol dataProtocol = new DataProtocol();

        try {
            iRealauthService.addRealauth(realauth);
        }catch (Exception e){
            dataProtocol.setCode(-1);
        }
        return dataProtocol;
    }

    /**
     * 删除实名认证
     * @param realauth
     * @return
     */
    @RequestMapping("/delRealauth")
    public Object delRealauth(Realauth realauth){
        DataProtocol dataProtocol = new DataProtocol();
        try {
            iRealauthService.delRealauth(realauth);
        }catch (Exception e){
            dataProtocol.setCode(-1);
        }
        return dataProtocol;
    }

    /**
     * 分页方法
     * @param realauth
     * @return
     */
    @RequestMapping("/selectRealauth")
    public Object selectRealauth(Realauth realauth, PageBean pageBean, HttpServletRequest request){
        DataProtocol dataProtocol = new DataProtocol();
        try {
            List<Realauth> realauths = iRealauthService.selectRealauthPage(realauth,pageBean);
            pageBean.setRequest(request);
            dataProtocol.setData(realauths);
        }catch (Exception e){
            dataProtocol.setCode(-1);
        }
        return dataProtocol;
    }








}
