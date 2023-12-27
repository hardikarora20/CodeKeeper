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
public class User {

    public User() {
        
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String mail, String password) {
        this.mail = mail;
        this.password = password;
    }
    private String mail, password;
}
