package com.xingjiejian.demo.springboot.phoneinfo.dao;

import com.xingjiejian.demo.springboot.phoneinfo.entity.Information;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *
 * @author
 */
public interface InformationMapper {
    /**
     * 根据ID删除资讯
     * @param id 咨询ID
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 保存资讯
     * @param record
     */
    int insert(@Param("info") Information record);

    /**
     * 保存资讯(保存非空属性)
     * @param record
     */
    int insertSelective(@Param("info") Information record);

    /**
     * 根据资讯ID查询资讯详细信息
     * @param id
     * @return
     */
    Information selectByPrimaryKey(Integer id);

    /**
     * 修改资讯（更新非空属性）
     * @param record
     */
    int updateByPrimaryKeySelective(@Param("info") Information record);

    /**
     * 修改资讯
     * @param record
     */
    int updateByPrimaryKey(@Param("info") Information record);

    List<Information> selectSelective();
}