package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mario
 */
public class ArraysLeftRotation {
    
    /**
     * Problem: https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem
     * Arrays: Left Rotation
    */
    public int resultProblem() {
        
        int result = 0;
        
        //int array[] = new int[] {1, 2, 3, 4, 5}; int d = 4;
        //int array[] = new int[] {33, 47, 70, 37, 8, 53, 13, 93, 71, 72, 51, 100, 60, 87, 97}; int d = 13;
        int array[] = new int[] {41, 73, 89, 7, 10, 1, 59, 58, 84, 77, 77, 97, 58, 1, 86, 58, 26, 10, 86, 51}; int d = 10;
        
        //int d = array.length - 1;
        List<Integer> results = new ArrayList<>();
        
        List<Integer> values = new ArrayList<>();
        for(int i = 0; i < array.length; i++) {
            values.add(array[i]);
        }
       
        //int i = 0;
        //results.add(i, array[d]);
        /*do {
            
            Integer item = 0;
            item = array[d];
            results.add(i, item);
            i++;
            d--;
            
        } while(d > -1);*/
        
        /*int start = array[d];
        System.err.println(start);
        results.add(0, start);
        for(int i = 0; i < d; i++) {
            results.add(i+1, array[i]);
        }*/
        
        int start = values.get(d);
        results.add(0, start);
        int c = 1;
        for(int i = d+1; i < values.size(); i++) {
            results.add(c, values.get(i));
            c++;
        }
        int numeriRestanti = values.size() - c;
        for(int i = 0; i < numeriRestanti; i++) {
            results.add(values.get(i));
        }
        
        return result;
        
    }
    
}
