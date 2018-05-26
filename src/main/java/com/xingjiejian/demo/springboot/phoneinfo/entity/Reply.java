package com.xingjiejian.demo.springboot.phoneinfo.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * 回复信息
 * @author Xing.Jiejian
 */
public class Reply {
    /**
     * 回复ID，自增
     */
    private Integer id;
    /**
     * 回复内容
     */
    private String content;
    /**
     * 回复时间，发表时的系统时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date replyTime;
    /**
     * 咨询ID，对应咨询主键
     */
    private Integer infoId;

    public Reply() {
    }

    public Reply(Integer id, String content, Date replyTime, Integer infoId) {
        this.id = id;
        this.content = content;
        this.replyTime = replyTime;
        this.infoId = infoId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(Date replyTime) {
        this.replyTime = replyTime;
    }

    public Integer getInfoId() {
        return infoId;
    }

    public void setInfoId(Integer infoId) {
        this.infoId = infoId;
    }
}
