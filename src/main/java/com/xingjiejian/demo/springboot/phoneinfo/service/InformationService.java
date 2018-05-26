package com.xingjiejian.demo.springboot.phoneinfo.service;

import com.xingjiejian.demo.springboot.phoneinfo.entity.Information;

import java.util.List;

/**
 * 资讯相关业务方法
 * @author Xing.Jiejian
 */
public interface InformationService {
    /**
     * 获取分页资讯列表
     * @param pageNo
     * @param pageSize
     * @return
     */
    List<Information> findPage(int pageNo,int pageSize);

    /**
     * 根据ID查询资讯
     * @param id
     * @return
     */
    Information findById(int  id);

    /**
     * 修改资讯信息
     * @param information
     */
    void update(Information information);

}
