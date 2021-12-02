/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises;

/**
 *
 * @author Mario
 */
public class JavaDatatypes {
    
    /**
     * Problem: https://www.hackerrank.com/challenges/java-datatypes/problem
    */
    public static void resultProblem() {
    
        //long x = -150;
        long x = 150000;
        //long x = 1500000000;
        //long x = 213333333333333333333333333333333333;
        //long x = -100000000000000;
        
        if(x >= -128 && x<= 127) System.out.println(x + " can be fitted in: *byte");
        if(x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) System.out.println(x + " can be fitted in: *short");
        if(x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) System.out.println(x + " can be fitted in: *int");
        if(x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) System.out.println(x + " can be fitted in: *long");
    
    }
    
}
