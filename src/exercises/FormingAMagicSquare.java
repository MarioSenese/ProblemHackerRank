/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Mario
 */
public class FormingAMagicSquare {
    
    public static int resultProblem() {
    
        int result = 0;
        
        
        int[][] values = { 
            {5, 3, 4}, 
            {1, 5, 8}, 
            {6, 4, 2}
        };

        List<List<Integer>> s = new ArrayList<>();
        List<Integer> s1 = new ArrayList<>();
        for(int i = 0; i < values.length; i++) {
            for(int j = 0; j < values[i].length; j++) {
                System.out.print(values[i][j] + " ");
                
               
            }
            
            System.out.println();
        }
       
        s.addAll(Arrays.asList(s1));
        System.err.println(s);
        
        //result = formingMagicSquare(s);
        
        return result;
    
    }
    
    private static int formingMagicSquare(List<List<Integer>> s) {
        
        return 0;
        
    }
    
}
