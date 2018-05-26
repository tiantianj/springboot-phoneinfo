package com.xingjiejian.demo.springboot.phoneinfo.dao.impl;

import com.xingjiejian.demo.springboot.phoneinfo.dao.InformationDao;
import com.xingjiejian.demo.springboot.phoneinfo.entity.Information;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * 基于Spring-JDBC的咨询数据库操作实现
 * @author Xing.Jiejian
 */
@Repository
public class InformationDaoImpl implements InformationDao {

    private String baseSQL = "SELECT id,title,content,replyCount,viewCount,reportTime,lastPostTime FROM information ";

    @Autowired
    private JdbcOperations jdbcOperations;

    @Override
    public void save(Information infor) {
        String sql = "INSERT INTO information(title,content) VLAUES(?,?)";
        Object[] params = {infor.getTitle(),infor.getContent()};
        jdbcOperations.update(sql,params);
    }

    @Override
    public void update(Information infor) {
        String sql = "UPDATE information SET title=?, content=?, replyCount=?, viewCount=?, reportTime=?, lastPostTime=? WHERE id=?";
        Object[] params = {infor.getTitle(),infor.getContent(),infor.getReplyCount(),infor.getViewCount(),infor.getReportTime(),infor.getLastPostTime(),infor.getId()};
        jdbcOperations.update(sql,params);
    }

    @Override
    public void deleteById(int id) {
        String sql = "DELETE FROM information WHERE id=?";
        jdbcOperations.update(sql,id);
    }

    @Override
    public List<Information> findPageOrderLastPostTimeDESC(int pageNo, int pageSize) {
        String sql = baseSQL+" ORDER BY lastPostTime DESC, reportTime DESC LIMIT ?,? ";
        int offset = (pageNo-1)*pageSize;
        return jdbcOperations.query(sql,this::rowMap,offset,pageSize);
    }

    @Override
    public Information findById(int id) {
        String sql = baseSQL + " WHERE id=?";
        return jdbcOperations.queryForObject(sql,this::rowMap,id);
    }

    private Information rowMap(ResultSet rs, int rowNum) throws SQLException{
        return new Information(
                rs.getInt("id"),
                rs.getString("title"),
                rs.getString("content"),
                rs.getInt("replyCount"),
                rs.getInt("viewCount"),
                rs.getTimestamp("reportTime"),
                rs.getTimestamp("lastPostTime")
        );
    }
}
