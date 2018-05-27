package com.xingjiejian.demo.springboot.phoneinfo.dao.impl;

import com.xingjiejian.demo.springboot.phoneinfo.dao.ReplyDao;
import com.xingjiejian.demo.springboot.phoneinfo.entity.Reply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 回帖相关数据库操作实现类
 * 基于Spring-JDBC实现
 */
@Repository
public class ReplyDaoImpl implements ReplyDao {

    @Autowired
    private JdbcOperations jdbcOperations;

    @Override
    public void save(Reply reply) {
        String sql = "INSERT INTO reply(content,infoId) VALUES(?,?)";
        jdbcOperations.update(sql, reply.getContent(), reply.getInfoId());
    }

    @Override
    public List<Reply> findByInfoId(int infoId) {
        String sql = "SELECT id,content,replyTime,infoId FROM reply WHERE infoId=?";
        return jdbcOperations.query(sql, (rs, i) -> {
            return new Reply(
                    rs.getInt("id"),
                    rs.getString("content"),
                    rs.getTimestamp("replyTime"),
                    rs.getInt("infoId")
            );
        }, infoId);
    }
}
