package com.zking.ssm.service;

import com.amazonaws.services.codecommit.model.UserInfo;
import com.zking.ssm.mapper.BidrequestMapper;
import com.zking.ssm.model.Bidrequest;
import com.zking.ssm.model.Systemdictionary;
import com.zking.ssm.model.Systemdictionaryitem;
import com.zking.ssm.model.Userinfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * TOOD
 *
 * @author ${qiaoqiao}
 * @date 2020/1/6 19:39
 */
@Service
public class BidrequestServiceImpl implements IBidrequestService {

    @Resource
    private BidrequestMapper bidrequestMapper;

    /**
     * 根据id查询状态是否为
     * @param userInfo
     * @return
     */
    @Override
    public List<UserInfo> getUserInfoByState(Userinfo userInfo) {
        return bidrequestMapper.getUserInfoByState(userInfo);
    }

    /**
     * 查询月份
     * @param systemdictionary
     * @return
     */
    @Override
    public List<Systemdictionaryitem> getMonths(Systemdictionary systemdictionary) {
        return bidrequestMapper.getMonths(systemdictionary);
    }

    /**
     * 招标天数
     * @param systemdictionary
     * @return
     */
    @Override
    public List<Systemdictionaryitem> getDays(Systemdictionary systemdictionary) {
        return bidrequestMapper.getDays(systemdictionary);
    }

    /**
     * 提交申请
     * @param bidrequest
     * @return
     */
    @Override
    public int submitApplication(Bidrequest bidrequest) {
        return bidrequestMapper.submitApplication(bidrequest);
    }
}
