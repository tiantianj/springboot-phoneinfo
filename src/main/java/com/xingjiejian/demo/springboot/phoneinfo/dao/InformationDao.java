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
     * 保存资讯
     * @param infor
     */
    void save(Information infor);

    /**
     * 修改资讯
     * @param infor
     */
    void update(Information infor);

    /**
     * 根据ID删除资讯
     * @param id 咨询ID
     */
    void deleteById(int id);

    /**
     * 分页查询资讯并按照最后回复时间降序排列
     * @param pageNo 页码
     * @param pageSize 每页显示数量
     * @return
     */
    List<Information> findPageOrderLastPostTimeDESC(int pageNo,int pageSize);

    /**
     * 根据资讯ID查询资讯详细信息
     * @param id
     * @return
     */
    Information findById(int id);
}
