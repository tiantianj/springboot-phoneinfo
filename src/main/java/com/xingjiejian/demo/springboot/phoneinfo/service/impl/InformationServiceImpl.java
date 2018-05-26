package com.xingjiejian.demo.springboot.phoneinfo.service.impl;

import com.xingjiejian.demo.springboot.phoneinfo.dao.InformationDao;
import com.xingjiejian.demo.springboot.phoneinfo.entity.Information;
import com.xingjiejian.demo.springboot.phoneinfo.service.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Xing.Jiejian
 */
@Service
public class InformationServiceImpl implements InformationService {

    @Autowired
    private InformationDao informationDao;

    @Override
    @Transactional
    public List<Information> findPage(int pageNo, int pageSize) {
        return informationDao.findPageOrderLastPostTimeDESC(pageNo,pageSize);
    }

    @Override
    @Transactional
    public Information findById(int id) {
        return informationDao.findById(id);
    }

    @Override
    @Transactional
    public void update(Information information) {
        informationDao.update(information);
    }
}
