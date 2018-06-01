package com.xingjiejian.demo.springboot.phoneinfo.dao;

import com.xingjiejian.demo.springboot.phoneinfo.entity.Information;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 资讯相关数据库操作方法
 * @author Xing.Jiejian
 */
public interface InformationDao {


    /**
     * 分页查询资讯并按照最后回复时间降序排列
     * @param pageNo 页码
     * @param pageSize 每页显示数量
     * @return
     */
    List<Information> findPageOrderLastPostTimeDESC(int pageNo,int pageSize);

}
