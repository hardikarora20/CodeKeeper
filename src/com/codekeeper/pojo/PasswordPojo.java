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
public class PasswordPojo {

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "PasswordPojo{" + "userEmail=" + userEmail + ", website=" + website + ", username=" + username + ", password=" + password + ", logo=" + logo + ", category=" + category + '}';
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
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

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public PasswordPojo(String userEmail, String website, String username, String password, String logo, String category) {
        this.userEmail = userEmail;
        this.website = website;
        this.username = username;
        this.password = password;
        this.logo = logo;
        this.category = category;
    }

    public PasswordPojo() {
        
    }

    private String userEmail;
    private String website;
    private String username;
    private String password;
    private String logo;
    private String category;
    private int rating;
    
}
