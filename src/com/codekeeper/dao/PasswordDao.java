/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekeeper.dao;

import com.codekeeper.dbutil.DBConnection;
import com.codekeeper.pojo.PasswordPojo;
import com.codekeeper.pojo.UserProfile;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hardi
 */
public class PasswordDao {
    public static int getNewPasswordID() throws SQLException {
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("SELECT MAX(password_id) FROM passwordp");
        rs.next();

        int recId = 1;
        Integer id = rs.getInt(1);

        if (id != null) {
            recId = id + 1;
        }
        return recId;
    }
    public static boolean savePassword(PasswordPojo password) throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("Insert into passwordp values(?,?,?,?,?,?,?,?,?,?)");
        ps.setInt(1, getNewPasswordID());
        ps.setInt(2, UserProfile.getUserId());
        ps.setString(3, password.getWebsite());
        ps.setString(4, password.getUsername());
        ps.setString(5, password.getPassword());
        ps.setInt(6, 0);
        ps.setDate(7, new java.sql.Date(new java.util.Date().getTime()));
        ps.setDate(8, new java.sql.Date(new java.util.Date().getTime()));
        ps.setString(9, password.getCategory());
        ps.setInt(10, password.getRating());
        return ps.executeUpdate()==1;
    }

    public static List<PasswordPojo> getAllPasswords() throws SQLException{
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("Select * from passwordp where user_id = "+UserProfile.getUserId()+"");
        List<PasswordPojo>passwordList=new ArrayList<>();
        while(rs.next()){
            PasswordPojo pass=new PasswordPojo();
            pass.setWebsite(rs.getString("website"));
            pass.setUsername(rs.getString("username"));
            pass.setPassword(rs.getString("password"));
            pass.setCategory(rs.getString("category"));
            pass.setRating(rs.getInt("rating"));
            passwordList.add(pass);
        }
        return passwordList;
    }
       
    private static List<Integer> getAllPasswordRatings() throws SQLException {
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("SELECT rating FROM passwordp WHERE user_id = " + UserProfile.getUserId());
        List<Integer> passwordRatings = new ArrayList<>();
        while (rs.next()) {
            passwordRatings.add(rs.getInt("rating"));
        }
        return passwordRatings;
    }
    
    public static int[] updatePasswordStatistics() throws SQLException {
        List<Integer> passwordRatings = getAllPasswordRatings();
        int totalRatings = passwordRatings.size();

        int safeCount = 0;
        int compromisedCount = 0;
        int weakCount = 0;

        for (int rating : passwordRatings) {
            if (rating >= 0 && rating <= 33) {
                compromisedCount++;
            } else if (rating > 33 && rating <= 66) {
                weakCount++;
            } else {
                safeCount++;
            }
        }

        int strongPercentage = (safeCount * 100) / totalRatings;
        return new int[]{compromisedCount, weakCount, safeCount, strongPercentage, totalRatings};
    }
    
}
