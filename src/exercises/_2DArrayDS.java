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
public class _2DArrayDS {
    
    
    /**
     * Problem: https://www.hackerrank.com/challenges/2d-array/problem
     * 2D Array - DS
    */
    public int resultProblem() {
        
        int result = 0;
        
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> _arr = null;
        
        int[][] matrix = { 
            {1, 1, 1, 0, 0, 0}, 
            {0, 1, 0, 0, 0, 0}, 
            {1, 1, 1, 0, 0, 0},
            {0, 0, 2, 4, 4, 0},
            {0, 0, 0, 2, 0, 0},
            {0, 0, 1, 2, 4, 0}
        };
        
        List<List<Integer>> arr1 = new ArrayList<>();
        for(int r = 0; r < matrix.length; r++) {
            
            _arr = new ArrayList<>();
            Integer item = 0;
            
            for(int c = 0; c < matrix[r].length; c++) {
                
                item = matrix[r][c];
                _arr.add(item);
                
            }
            
            arr.add(_arr);
            
        }
        
        int sumValues = sumValues(arr, 1, 1);
        int max = sumValues;
        
        for(int r = 1; r < arr.size()-1; r++) {
            
            for(int c = 1; c < arr.get(r).size()-1; c++) {
                
                int _sum = sumValues(arr, r, c);
                if(max < _sum) {
                    max = _sum;
                }
                
            }
            
            
        }
        
       System.out.println("Max: " + max);
        
        return max;
        
    }

    private int sumValues(List<List<Integer>> arr, int i, int j) {
        
        int sum = 0;
        
        sum =   arr.get(i).get(j) + 
                arr.get(i-1).get(j-1) + 
                arr.get(i-1).get(j) +
                arr.get(i-1).get(j+1) +
                arr.get(i+1).get(j-1) +
                arr.get(i+1).get(j) +
                arr.get(i+1).get(j+1);
        
        return sum;
        
    }
    
}
