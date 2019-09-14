package com.my.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author gjq
 * @create 2019-09-09-23:03
 */
public class User implements Serializable {

    private Integer id;
    private String uname;
    private String address;
    private Integer age;
    private Date birthday;

    public User() {
    }

    public User(Integer id, String uname, String address, Integer age, Date birthday) {
        this.id = id;
        this.uname = uname;
        this.address = address;
        this.age = age;
        this.birthday = birthday;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
                "id=" + id +
                ", uname='" + uname + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }

}
