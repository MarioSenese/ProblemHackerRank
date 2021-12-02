/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises;

import exercises.Matrix.Option;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class FormingAMagicSquare {
    
    /**
     *  Problem: https://www.hackerrank.com/challenges/magic-square-forming/problem
     *  Help 1: https://www.magic-squares.info/ms/magic-squares3.html
     *  Help 2: https://technos7blog.wordpress.com/2016/07/29/daily-java-day-17-hackerrank-rookie-rank-magic-square/
    */
    public static int resultProblem() {
    
        int result = 0;
        
        
        /*int[][] square = { 
            {5, 3, 4}, 
            {1, 5, 8}, 
            {6, 4, 2}
        }; // 7 */
       /* int[][] square = { 
            {4, 9, 2}, 
            {3, 5, 7}, 
            {8, 1, 5}
        }; // 1 */
        /*int[][] square = { 
            {4, 8, 2}, 
            {4, 5, 7}, 
            {6, 1, 6}
        };*/
        
        /*int[][] square = { 
            {1, 3, 8}, 
            {6, 4, 1}, 
            {2, 6, 5}
        }; // 9*/
        
        /*int[][] square = { 
            {4, 5, 8}, 
            {2, 4, 1}, 
            {1, 9, 7}
        }; // 14*/
        
        int[][] square = { 
            {2, 2, 7}, 
            {8, 6, 4}, 
            {1, 2, 9}
        }; // 16
        
        
        /**
         * Essendo un quadrato, il numero delle righe e quelle delle colonne è uguale.
         * Primo step: calcolo della costante magica -> {[n*(n^2 + 1)] / 2}
        */
        int n = square.length;
        int costanteMagica = (n * (n*n + 1)) / 2;
        
        int[][] squareMagic = { 
            {8, 3, 4}, 
            {1, 5, 9}, 
            {6, 7, 2}
        };
        
        
        /**
         *  Aggiungiamo nella lista una lista di interi. Gli interi sono i valori della matrice "square"
        */
        List<List<Integer>> s = new ArrayList<>();
        List<Integer> s1 = null;
        
        for(int r = 0; r < n; r++) {
            s1 = new ArrayList<Integer>();
            Integer item = 0;
            for(int c = 0; c < n; c++) {
                
                item  = square[r][c];
                s1.add(item);

            }
            s.add(s1);
        }
        
        /**
         *  Otteniamo le possibili opzioni (di matrice) dalla matrice magica (iniziale)
        */
        ArrayList<int[][]> options = new ArrayList<>();
        options = new Option().getOptions(squareMagic);
        
        /**
         *  Dichiarazione di variabili necessarie per ottenere il costo minimo
        */
        int min = Integer.MAX_VALUE, min1 = Integer.MAX_VALUE; 
        int sum = 0, sum1 = 0;
        
        // test
         ArrayList<int[][]> options1 = new ArrayList<>();
        int[][] tmp = new int[][]{{2, 9, 4}, {7, 5, 3}, {6, 1, 8}}; 
        options1.add(tmp);
        tmp = new int[][]{{6, 1, 8}, {7, 5, 3}, {2, 9, 4}};  
        options1.add(tmp);
        tmp = new int[][]{{8, 1, 6}, {3, 5, 7}, {4, 9, 2}};  
        options1.add(tmp);
        tmp = new int[][]{{4, 9, 2}, {3, 5, 7}, {8, 1, 6}};  
        options1.add(tmp);
        tmp = new int[][]{{8, 3, 4}, {1, 5, 9}, {6, 7, 2}}; 
        options1.add(tmp);
        tmp = new int[][]{{4, 3, 8}, {9, 5, 1}, {2, 7, 6}}; 
        options1.add(tmp);
        tmp = new int[][]{{6, 7, 2}, {1, 5, 9}, {8, 3, 4}};  
        options1.add(tmp);
        tmp = new int[][]{{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};  
        options1.add(tmp);
        
        /**
         *  Logica per ottenere il costo minimo
         */
        
        for (int[][] option : options) {
            for (int i = 0; i < squareMagic.length; i++) {
                for (int j = 0; j < squareMagic[i].length; j++) {
                    //sum = sum + Math.abs(option[i][j] - s.get(i).get(j));
                    sum = sum + Math.abs(option[j][i] - s.get(i).get(j));
                    sum1 = sum1 + Math.abs(option[i][j] - s.get(i).get(j));
                }
            }
            sum = Math.abs(sum);
            sum1 = Math.abs(sum1);
            if(sum<min) min = sum;
            if(sum1<min1) min1 = sum1;
            sum = sum1 = 0;
        }
        
        result = Math.min(min, min1);
       
        System.err.println("sum: " + min + " - sum1: " + min1);
        System.err.println("result: " + result);
        
        return result;
        
    }
    
    
   
     
}
