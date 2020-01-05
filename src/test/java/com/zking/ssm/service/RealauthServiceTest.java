package com.zking.ssm.service;

import com.zking.ssm.BaseTest;
import com.zking.ssm.mapper.RealauthMapper;
import com.zking.ssm.model.Realauth;
import com.zking.ssm.util.PageBean;
import org.junit.Test;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

public class RealauthServiceTest extends BaseTest {


    @Resource
    private IRealauthService iRealauthService ;

    @Test
    public void selectRealauthPage() {
        PageBean pageBean = new PageBean();

        Realauth realauth = new Realauth();

        List<Realauth> realauths = iRealauthService.selectRealauthPage(realauth, pageBean);
        realauths.forEach(x-> System.out.println(x));
    }
}