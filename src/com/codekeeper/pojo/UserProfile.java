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
public class UserProfile {

    private static String userName, mail;
    private static int type, userId, userImg;
    
    public static String getUserName() {
        return UserProfile.userName;
    }

    public static void setUserName(String userName) {
        UserProfile.userName = userName;
    }

    public static int getUserId() {
        return UserProfile.userId;
    }

    public static void setUserId(int userId) {
        UserProfile.userId = userId;
    }

    public static String getMail() {
        return UserProfile.mail;
    }

    public static void setMail(String mail) {
        UserProfile.mail = mail;
    }

    public static int getType() {
        return UserProfile.type;
    }

    public static void setType(int type) {
        UserProfile.type = type;
    }

    public static int getUserImg() {
        return UserProfile.userImg;
    }

    public static void setUserImg(int userImg) {
        UserProfile.userImg = userImg;
    }

    public UserProfile(String userName, int userId, String mail, int type, int userImg) {
        UserProfile.userName = userName;
        UserProfile.userId = userId;
        UserProfile.mail = mail;
        UserProfile.type = type;
        UserProfile.userImg = userImg;
    }
}
