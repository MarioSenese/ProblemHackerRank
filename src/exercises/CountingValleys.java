/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mario
 */
public class CountingValleys {
    
    public int resultProblem() {
    
        // U -> salita
        // D -> discesa
        
        /*int steps = 8;
        String path = "UDDDUDUU";*/
        
        /*int steps = 8;
        String path = "DDUUUUDD";*/
        
        int steps = 12;
        String path = "DDUUDDUDUUUD";
        
        int result = countingValleys(steps, path);
        
        return result;
        
    }
    
    /**
     * Problema: https://www.hackerrank.com/challenges/counting-valleys/problem
     * @param steps, path 
     * return Integer
    */
    public static int countingValleys(int steps, String path) {
        
        int valleys = 0, level = 0;
        for(int i = 0; i < steps; i++) {
            
            if(path.charAt(i) == 'U') {
                level++;
                //System.out.println("U - " + level);
            } else {
                level--;
                //System.out.println("D - " + level);
            }
            
            if(level == 0 && path.charAt(i) == 'U') valleys++;
            
        }
        
        
        
        
        return valleys;
    }
    
}
