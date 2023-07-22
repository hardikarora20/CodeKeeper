/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekeeper.dao;

import com.codekeeper.dbutil.DBConnection;
import com.codekeeper.pojo.UserPojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author hardi
 */
public class UserDao {
    public static UserPojo validateUser(String mail, String password){
        try{
            Connection con = DBConnection.getConnection();
            String query = "select * from userp where email=? and password=?";
            UserPojo user = new UserPojo();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, mail);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                user.setType(rs.getInt("type"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setUserImg(rs.getInt("userImg"));
            }
            return user;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
