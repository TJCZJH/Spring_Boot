package com.imooc.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;

/**
 * @author zhao
 * @version 1.0
 * @date 2019-08-21 17:07
 */
public class User {
    @JsonIgnore
    private String name;

    private String Password;
    private int age;
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss a",locale ="zh",timezone ="GMT+8")
    private Date birthday;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String desc;

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }


}
