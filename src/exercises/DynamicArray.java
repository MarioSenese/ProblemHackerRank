/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class DynamicArray {
    
    private static Scanner scanner = null;
    
    private static final String PROPERTIES = "properties.properties";
    
    /**
     * Problem: https://www.hackerrank.com/challenges/dynamic-array/problem
    */
    public List<Integer> resultProblem() throws IOException {
        
    exercises.File.File file = null;
       
    List<Integer> result = new ArrayList<>();
    List<List<Integer>> queries = new ArrayList<>();
       
       //int n = 2;
       /*int _queries[][] = {
           {1, 0, 5}, 
           {1, 1, 7}, 
           {1, 0, 3}, 
           {2, 1, 0}, 
           {2, 1, 1}
       };*/
       
       int n = 0;
       file = new exercises.File.File();
       FileInputStream fileInputStream = file.File(PROPERTIES, "properties.dynamicArray2"); // prendiamo l'input dal file 
       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
       
       
        scanner = new Scanner(fileInputStream);
        int lineNumber = 1;
        
       
       
       String strLine = null; 
       strLine = scanner.nextLine();
       n =  Integer.parseInt(strLine.split(" ")[0]); System.err.println("n: " + n);
       List<Integer> q = null;
       //while ((strLine = bufferedReader.readLine()) != null)   {
        while(scanner.hasNextLine()) {
           
           strLine = scanner.nextLine();
           q = new ArrayList<>();
           try {

                Integer value1 = Integer.parseInt(strLine.split(" ")[0]);
                Integer value2 = Integer.parseInt(strLine.split(" ")[1]);
                Integer value3 = Integer.parseInt(strLine.split(" ")[2]);



                q.add(value1);
                q.add(value2);
                q.add(value3);

                queries.add(q);
               
           } catch (java.lang.ArrayIndexOutOfBoundsException err) {
               System.err.println(err);
           }
       }
        
       /*List<Integer> q = null;
       for(int r = 0; r < _queries.length; r++) {
           q = new ArrayList<>();
           Integer item = 0;
           for(int c = 0; c < _queries[r].length; c++) {
               item = _queries[r][c];
               q.add(item);
           }
           
           queries.add(q);
           
       }*/
       
      
        /*System.err.println(1^1); // 1 XOR 1 -> 0 - FALSE
        System.err.println(1^0); // 1 XOR 0 -> 1 - TRUE
        System.err.println(0^1); // 0 XOR 1 -> 1 - TRUE
        System.err.println(0^0); // 0 XOR 0 -> 0 - FALSE*/
        
        List<List<Integer>> arrIdx  = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            ArrayList<Integer> _arr = new ArrayList<>();
            arrIdx.add(_arr); // bidimensional array empty
        }
        int lastAnswer = 0; // Declare an integer and intialize to 0
        
        //System.out.println(queries.size());
        for(int r = 0; r < queries.size(); r++) { // for every row
            
            List<Integer> _q = queries.get(r); // get row
            int f = _q.get(0);
            int x = _q.get(1);
            int y = _q.get(2);
            int idx = (x ^ lastAnswer) % n; // ^ is operator XOR
            List<Integer> seq = new ArrayList<>(); 
            seq = arrIdx.get(idx);
            seq.add(0);
            if(f == 1) { // query 1
                seq.add(y);
            } else { // query 2
                int len = seq.size();
                lastAnswer = seq.get(y % len);
                result.add(lastAnswer); // add values lastAnswer in result array
            }
            
        }
       
        /*for(Integer value : result) {
            System.out.println(value);
            
        }*/
        
       return result;
        
    }
    
}
