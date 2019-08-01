/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

import java.util.Arrays;

/**
 * Given a string, you need to reverse the order of characters in each word within 
 * a sentence while still preserving whitespace and initial word order.
 * @author zhangqiumin
 */
public class ReverseWordStringIII {

    /**
     * @param args the command line arguments
     */
    public String Reverse(String s){
        // convert the string to an array to process each word
        // swap inside each word
        // convert the result array to a string
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        
        for(String word: words){
            // 下面这一行或者注释的部分都可以，但是注释的部分有点慢，takes 7ms
            result.append(new StringBuilder(word).reverse().toString() + " ");
//            char[] chars = word.toCharArray();
//            for(int i = 0; i<= chars.length/2 - 1; i++){
//                char temp = chars[i];
//                chars[i] = chars[chars.length - i - 1];
//                chars[chars.length - i - 1] = temp;
//            }
//            result.append(String.valueOf(chars) + " ");
        }
        
        return result.toString().trim();
    }
        
    public static void main(String[] args) {
        // TODO code application logic here
        ReverseWordStringIII solution = new ReverseWordStringIII();
        System.out.println(solution.Reverse("Let's take LeetCode contest"));
        
    }
    
}
