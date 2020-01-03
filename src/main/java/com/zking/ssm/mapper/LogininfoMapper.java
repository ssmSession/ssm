package com.zking.ssm.mapper;

import com.zking.ssm.model.Logininfo;
import com.zking.ssm.model.Userinfo;

import java.util.List;

/**
 * 登录信息管理 （包含所有的用户）
 */


public interface LogininfoMapper {
    /**
     * 登录
     * @param logininfo
     * @return
     */
    Logininfo getUserByNameAndPwd(Logininfo logininfo);

    /**
     * 根据 用户类型进行 查询
     * @return
     */
    public List<Logininfo> getLoginInfosByUserType(Integer userType);

    /**
     *  用户注册
     * @param logininfo
     * @return
     */
    int userRegister(Logininfo logininfo);


    /**
     * 用户修改状态
     */
    public int updateLoginInfoState(Logininfo logininfo);

    /**
     * 修改用户类型
     * @param logininfo
     * @return
     */
    public int updateLoginInfoUserType (Logininfo logininfo);






}
