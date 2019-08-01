/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playground;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author zhangqiumin
 */
public class Playground {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        Set<String> address = new HashSet<String>(); // store unique emails
        
        for(String email: emails){
            int at_index = email.indexOf('@');
            String local = email.substring(0, at_index);
            String domain = email.substring(at_index);
            
            if(local.contains("+")) {
                local = local.substring(0, local.indexOf('+'));
            }
            
            local = local.replaceAll("\\.", "");
            address.add(local + domain);  
            System.out.println(local);
        }
        
        System.out.println(address);
        
        System.out.println("" + "abc");
        System.out.println("abc");
        
    }
}
