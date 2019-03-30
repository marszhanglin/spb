package com.mars.spb.controller;

import com.mars.spb.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
public class UserController {
    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;


    @RequestMapping("/getUser")
    public User getUser() {
        ValueOperations<String, User> operations=redisTemplate.opsForValue();
        User user=operations.get("user-key");
        return user;
    }


    @RequestMapping("/setUser")
    public User setUser() {
        User user=new User("set2@126.com", "set", "set123456", "set","set123");
        ValueOperations<String, User> operations=redisTemplate.opsForValue();
        operations.set("user-key", user,2, TimeUnit.MINUTES);
        //redisTemplate.delete("user-key");
        return user;
    }

}