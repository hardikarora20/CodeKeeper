/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekeeper.dao;

import com.codekeeper.dbutil.DBConnection;
import com.codekeeper.pojo.User;
import com.codekeeper.pojo.UserPojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author hardi
 */
public class UserDao {
    public static UserPojo validateUser(User user){
        try{
            String mail = user.getMail();
            String password = user.getPassword();
            Connection con = DBConnection.getConnection();
            String query = "select * from userp where email=? and password=?";
            UserPojo userpojo = new UserPojo();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, mail);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                userpojo.setUser_id(rs.getInt("user_id"));
                userpojo.setType(rs.getInt("type"));
                userpojo.setName(rs.getString("name"));
                userpojo.setEmail(rs.getString("email"));
                userpojo.setUserImg(rs.getInt("userImg"));
            }
            return userpojo;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
