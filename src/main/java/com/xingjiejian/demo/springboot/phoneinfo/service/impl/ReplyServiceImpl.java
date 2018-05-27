package com.xingjiejian.demo.springboot.phoneinfo.service.impl;

import com.xingjiejian.demo.springboot.phoneinfo.dao.ReplyDao;
import com.xingjiejian.demo.springboot.phoneinfo.entity.Reply;
import com.xingjiejian.demo.springboot.phoneinfo.service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 回复相关业务实现
 * @author
 */
@Service
public class ReplyServiceImpl implements ReplyService {
    @Autowired
    private ReplyDao replyDao;

    @Override
    public List<Reply> findByInfoId(int infoId) {
        return replyDao.findByInfoId(infoId);
    }
}
