/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Mario
 */
public class BirthdayCakeCandles {
    
    public int resultProblem() {
    
        //Integer[] arrTempCandles = {4, 4, 1, 3};
        Integer[] arrTempCandles = {18, 90, 90, 13, 90, 75, 90, 8, 90, 43};

        List<Integer> candles = new ArrayList<Integer>();
        candles.addAll(Arrays.asList(arrTempCandles));
        int total = birthdayCakeCandles(candles);
        //System.err.println(tot);
        
        return total;
        
    }
    
    /**
     * Esercizio per il problema: https://www.hackerrank.com/challenges/birthday-cake-candles/problem
     * @param candles 
    */
        private static int birthdayCakeCandles(List<Integer> candles) {
            
            int totalCandles = candles.size();
            int countCandles = 0;
            List<Integer> arr = new ArrayList<Integer>();
            
            // 1 sol
                /* 
                    for(int i = 0; i < candles.size(); i++) {


                       for(int j = i + 1; j < candles.size(); j++) {

                           if(candles.get(i).equals(candles.get(j)) && i != j) {
                               System.err.println(candles.get(i) + " - " + candles.get(j));
                                arr.add(candles.get(i));
                           }
                       }

                        //System.err.println(candles.get(i));

                    }

                    //System.err.println(candles);
                    for(int i = 0; i < candles.size(); i++) {

                        for(int j = 0; j < arr.size(); j++) {

                            if(candles.get(i).equals(arr.get(j))) {
                                countCandles++;
                            }

                        }

                    }
                */
           
           // 2 sol
           
                /*
                    Set<Integer> set = new HashSet<Integer>(candles);
                     System.err.println(set);
                     Integer c = 0;
                     for(Integer item : set) {
                         //System.err.println(item  + " - " + Collections.frequency(candles, item));
                          c = Collections.frequency(candles, item);
                          arr.add(c);
                     }

                     System.err.println(Collections.max(arr));
                     return countCandles = Collections.max(arr);
                */
           
           // 3 sol  -> la soluzione migliore
                HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
                int x = 0;
                for(int i = 0; i < candles.size(); i++) {

                    x = candles.get(i);
                    if(map.containsKey(x)) {
                        map.put(x, map.get(x)+1);
                    } else {
                        map.put(x, 1);
                    }

                }

                int max = 0;
                for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    //System.err.println(entry.getKey() + " - " + entry.getValue());
                    if(entry.getValue() > max) {
                        max = entry.getValue();
                    }
                }

                countCandles = max;

            return countCandles;
        }
    
}
