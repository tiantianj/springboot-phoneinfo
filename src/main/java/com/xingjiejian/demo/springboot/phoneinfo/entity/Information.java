package com.xingjiejian.demo.springboot.phoneinfo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * information
 * @author 
 */
public class Information implements Serializable {
    private Integer id;

    private String title;

    private String content;

    private Integer replycount;

    private Integer viewcount;

    private Date reporttime;

    private Date lastposttime;

    private static final long serialVersionUID = 1L;

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

    public Integer getReplycount() {
        return replycount;
    }

    public void setReplycount(Integer replycount) {
        this.replycount = replycount;
    }

    public Integer getViewcount() {
        return viewcount;
    }

    public void setViewcount(Integer viewcount) {
        this.viewcount = viewcount;
    }

    public Date getReporttime() {
        return reporttime;
    }

    public void setReporttime(Date reporttime) {
        this.reporttime = reporttime;
    }

    public Date getLastposttime() {
        return lastposttime;
    }

    public void setLastposttime(Date lastposttime) {
        this.lastposttime = lastposttime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Information other = (Information) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getReplycount() == null ? other.getReplycount() == null : this.getReplycount().equals(other.getReplycount()))
            && (this.getViewcount() == null ? other.getViewcount() == null : this.getViewcount().equals(other.getViewcount()))
            && (this.getReporttime() == null ? other.getReporttime() == null : this.getReporttime().equals(other.getReporttime()))
            && (this.getLastposttime() == null ? other.getLastposttime() == null : this.getLastposttime().equals(other.getLastposttime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getReplycount() == null) ? 0 : getReplycount().hashCode());
        result = prime * result + ((getViewcount() == null) ? 0 : getViewcount().hashCode());
        result = prime * result + ((getReporttime() == null) ? 0 : getReporttime().hashCode());
        result = prime * result + ((getLastposttime() == null) ? 0 : getLastposttime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", content=").append(content);
        sb.append(", replycount=").append(replycount);
        sb.append(", viewcount=").append(viewcount);
        sb.append(", reporttime=").append(reporttime);
        sb.append(", lastposttime=").append(lastposttime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}