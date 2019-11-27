package com.yxinmin.zs.service;

import com.yxinmin.zs.dao.ActivityDao;
import com.yxinmin.zs.entity.Activity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ActivityService {

    @Autowired
    private ActivityDao activityDao;

    @Transactional(readOnly = true)
    public List<Activity> activityList(){
        return activityDao.findAll();
    }
}
