package com.xingjiejian.demo.springboot.phoneinfo.dao;

import com.xingjiejian.demo.springboot.phoneinfo.entity.Reply;

import java.util.List;

/**
 * 回复相关数据库操作接口
 * @author Xing.Jiejian
 */
public interface ReplyDao {
    /**
     * 新增回复
     * @param reply 回复信息
     */
    void save(Reply reply);

    /**
     * 根据资讯ID获取所有恢复信息
     * @param infoId 资讯ID
     * @return
     */
    List<Reply> findByInfoId(int infoId);
}
