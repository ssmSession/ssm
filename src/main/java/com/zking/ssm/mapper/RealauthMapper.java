package com.zking.ssm.mapper;

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
     * 修改实名认证
     * @return
     */
    int updateRealauth(Realauth realauth);


    List<Realauth> selectRealauth(Realauth realauth);




}
