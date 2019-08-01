/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playground;

import java.util.*;

/**
 *
 * @author zhangqiumin
 */
public class string {
    public void run(){
        String str = "gfdsalkjh";
        // Convert a string to a char array 
        System.out.println(str.toCharArray()[0]); 
        // get character of a string by index
        // this is the most common way to loop through a String
        System.out.println(str.charAt(0)); 
        
        // Replace a character in a string by index
        // String is immunatble in Java, you can't change it. 
        // you have to create a new string with the string 
        // say you want to replace 'd' with 'x'
        String str_new = str.substring(0, 3) + 'x' + str.substring(4);
        System.out.println("Str_new: " + str_new);
        
        // Another approach is to use StringBuilder
        // StringBuffer and StringBuilder are mutable objects in java and 
        // provide append(), insert(), delete() and substring() methods for String manipulation.
        // StringBuffer provides Thread safety but on a performance cost
        StringBuilder str_builder = new StringBuilder("abcdefg");
        str_builder.setCharAt(3, 'x');
        System.out.println("Str_builder: " + str_builder);
       
        // check if a single char is in a string 
        if(str.indexOf('a')>=0){
            System.out.println("True");
        }
        
        // Sort characters in the String
        Arrays.sort(str.toCharArray());
        System.out.println(str.toCharArray());
    }
}