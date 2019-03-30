package com.mars.spb.controller;

import com.mars.spb.dao.ApnUserDao;
import com.mars.spb.entity.ApnUserEntity;
import com.mars.spb.utils.MapUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/apnuser")
public class ApnUserController {
    @Autowired
    private ApnUserDao apnUserDao;

    @RequestMapping("/get")
    public List<ApnUserEntity>  getUser(@RequestParam Map<String, Object> params) {
        String id=(String)params.get("id");
        List<ApnUserEntity>  apnUserEntitys= apnUserDao.selectByMap(new MapUtils().put("id",id));
        return apnUserEntitys;
    }

}