package com.my.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author gjq
 * @create 2019-09-09-23:03
 */
public class User implements Serializable {

    private String username;
    private String password;
    private Integer age;
    private Date birthday;

    public User() {
    }

    public User(String username, String password, Integer age, Date birthday) {
        this.username = username;
        this.password = password;
        this.age = age;
        this.birthday = birthday;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }
}
