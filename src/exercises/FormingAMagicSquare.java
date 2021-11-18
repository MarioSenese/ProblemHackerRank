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
        
        
        int[][] square = { 
            {5, 3, 4}, 
            {1, 5, 8}, 
            {6, 4, 2}
        };
        /*int[][] square = { 
            {4, 9, 2}, 
            {3, 5, 7}, 
            {8, 1, 5}
        };
        /*int[][] square = { 
            {4, 8, 2}, 
            {4, 5, 7}, 
            {6, 1, 6}
        };*/
        

        List<List<Integer>> s = new ArrayList<>();
        
        /**
         * Essendo un quadrato, il numero delle righe e quelle delle colonne è uguale.
         * Primo step: calcolo della costante magica -> {[n*(n^2 + 1)] / 2}
        */
        int n = square.length;
        int costanteMagica = (n * (n*n + 1)) / 2;
        
        /* Stampa a schermo la matrice */
        for(int i = 0; i < square.length; i++) {
            
            for(int j = 0; j < square[i].length; j++) {
                
                System.out.print(square[i][j] + " ");
                
            }
            
            System.out.println();
        }
        
        System.out.println("--------------1------------------");
        
        int[][] squareMagic = { 
            {8, 3, 4}, 
            {1, 5, 9}, 
            {6, 7, 2}
        };
        
        int[][] squareMagicTot = new int[8][9];

        
        /* Stampa a schermo la matrice magica */
        int[][] squareMagic0 = new int[n][n];
        int[][] squareMagic1 = new int[n][n];
        int[][] squareMagic2 = new int[n][n];
        int[][] squareMagic3 = new int[n][n];
        
        int[][] matrix = new int[8][9];
        
        List<Integer> s1 = new ArrayList<>();
        for(int i = 0; i < squareMagic.length; i++) {
            //List<Integer> s1 = new ArrayList<>();
            for(int j = 0; j < squareMagic[i].length; j++) {
                
                squareMagic0[i][j] = squareMagic[i][j];
                System.out.print(squareMagic0[i][j] + " ");
                
                
                /* matrix[i][j] = squareMagic0[i][j];
                s1.addAll(Arrays.asList(matrix[i][j]));*/
                
                int item = squareMagic0[i][j];
                s1.add(item);
                
            }
            
            //s.add(s1);
            System.out.println();
        }
        s.add(s1);
        
        System.out.println("--------------2------------------");
        List<Integer> s2 = new ArrayList<>();
        for(int i = squareMagic0.length-1; i >= 0; i--) {
            //List<Integer> s2 = new ArrayList<>();
            for(int j = squareMagic0[i].length-1; j >= 0; j--) {
                
                squareMagic1[i][j] = squareMagic0[i][j];
                System.out.print(squareMagic1[i][j] + " ");
                
                /*matrix[i][j] = squareMagic1[i][j];
                s2.addAll(Arrays.asList(matrix[i][j]));*/
                int item = squareMagic1[i][j];
                s2.add(item);
            }
            System.out.println();
            
        }
        s.add(s2);
        
        //squareMagic = squareMagic1;
        System.out.println("--------------3------------------");
        List<Integer> s3 = new ArrayList<>();
        for(int i = 0; i < squareMagic1.length; i++) {
            
            //List<Integer> s3 = new ArrayList<>();
            
            for(int j = n-1; j >= 0; j--) {
              
                squareMagic2[i][j] = squareMagic1[i][j];
                System.out.print(squareMagic2[i][j] + " ");
                
                /*matrix[i][j] = squareMagic2[i][j];
                s3.addAll(Arrays.asList(matrix[i][j]));*/
                int item = squareMagic2[i][j];
                s3.add(item);
            }
            System.out.println();
            //s.add(s3);
        }
        
        s.add(s3);
      
        
        System.out.println("--------------4------------------");
         List<Integer> s4 = new ArrayList<>();
        for(int i = n-1; i >= 0; i--) {
           
            for(int j = 0; j < squareMagic2.length; j++) {
              
                squareMagic3[i][j] = squareMagic2[i][j];
                System.out.print(squareMagic3[i][j] + " ");
                
                /*matrix[i][j] = squareMagic3[i][j];
                s4.addAll(Arrays.asList(matrix[i][j]));/*/
                int item = squareMagic3[i][j];
                s4.add(item);
            }
            System.out.println();
            //s.add(s4);
        }
        s.add(s4);
        int[][] squareMagic4 = new int[n][n];
        int[][] squareMagic5 = new int[n][n];
        int[][] squareMagic6 = new int[n][n];
        int[][] squareMagic7 = new int[n][n];
        
        System.out.println("--------------5------------------");
         List<Integer> s5 = new ArrayList<>();
        for(int i = 0; i < squareMagic.length; i++) {
            //List<Integer> s5 = new ArrayList<>();
            for(int j = 0; j < squareMagic[i].length; j++) {
                
                squareMagic4[i][j] = squareMagic[j][i];
                System.out.print(squareMagic4[i][j] + " ");
                
                /*matrix[i][j] = squareMagic4[i][j];
                s5.addAll(Arrays.asList(matrix[i][j]));*/
                int item = squareMagic4[i][j];
                s5.add(item);
            }
            System.out.println();
            //s.add(s5);
        }
        s.add(s5);
        System.out.println("--------------6------------------");
        List<Integer> s6 = new ArrayList<>();
        for(int i = squareMagic0.length-1; i >= 0; i--) {
            //List<Integer> s6 = new ArrayList<>();
            for(int j = squareMagic0[i].length-1; j >= 0; j--) {
                
                squareMagic5[i][j] = squareMagic0[j][i];
                System.out.print(squareMagic5[i][j] + " ");
                
                /*matrix[i][j] = squareMagic5[i][j];
                s6.addAll(Arrays.asList(matrix[i][j]));*/
                int item = squareMagic5[i][j];
                s6.add(item);
            }
            System.out.println();
            //s.add(s6);
        }
        
        s.add(s6);
        System.out.println("--------------7------------------");
        
        List<List<Integer>> sx = new ArrayList<>();
        List<Integer> s7 = new ArrayList<>();
        for(int i = 0; i < squareMagic1.length; i++) {
            
            //List<Integer> s7 = new ArrayList<>();
            for(int j = n-1; j >= 0; j--) {
              
                squareMagic6[i][j] = squareMagic1[j][i];
                System.out.print(squareMagic6[i][j] + " ");
                
                /*matrix[i][j] = squareMagic6[i][j];
                s7.addAll(Arrays.asList(matrix[i][j]));*/
                int item = squareMagic6[i][j];
                s7.add(item);
                //s71.add(item);
            }
            System.out.println();
            //s.add(s7);
        }
        
        s.add(s7);
        
        System.out.println("--------------8------------------");
        List<Integer> s8 = new ArrayList<>();
        for(int i = n-1; i >= 0; i--) {
            
           // List<Integer> s8 = new ArrayList<>();

           for(int j = 0; j < squareMagic2.length; j++) {

               squareMagic7[i][j] = squareMagic2[j][i];
               System.out.print(squareMagic7[i][j] + " ");
               
               /*matrix[i][j] = squareMagic7[i][j];
               s8.addAll(Arrays.asList(matrix[i][j]));*/
               int item = squareMagic7[i][j];
               s8.add(item);
           }
           System.out.println();
           //s.add(s8);
       }
        
        s.add(s8);
        
        System.out.println("--------------12345678------------------");
        
        for(int r = 0; r < s.size(); r++) {
            
            for(int c = 0; c < s.get(r).size(); c++) {
                
                System.out.print(s.get(r).get(c) + " ");
            
            }
            
            System.out.println();
            
        }
        
        System.out.println("--------------12345678------------------");
        int _min = 0;
        for(int t = 0; t < s.size(); t++) {
            
            int min_cost = 100;
            
            for(int r = 0; r < n; r++) {
                
                int temp = 0;
                
                for(int c = 0; c < n; c++) {
                    
                    if(s.get(r).get(c) != square[r][c]) temp += Math.abs(s.get(r).get(c) - square[r][c]);
                
                }
            
                if(temp < min_cost) min_cost = temp; _min = min_cost;
                
            }
            
            
            
        
        }
        
        System.err.println("MIN: " + _min);
        
        /* Confronto tra le due matrici */
        int diff1 = 0, diff2 = 0, diff3 = 0, diff4 = 0;
        int diff5 = 0, diff6 = 0, diff7 = 0, diff8 = 0;
        int max = 0;
        int min = 0; //System.err.println("MAX: " + max + " - MIN: " + min);
        /*for(int i = 0; i < n; i++) {
            
            for(int j = 0; j < n; j++) {
                
               // System.err.println(square[i][j] + " - " + squareMagic[i][j]);
                
                if(square[i][j] != squareMagic[i][j]) {
                
                    diff1 = Math.abs(square[i][j] - squareMagic0[i][j]);
                    diff2 = Math.abs(square[i][j] - squareMagic1[i][j]);
                    diff3 = Math.abs(square[i][j] - squareMagic2[i][j]);
                    diff4 = Math.abs(square[i][j] - squareMagic3[i][j]);
                    diff5 = Math.abs(square[i][j] - squareMagic4[i][j]);
                    diff6 = Math.abs(square[i][j] - squareMagic5[i][j]);
                    diff7 = Math.abs(square[i][j] - squareMagic6[i][j]);
                    diff8 = Math.abs(square[i][j] - squareMagic7[i][j]);

                }
            
            }
            System.out.println();
        }*/
        
        /*s.add(s1);
        s.add(s2);
        s.add(s3);
        s.add(s4);
        s.add(s5);
        s.add(s6);
        s.add(s7);
        s.add(s8);
        
      
        
        System.out.println("---------------1234---------------------");
       
        for(int x = 0; x < s.size(); x++) {
            for(int y = 0; y < s.get(x).size(); y++) {

                System.out.print(s.get(x).get(y) + " ");
               // diff1 += Math.abs(square[x][y] - s.get(x).get(y));

            }

            System.out.println();

        }
        
        for(int i = 0; i < s.size(); i++) {
        
            int temp = 0;
            
            for(int x = 0; x < n; x++) {
                
                for(int y = 0; y < n; y++) {
                
                    if(matrix[x][y] != s.get(x).get(y)) {
                        temp += Math.abs(matrix[x][y] - s.get(x).get(y));
                    }
                }
            
            }
            System.err.println("MIN: " + temp);
            if(temp < min) {
                min = temp;
            }
            
        }
        
        
        
        
        /*System.err.println("diff1: " + diff1);
        System.err.println("diff2: " + diff2);
        System.err.println("diff3: " + diff3);
        System.err.println("diff4: " + diff4);
        System.err.println("diff5: " + diff5);
        System.err.println("diff6: " + diff6);
        System.err.println("diff7: " + diff7);
        System.err.println("diff8: " + diff8);
        
        /**
         * Per ripetizione e ricordare come si calcolano le diagonali primarie&secodarie, la somma delle righe e la somma delle colonne
        */
            /*int sumTotal = 0;
            int sumDiagonalePrin = 0, sumDiagonaleSec = 0;
            List<Integer> listaSomme = new ArrayList<>();
            for(int r = 0; r < values.length; r++) {

               int sumR = 0; // si inzializza a ciascuna iterazione del ciclo esterno, quindi per ciascuna riga
               int sumC = 0;

               sumDiagonalePrin += values[r][r]; // somma diagonale principale

               for(int c = 0; c < values[r].length; c++) {

                   sumR += values[r][c]; // somma per ogni riga
                   sumC += values[c][r]; // somma per ogni colonna. Per le colonne, convertire gli indici
                   sumTotal += values[r][c]; // somma di ogni elemento della matrice

               }

               sumDiagonaleSec += values[r][values.length-r-1]; //somma diagonale secondaria

               //sumRow += sumR; // somma di tutte le righe
               //sumColumn += sumC; // somma di tutte le colonne

               listaSomme.add(sumR);
               listaSomme.add(sumC);

            }

            //System.err.println(sumTotal);
            listaSomme.add(sumDiagonalePrin);
            listaSomme.add(sumDiagonaleSec);

            //System.err.println(listaSomme);
            int max = 0;
            for(int value : listaSomme) {
                if(value > max) {
                    max = value;
                }
            }*/
        
        
        
       //System.err.println("max: " + max);
        
        //System.err.println(column);
        //result = formingMagicSquare(s);
        
        return result;
    
    }
    
   /**
    * Problem: https://www.hackerrank.com/challenges/magic-square-forming/problem - Forming a Magic Square
    * @param List<List<Integer>>
    * @return int
    * guide: http://dm.unife.it/geometria/Mat_Magiche/matmagdef.htm
   */
    private static int formingMagicSquare(List<List<Integer>> s) {
        
        System.err.println(s);
        
        return 0;
        
    }
    
}
