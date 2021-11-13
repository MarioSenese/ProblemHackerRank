/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises;

import exercises.File.File;
import exercises.File.Log;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.io.IOUtils;


/**
 *
 * @author Mario
 */
public class ElectronicsShop {
    
    /**
     * Definizione della costante PROPERTIES
    */
    private static final String PROPERTIES = "properties.properties";
    
    public int resultProblem() throws IOException {
        
        File file = null;
        
        /*int budget = 60;
        int[] keyboards = {40, 50, 60};
        int[] drives = {5, 8, 12};*/

        /*int budget = 10;
        int[] keyboards = {3, 1};
        int[] drives = {5, 2, 8};*/
       
        /*int budget = 5;
        int[] keyboards = {4};
        int[] drives = {5};*/
        
        // Leggiamo i valori da un file
        file = new File();
        FileInputStream fileInputStream = file.File(PROPERTIES, "properties.valuesElectronicsShop"); // first file with values
        //FileInputStream fileInputStream = file.File(PROPERTIES, "properties.valuesElectronicsShop1"); // second file with values
        //FileInputStream fileInputStream = file.File(PROPERTIES, "properties.valuesElectronicsShop2"); // third file with values
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
        
        String strLine = null, keyboardsString = null, drivesString = null;
        int budget = 0;
        while ((strLine = bufferedReader.readLine()) != null)   {
          
            /*  System.out.println(strLine); System.out.println(bufferedReader.readLine());*/
            
            budget = Integer.parseInt(strLine.split(" ")[0]); // valore del budget - first line, index 0
            keyboardsString = bufferedReader.readLine(); // valori dei keyboards - second line
            drivesString = bufferedReader.readLine(); // valori dei drives - third line*/
          
        }
        
        //System.err.println(drivesString.split(" ")[1]);
        @SuppressWarnings("null")
        String[] arrayKeyboards = keyboardsString.split(" "); 
        @SuppressWarnings("null")
        String[] arrayDrives = drivesString.split(" "); 
        
        
        int[] keyboards = new int[arrayKeyboards.length];
        int[] drives = new int[arrayDrives.length];
        for(int i = 0; i < arrayKeyboards.length; i++) {
             keyboards[i] = Integer.parseInt(arrayKeyboards[i]);
        }
        for(int i = 0; i < arrayDrives.length; i++) {
             drives[i] = Integer.parseInt(arrayDrives[i]);
        }
       
        int result = getMoneySpent(keyboards, drives, budget);
    
        return result;
    }
    
    /**
     * Problema: https://www.hackerrank.com/challenges/electronics-shop/problem - Electronics Shop
     * @param int[] keyboards
     * @param int[] drives
     * @param int b -> budget
     * return Integer -> la spessa massima
     * 
    */
    private static int getMoneySpent(int[] keyboards, int[] drives, int b) {    
        
        int maxMoneySpent = -1;
        for(int keyboard : keyboards) {
            for(int drive : drives) {
                int sumPrices = keyboard + drive;
                if(sumPrices <= b) {
                    if(sumPrices > maxMoneySpent) {
                        maxMoneySpent = sumPrices;
                    }
                }
            }
        }

        return maxMoneySpent;
        
    }
    
}
