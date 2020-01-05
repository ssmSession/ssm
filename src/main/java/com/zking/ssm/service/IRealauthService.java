package com.zking.ssm.service;

import com.zking.ssm.model.Realauth;
import com.zking.ssm.util.PageBean;

import java.util.List;

public interface IRealauthService {

    /**
     * 添加实名认证
     * @return
     */
    void addRealauth(Realauth realauth);

    /**
     * 删除实名认证
     * @return
     */
    void delRealauth(Realauth realauth);

    /**
     * 修改实名认证
     * @return
     */
    void updateRealauth(Realauth realauth);


    /**
     * 查询实名认证
     *      根据使用者的id
     * @param realauth
     * @return
     */
    List<Realauth> selectRealauthByAppId(Realauth realauth);

    /**
     * 查询全部
     * @param realauth
     * @return
     */
    List<Realauth> selectRealauths(Realauth realauth);

    /**
     *  车上数据库里面是否有这个人了
     * @return
     */
    List<Realauth> selectRealauthByIdNumber(Realauth realauth);

    List<Realauth> selectRealauthPage(Realauth realauth, PageBean pageBean);
}
