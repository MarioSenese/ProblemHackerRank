/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises.File;

import java.util.Collections;



/**
 *
 * @author Mario
 */
public class RepeatedString {
    
    public long resultProblem() {
        
        long result = 0L;
            
       /* String s = "aba";
        long n = 10;*/
        
        /*String s = "abcac";
        long n = 10;*/
        
        /*String s = "a";
        long n = 1000000000000L;*/
        
        /*String s = "aab";
        long n = 882787;*/
        
        String s = "x";
        long n = 882787;
        
        result = repeatedString(s, n);
        
        return result;
    
    }
    
    private static long repeatedString(String s, long n) {
        
        long count = 0L;
        int percent = 25;
        
        /*for(int i = 0; i < n; i++) {

            s += s.charAt(i); //
            if(s.charAt(i) == 'a') count++;

        }*/
        for(char c : s.toCharArray()) {

            if(c == 'a') count++; // contiamo quante 'a' sono presenti nella stringa

        }

        long factor = n / s.length();
        long rem = n % s.length();

        count *= factor;
        //System.err.println("factor: " + factor + " - rem: " + rem + " - count: " + count);
        for(int i = 0; i < rem; i++) {

            System.err.println(s.charAt(i));

            if(s.charAt(i) == 'a') {
                count++;
            }
        }
        
       // System.err.println(count);
        
        return count;
    }
    
    
    
}
