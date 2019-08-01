/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/**
 *
 * @author zhangqiumin
 */
public class Fibonacci {
    public int Fi(int num){
        if(num < 2){
            return num == 0 ? 0:1;   // if numer == 1||2, return 1, if number == 0, return 0
        }
        return Fi(num-1) + Fi(num-2);
    }
}
