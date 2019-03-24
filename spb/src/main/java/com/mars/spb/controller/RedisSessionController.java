package com.mars.spb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.UUID;

@RestController
public class RedisSessionController {

    @RequestMapping("/getUUID")
    public String getUUID(HttpSession session) {
        UUID uid = (UUID) session.getAttribute("uid");
        if (uid == null) {
            uid = UUID.randomUUID();
        }
        return session.getId();
    }


    @RequestMapping("/sessionUUID")
    public String sessionUUID(HttpSession session) {
        UUID uid = (UUID) session.getAttribute("uid");
        if (uid == null) {
            uid = UUID.randomUUID();
        }
        session.setAttribute("uid", uid);
        session.setMaxInactiveInterval(30*60);
        return session.getId();
    }


}