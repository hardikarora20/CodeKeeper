/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekeeper.utility;

import com.codekeeper.pojo.UserPojo;
import java.util.Base64;  
public class PasswordEncryption {  
        
    public static String getEncryptedUserPassword(String password) 
    {    
        Base64.Encoder encoder = Base64.getEncoder(); 
        return encoder.encodeToString(password.getBytes());  
    }
    
    public static String getDecryptedUserPassword(String encryptedPassword) 
    {    
        Base64.Decoder decoder = Base64.getDecoder(); 
        byte[] decodedBytes = decoder.decode(encryptedPassword);
        return new String(decodedBytes);  
    }
    
    public static String decryptPassword(int type, String password){
        StringBuilder pass = new StringBuilder();
        StringBuilder str = new StringBuilder(password);
        switch(type){
            case 1:
                //rev password -> encrypt -> rev encrypted
                str.reverse();
                pass.append(getEncryptedUserPassword(str.toString()));
                pass.reverse();
                break;
            case 2:
                //original password -> encrypt -> rev encrypted
                pass.append(getEncryptedUserPassword(str.toString()));
                pass.reverse();
                break;
            case 3:
                //rev password -> encrypt
                str.reverse();
                pass.append(getEncryptedUserPassword(str.toString()));
                break;
        }
        return pass.toString();
    }
    
    public static String encryptPassword(int type, String password){
        StringBuilder pass = new StringBuilder();
        StringBuilder str = new StringBuilder(password);
        switch(type){
            case 1:
                //rev dencrypted -> decrypt -> rev decrypt
                str.reverse();
                pass.append(getDecryptedUserPassword(str.toString()));
                pass.reverse();
                break;
            case 2:
                //rev decrypted -> decrypt                 
                str.reverse();
                pass.append(getDecryptedUserPassword(str.toString()));
                break;
            case 3:
                //decrypt -> rev password
                pass.append(getDecryptedUserPassword(str.toString()));
                pass.reverse();
                break;
        }
        return pass.toString();
    }
}  