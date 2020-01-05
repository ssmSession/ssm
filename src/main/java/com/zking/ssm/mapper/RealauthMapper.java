package com.zking.ssm.mapper;

import com.sun.org.apache.regexp.internal.RE;
import com.zking.ssm.model.Realauth;

import java.util.List;

/**
 * 实名认证
 */
public interface RealauthMapper {

    /**
     * 添加实名认证
     * @return
     */
    int addRealauth(Realauth realauth);

    /**
     * 删除实名认证
     * @return
     */
    int delRealauth(Realauth realauth);

    /**
     * 修改实名认证(未做)
     * @return
     */
    int updateRealauth(Realauth realauth);


    /**
     * 根据用户id进行查询
     * @param realauth
     * @return
     */
    List<Realauth> selectRealauthByAppId(Realauth realauth);

    /**
     * 查询所有
     * @param realauth
     * @return
     */
    List<Realauth> selectRealauths(Realauth realauth);

    /**
     *  查询这个身份证是否在本平台认证过
     * @param realauth
     * @return
     */
    List<Realauth> selectRealauthByIdNumber(Realauth realauth);


}
