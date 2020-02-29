package com.baizhi.entity;

import java.io.Serializable;

public class User implements Serializable {

    private String username;
    private String age;





    //这是第一次修改PWD

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
