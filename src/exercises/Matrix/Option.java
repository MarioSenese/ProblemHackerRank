/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises.Matrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.toList;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author Mario
 */
public class Option {
    
    public ArrayList<int[][]> getOptions(int[][] squareMagic) {
        
        int n = squareMagic.length;
        ArrayList<int[][]> list = new ArrayList<>();
        
        list.add(squareMagic);
        //System.out.println(Arrays.deepToString(squareMagic)); // matrice normale
        
        int[][] squareMagicTraspost = new int[n][n];
        squareMagicTraspost = traspostMatrix(squareMagic, n); // matrice principale trasposta
        list.add(squareMagicTraspost);        
        //System.out.println(Arrays.deepToString(squareMagicTraspost));
        
        int[][] squareMagicConvertedRows = new int[n][n];
        squareMagicConvertedRows = convertiRighe(squareMagic, n); // matrice principale con righe convertite
        list.add(squareMagicConvertedRows);
        // System.out.println(Arrays.deepToString(squareMagicConvertedRows));
        
        int[][] squareMagicConvertedColumns = new int[n][n];
        squareMagicConvertedColumns = convertiColonne(squareMagic, n); // matrice principale con colonne convertite
        list.add(squareMagicConvertedColumns);
       // System.out.println(Arrays.deepToString(squareMagicConvertedColumns));
        
        int[][] squareMagicConvertedRows2 = new int[n][n];
        squareMagicConvertedRows2 = convertiRighe(squareMagicConvertedRows, n); // matrice principale con righe convertite per due volte
        list.add(squareMagicConvertedRows2);
        //System.out.println(Arrays.deepToString(squareMagicConvertedRows2));
        
        int[][] squareMagicTConvertedRows = new int[n][n];
        squareMagicTConvertedRows = convertiRighe(squareMagicTraspost, n); // matrice trasposta con righe convertite
        list.add(squareMagicTConvertedRows);
        //System.out.println(Arrays.deepToString(squareMagicTConvertedRows));
        
        int[][] squareMagicTConvertedColumns = new int[n][n];
        squareMagicTConvertedColumns = convertiColonne(squareMagicTraspost, n); // matrice trasposta con colonne convertite
        list.add(squareMagicTConvertedColumns);
       // System.out.println(Arrays.deepToString(squareMagicTConvertedColumns));
         
        int[][] squareMagicConvertedRowsT2 = new int[n][n];
        squareMagicConvertedRowsT2 = convertiRighe(squareMagicTConvertedRows, n); // matrice trasposta con righe convertite per due volte
        list.add(squareMagicConvertedRowsT2);
        //System.out.println(Arrays.deepToString(squareMagicConvertedRowsT2));
        
       
        
        return list;
    }

    private int[][] traspostMatrix(int[][] squareMagic, int n) {
        
        int[][] square = new int[n][n];
        
        for(int r = 0; r < squareMagic.length; r++) {
            
            for(int c = 0; c < squareMagic[r].length; c++) {
                
                square[r][c] = squareMagic[c][r];
      
            }
            
        }
        
        
        return square;
        
    }

    private int[][] convertiColonne(int[][] square, int n) {
        
        for(int r = 0; r < square.length; r++) {
            
            for(int c = 0; c < square[r].length/2; c++) {
            
                int temp = square[r][c];
                square[r][c] = square[r][square[r].length - c - 1];
                square[r][square[r].length - c - 1] = temp;
                
            }
            
        }
        
        return square;
        
    }

    private int[][] convertiRighe(int[][] square, int n) {
        
        for(int r = 0; r < square.length/2; r++) {
            
            for(int c = 0; c < square[r].length; c++) {
            
                int temp = square[r][c];
                square[r][c] = square[square.length-r-1][c];
                square[square.length-r-1][c] = temp;
                
            }
            
        }
        
        return square;
        
    }

    

   
    
    
}
