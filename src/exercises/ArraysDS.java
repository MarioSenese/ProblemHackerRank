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
public class ArraysDS {
    
    public List<Integer> solutionProblem() {
        
        List<Integer> result = new ArrayList<>();
        
        //int array[] = new int[] {1, 4, 3, 2};
        int array[] = new int[] {305, 97, 1290, 5591, 5930, 9317, 440, 6533, 7470};
        
        List<Integer> values = new ArrayList<>();
        for(int i = 0; i < array.length; i++) {
            values.add(array[i]);
        }
        
        int i = values.size() - 1;
        do{
            result.add(values.get(i));
            i--;
        } while( i > -1 );
        
        
        System.out.println(result);
        
        return result;
        
    }
    
}
