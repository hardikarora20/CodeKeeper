/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekeeper.pojo;

/**
 *
 * @author hardi
 */
public class UserPojo {

    public int getUserImg() {
        return userImg;
    }

    public void setUserImg(int userImg) {
        this.userImg = userImg;
    }

    public UserPojo() {
    }

    public UserPojo(int user_id, String name, String email, int type, int userImg) {
        this.user_id = user_id;
        this.name = name;
        this.email = email;
        this.type = type;
        this.userImg = userImg;
    }
    private int user_id;
    private String name;
    private String email;
    private int type;
    private int userImg;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
