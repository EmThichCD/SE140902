/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vuht;

import vuht.util.MathUtility;

/**
 *
 * @author tuanv
 */
public class main {
    public static void main(String[] args) {
        //ta test thu ham cua ta
        //dung mat de so sanh ket qua thuc te khi chay va ket ka ta mong doi
        long expected=120;//ta mong nha duoc ket qua 120 khi goi ham 5!
        long actual=MathUtility.getFactorial(5);
        System.out.println("Expected: "+expected+" actual: "+actual);
        
        //expected: 720 if tinh 0!
        System.out.println("0!: "+MathUtility.getFactorial(0));
        //expected: IllegalArgumentException if tinh -5;
        System.out.println("-5!: "+MathUtility.getFactorial(-5));
    }
}
