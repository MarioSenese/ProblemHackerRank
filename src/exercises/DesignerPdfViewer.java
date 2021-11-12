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
public class DesignerPdfViewer {
    
    public int resultProblem() {
    
        Integer[] heights = {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
        String word = "abc";
        
        //Integer[] heights = {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7};
        //String word = "zaba";
        
        List<Integer> h = new ArrayList<Integer>();
        h.addAll(Arrays.asList(heights));
        int total = designerPdfViewer(h, word);
        
        return total;
        
    }
    
    /**
     * Problema: https://www.hackerrank.com/challenges/designer-pdf-viewer/problem - Designer PDF Viewer
     * https://www.hackerrank.com/challenges/designer-pdf-viewer/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
     * @param List<Integer> h -> lista di altezze di ogni lettera
     * @param String word
     * return Integer
    */
        private static int designerPdfViewer(List<Integer> h, String word) {
            
            // Definiamo un array di caratteri. Rappresenta l'alfabeto inglese
            Character[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
            
            int lengthWord = word.length(); // lunghezza string
            final int lengthCharacter = 1; // larghezza defautl=1mm di ogni carattere
            
            List<Character> characters = new ArrayList<Character>(); // array di caratteri per includere i caratteri della stringa passata per parametro
            for(int l = 0; l < letters.length; l++) {
                
                for(int c = 0; c < word.length(); c++) {
                    
                    if(word.charAt(c) == letters[l]) {
                        characters.add(word.charAt(c)); // inserimento caratteri della stringa in lista
                    }
                    
                }
                
            }
            
            int max_mm = 0; // definzione valore massimo
            for(int i = 0; i < h.size(); i++) { // per ogni altezza presente nella lista "h"
                
                for(int l = 0; l < letters.length; l++) { // per ogni carattere presente nell'array "characters"
                    
                    if(i == l && characters.contains(letters[l])) { // se gli indici i&l equivalgono e se i caratteri, in characters, equivalgono a quelli di "letters"
                        
                        // prendi i caratteri interessati e la sua altezza definita in "h"
                        
                        if(h.get(i) > max_mm) max_mm = h.get(i); // ci ricaviamo il max delle altezze in mm
                        
                    }
                }
                
                
            }
            
            return lengthWord*lengthCharacter*max_mm; // ritorna il calcolo dell'area del rettangolo evidenziato in mm^2, supponendo che tutte le lettere siano 1mm di larghezza.
            
            // l'area del rettangolo si calcola come BASExALTEZZA dove ALTEZZA=max_mm & BASE=lengthWord*lengthCharacter
            
        }
    
}
