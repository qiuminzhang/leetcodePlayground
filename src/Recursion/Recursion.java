/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zhangqiumin
 */


public class Recursion {

    /**
     * @param args the command line arguments
     */
    
    void println(Object j){
        System.out.println(j);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Fibonacci Fi = new Fibonacci();
        System.out.println(Fi.Fi(10));
        
        
        List<Integer> l = new ArrayList<>();
    }
    
}
