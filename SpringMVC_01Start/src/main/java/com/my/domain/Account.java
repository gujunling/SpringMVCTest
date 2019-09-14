package com.my.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * 账户实体类
 *
 * @author gjq
 * @create 2019-09-09-22:50
 */
public class Account  implements Serializable {

    private String username;
    private String password;
    private Double money;

    /*    private User user;*/

    private List<User> list;

    private Map<String ,User> map;

    public Account() {
    }

    public Account(String username, String password, Double money, List<User> list, Map<String, User> map) {
        this.username = username;
        this.password = password;
        this.money = money;
        this.list = list;
        this.map = map;
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

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

   /* public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }*/

    public List<User> getList() {
        return list;
    }

    public void setList(List<User> list) {
        this.list = list;
    }

    public Map<String, User> getMap() {
        return map;
    }

    public void setMap(Map<String, User> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "Account{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", money=" + money +
                ", list=" + list +
                ", map=" + map +
                '}';
    }
}
