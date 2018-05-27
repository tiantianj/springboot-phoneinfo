package com.xingjiejian.demo.springboot.phoneinfo.service;

import com.xingjiejian.demo.springboot.phoneinfo.entity.Reply;

import java.util.List;

/**
 * 回复相关业务接口
 * @author
 */
public interface ReplyService {
    /**
     * 获取对应资讯的所有回复信息
     * @param infoId 资讯ID
     * @return
     */
    List<Reply> findByInfoId(int infoId);
}
