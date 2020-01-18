package com.zking.ssm.mapper;

import com.amazonaws.services.codecommit.model.UserInfo;
import com.zking.ssm.model.Bidrequest;
import com.zking.ssm.model.Systemdictionary;
import com.zking.ssm.model.Systemdictionaryitem;
import com.zking.ssm.model.Userinfo;

import java.util.List;

/**
 * TOOD
 *借款
 * @author ${qiaoqiao}
 * @date 2020/1/6 19:18
 */
public interface BidrequestMapper {

    /**
     * 根据用户id查询状态是否为已完成实名认证
     * @param userInfo
     * @return
     */
    List<UserInfo> getUserInfoByState(Userinfo userInfo);

    /**
     * 查询月份
     * @param systemdictionary
     * @return
     */
    List<Systemdictionaryitem> getMonths(Systemdictionary systemdictionary);

    /**
     * 查询招标天数
     * @param systemdictionary
     * @return
     */
    List<Systemdictionaryitem> getDays(Systemdictionary systemdictionary);

    /**
     * 提交申请
     * @param bidrequest
     * @return
     */
    int submitApplication(Bidrequest bidrequest);



}
