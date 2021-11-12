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
import java.util.Objects;
import java.util.Stack;

/**
 *
 * @author Mario
 */
public class SalesByMatch {
    
    public int resultProblem() {
        
        //int n = 7;
        //Integer[] array = {1, 2, 1, 2, 1, 3, 2};
        
        //int n = 9;
        //Integer[] array = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        
        //int n = 10;
        //Integer[] array = {1, 1, 3, 1, 2, 1, 3, 3, 3, 3};
        
        int n = 15;
        Integer[] array = {6, 5, 2, 3, 5, 2, 2, 1, 1, 5, 1, 3, 3, 3, 5};
        
        List<Integer> ar = new ArrayList<Integer>();
        ar.addAll(Arrays.asList(array));
        
        int total = sockMerchant(n, ar);
        
        return total;
    
    }
    
    /**
     * Problema: https://www.hackerrank.com/challenges/sock-merchant/problem - Sales by Match
     * https://www.hackerrank.com/challenges/sock-merchant/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
     * @param List<Integer> h -> lista di calzini
     * @param int n -> il numero dei calzini presenti nella lista
     * return Integer
     * 
     * How many pairs of socks can Alex sell?
    */
    private static int sockMerchant(int n, List<Integer> ar) {
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>(); // definizione mappa
        for(int i = 0; i < n; i++) {
            
            Integer count = map.get(ar.get(i)); // contiamo i valori equivalenti
            if(count == null) { 
                
                map.put(ar.get(i), 1); // se null, che viene restituito all'inzio, settiamo il valore a 1. Dopo di che, inseriamo key&value nella map
                
            } else {
                
                map.put(ar.get(i), (count+1)); // altrimenti sommiamo incrementiamo di 1 il valore count. Dopo di che, inseriamo key&value nella map
                
            }
        
        }
        
        int count = 0, sumPairs = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) { // Iteriamo la mappa Map con l'utilizzo di Map.entrySet
            
            int key = entry.getKey(); // otteniamo la Key
            int value = entry.getValue(); // otteniamo il Value
            
            if(value > 1) {
                
                // se il numero di valori equivalenti è maggiore di 1, significa che ci sono paia di calzini
                
                count = value / 2; // otteiamo il numero di paia di calzini. Es: se i calzini (2 rossi e 2 bianchi) sono 4, in questo caso sono presenti 4/2=2 paia di calzini. Se 9/2=4.5=4 paia di calzini
                sumPairs += count; // contiamo solo le parti intere di value e quindi sommiamo il numero di paia di calzini
                
            } else {
                
                // altrimenti non ci sono paia di calzini
                
                count = 0; // non si conta
                
            }
            
        
        }
        
        int result = sumPairs;
        
        return result;
    
    }
    
}
