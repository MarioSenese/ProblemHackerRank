/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Mario
 */
public class JumpingOnClouds {
    
    public int resultProblem() {
        
        // 0 -> nuvole sicure
        // 1 -> nuvole non sicure
        
        //Integer[] values = {0, 1, 0, 0, 0, 1, 0};
        //Integer[] values = {0, 0, 1, 0, 0, 1, 0};
        //Integer[] values = {0, 0, 0, 1, 0, 0};
        Integer[] values = {0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0};
        
        List<Integer> c = new ArrayList<Integer>();
        c.addAll(Arrays.asList(values));
        
        int result = jumpingOnClouds(c);
        return result;
    
    }
    
    private static int jumpingOnClouds(List<Integer> c) {
        
       int count = 0;
       for(int i = 0; i < c.size()-1; i++ ) {
           if(c.get(i) == 0) {
               i++;
           }
           count++;
       }
       return count;
       
    }

    
}
