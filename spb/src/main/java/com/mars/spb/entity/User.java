package com.mars.spb.entity;/**
 * Created by Administrator on 2019/3/23.
 */

import java.io.Serializable;

/**
 * @author zhanglin
 */
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    public User(String email, String name, String password, String v1, String v2 ) {
        this.email = email;
        this.name = name;
        this.password = password;
        this.v1 = v1;
        this.v2 = v2;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getV1() {
        return v1;
    }

    public void setV1(String v1) {
        this.v1 = v1;
    }

    public String getV2() {
        return v2;
    }

    public void setV2(String v2) {
        this.v2 = v2;
    }

    private String email;
    private String name;
    private String password;
    private String v1;
    private String v2;



}
