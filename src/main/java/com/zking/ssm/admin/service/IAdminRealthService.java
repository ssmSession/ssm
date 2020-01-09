package com.zking.ssm.admin.service;

import com.zking.ssm.model.Realauth;
import com.zking.ssm.util.PageBean;

import java.util.List;

public interface IAdminRealthService {

    List<Realauth> getRealthPage(Realauth realauth, PageBean pageBean);
}
