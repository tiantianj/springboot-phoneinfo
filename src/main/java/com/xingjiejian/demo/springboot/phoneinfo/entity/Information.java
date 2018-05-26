package com.xingjiejian.demo.springboot.phoneinfo.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * 咨询表
 * @author Xing.Jiejian
 */
public class Information {
    /**
     * 咨询ID
     */
    private Integer id;
    /**
     * 咨询标题
     */
    private String title;
    /**
     * 咨询内容
     */
    private String content;
    /**
     * 回复次数
     */
    private Integer replyCount;
    /**
     * 查看次数
     */
    private Integer viewCount;
    /**
     * 发表时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date reportTime;
    /**
     * 最后回复时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date lastPostTime;

    public Information() {
    }

    public Information(Integer id, String title, String content, Integer replyCount, Integer viewCount, Date reportTime, Date lastPostTime) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.replyCount = replyCount;
        this.viewCount = viewCount;
        this.reportTime = reportTime;
        this.lastPostTime = lastPostTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getReplyCount() {
        return replyCount;
    }

    public void setReplyCount(Integer replyCount) {
        this.replyCount = replyCount;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public Date getReportTime() {
        return reportTime;
    }

    public void setReportTime(Date reportTime) {
        this.reportTime = reportTime;
    }

    public Date getLastPostTime() {
        return lastPostTime;
    }

    public void setLastPostTime(Date lastPostTime) {
        this.lastPostTime = lastPostTime;
    }
}
