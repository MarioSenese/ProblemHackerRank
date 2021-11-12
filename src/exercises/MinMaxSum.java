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
public class MinMaxSum {
    
    public void resultProblem() {
        
        Integer[] arrTemp = {1, 2, 3, 4, 5};
        //Integer[] arrTemp = {256741038, 623958417, 467905213, 714532089, 938071625};
        //Integer[] arrTemp = {5, 5, 5, 5, 5};

        List<Integer> arr = new ArrayList<Integer>();

        for (Integer arrTemp1 : arrTemp) {
            //int arrItem = Integer.parseInt(arrTemp1);
            int arrItem = arrTemp1;
            arr.add(arrItem);
        }

        minMaxSum(arr); 
        
    }
    
    private static void minMaxSum(List<Integer> arr) {

        Integer min = min(arr);
        Integer max = max(arr);

        long sommaNoMin = 0;
        long sommaNoMax = 0;

        for(Integer item : arr) {

            if(!item.equals(min)) {
                sommaNoMin += (long)item;
            } 
            if(!item.equals(max)) {
                sommaNoMax += (long)item;
            }  
            if(min.equals(max)) {
                sommaNoMax += (long)item;
                sommaNoMin = sommaNoMax;
            }

        }

        if(max.equals(min)) {
            sommaNoMax = sommaNoMax - max;
            sommaNoMin = sommaNoMax;
        }

    }

    private static Integer max(List<Integer> arr) {

        Integer massimo = arr.get(0);

        for(Integer item : arr) {
           if(item > massimo) {
               massimo = item;
           } 
        }

        return massimo;

    }

    private static Integer min(List<Integer> arr) {

        Integer minimo = arr.get(0);

        for(Integer item : arr) {
            if(item < minimo) {
                minimo = item;
            }
        }

        return minimo;

    }
    
}
