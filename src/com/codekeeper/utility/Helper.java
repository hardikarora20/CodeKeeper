/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekeeper.utility;

import java.util.*;
import java.util.Random;

/**
 *
 * @author hardi
 */
public class Helper {
    public static String getTip(){
        String tips[]={ "Thanks for using CodeKeeper.",
                        "Click 'Save Password' to add a new password.",
                        "Generate strong passwords with one click.",
                        "Avoid reusing passwords across multiple accounts.",
                        "Use strong, unique passwords for each of your accounts.",
                        "Keep your passwords in one secure place with CodeKeeper.",
                        "Let's keep your login credentials organized and safe.",
                        "Keep your passwords safe with CodeKeeper.",
                        "Ready to keep your passwords secure?",
                        "You're one step closer to never forgetting another password!",
                        "Let's make your passwords as uncrackable as you are!",
                        "Remember, don't share your passwords with anyone, not even your cat.",
                        "Remember, if you don't protect your passwords, the hackers will.",
                        "Don't make your password \"password.\" That's like leaving the key in the front door.",
                        "If at first, you don't succeed, try a different password.",
                        "Don't forget your password, or you'll be stuck here forever!",
                        "Avoid common words and phrases, even your grandma's pet name.",
                        "If passwords were animals, choose a dinosaur, not a mouse.",
                        "Passwords are like ice cream, don't share them with strangers.",
                        "Protect your sensitive information with us.",
                        "Use secure connections when accessing sensitive data." };
        return tips[new Random().nextInt(tips.length)];
    }
    public static String getGreeting(String name){
        String greet[]={"Hello, ",
                        "Welcome back, ", 
                        "Hey there, ", 
                        "Hi, ",
                        "Greetings, "};
        return greet[new Random().nextInt(greet.length)]+name+"!";
    }
    public static String imageUrl(int n){
        String url[]={  "/com/codekeeper/icons/user1.png",
                        "/com/codekeeper/icons/user2.png",
                        "/com/codekeeper/icons/user3.png",
                        "/com/codekeeper/icons/user4.png",
                        "/com/codekeeper/icons/user5.png",
                        "/com/codekeeper/icons/user6.png",
                        "/com/codekeeper/icons/user7.png",
                        "/com/codekeeper/icons/user8.png" };
        return url[n-1];
    }
    public static String generatePassword(boolean isUpper, boolean isLower, boolean isDigit, boolean isSymbol, int maxLen){
        List <String> lower = new ArrayList <> ();
        List <String> upper = new ArrayList <> ();
        List <String> digit = new ArrayList <> ();
        List <String> symbol = new ArrayList <> ();
        if(isUpper)
            upper = new ArrayList <> (Arrays.asList("A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"));
        if(isLower)
            lower = new ArrayList <> (Arrays.asList("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"));
        if(isDigit)
            digit = new ArrayList <> (Arrays.asList("1","2","3","4","5","6","7","8","9","0"));
        if(isSymbol)
            symbol = new ArrayList <> (Arrays.asList("@","#","$","!","&"));
        List <String> merge = new ArrayList <> ();
        merge.addAll(lower);
        merge.addAll(upper);
        merge.addAll(digit);
        merge.addAll(symbol);
        StringBuilder res = new StringBuilder ();
        int k = 0;
        while(k<maxLen){
            res.append(merge.get(new Random().nextInt(merge.size())));
            k++;
        }
        return res.toString();
    }
    public static String getSuggestions(){
        String suggestion[]={
                        "Got ideas to improve us? Share 'em here!",
                        "Got a question? We've got your back! Hit us up", 
                        "Got an idea to make us even cooler? Let us know!",
                        "Need help? Ask us anything!",
                        "Got a suggestion? Let us know!",
                        "Have a query? We're here to assist!",
                        "Confused? We'll clear things up!",
                        "Got feedback? Share it with us!"};
        return "<html><body>"+suggestion[new Random().nextInt(suggestion.length)]+"</html></body>";
    }
}
