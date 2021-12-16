/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class JavaEndoffile {
    
    private static Scanner scanner = null;
    
    private static final String PROPERTIES = "properties.properties";
    
    public static void resultProblem() throws IOException {
        
        exercises.File.File file = null;
        String s =  "Hello world\n" +
                    "I am a file\n" +
                    "Read me until end-of-file.";
        
        //scanner = new Scanner(s);
        
        String s1 = "eqi wulp maq\n" +
                    "qni d\n" +
                    "m gugdsulk\n" +
                    "i f\n" +
                    "ds j\n" +
                    "s\n" +
                    "b e xfn\n" +
                    "cb\n" +
                    "g bukc\n" +
                    "hf wuoo imv g\n" +
                    "f su ia twh h\n" +
                    "e te wr ord\n" +
                    "sk f e j\n" +
                    "q\n" +
                    "glo v s\n" +
                    "s x deuwqj\n" +
                    "u\n" +
                    "gd upf mxdh h\n" +
                    "mrcw nx wx\n" +
                    "bvk wiq{-truncated-}";
        
       //scanner = new Scanner(s1);
        
        file = new exercises.File.File();
        FileInputStream fileInputStream = file.File(PROPERTIES, "properties.javaEndOfFile"); // prendiamo l'input dal file 
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
        
        scanner = new Scanner(fileInputStream);
        
        int lineNumber = 1;
        
        while(scanner.hasNextLine()) {
            
            String stringLine = scanner.nextLine();
            
            System.out.println(lineNumber + " " + stringLine);
            
            
            lineNumber++;
            
        }
        
        
    }
    
}
