package com.zking.ssm.controller;

import com.zking.ssm.model.Realauth;
import com.zking.ssm.util.DataProtocol;
import com.zking.ssm.util.IdCodeUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 实名认证
 */
@RestController
public class RealauthController {

    /**
     * 测试身份是否正确
     * @return
     */
    @RequestMapping("/testIdentity")
    public Object testIdentity(Realauth realauth){
        DataProtocol dataProtocol = new DataProtocol();
        try {
            boolean b = IdCodeUtil.testIdCode(realauth.getIdNumber(), realauth.getRealname());
            dataProtocol.setData(b);
        }catch (Exception e){
            dataProtocol.setCode(-1);
        }
        return dataProtocol;
    }





}
