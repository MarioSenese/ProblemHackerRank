/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mario
 */
public class File {
    
    /**
     * Costanten NEW_LINE - indipendente dal SO
    */
    private final static String NEW_LINE = System.getProperty("line.separator");
    
    public FileInputStream File(String PROPERTIES, String pathProperties) throws IOException {
    
        /**
         * Caricamento delle proprietà
        */
        Properties properties = loadProperties(PROPERTIES);
        
        /**
         * Definizione e Inizializzazione dell'oggetto StringBuilder
        */
        StringBuilder stringBuilder = null;
        
        if(properties == null) {
            
            stringBuilder = new StringBuilder();
            stringBuilder.append("Errore nel caricamento delle proprietà");
            stringBuilder.append(PROPERTIES);
            stringBuilder.append(NEW_LINE);
            Log.writeLog(stringBuilder.toString(), true);
            Log.writeLog("Programma terminato", true);
            System.exit(0);
            
        } else {
        
            stringBuilder = new StringBuilder();
            stringBuilder.append("Caricamento delle proprietà avvenuto con successo");
            stringBuilder.append(NEW_LINE);
            Log.writeLog(stringBuilder.toString(), false);

            /**
             * Scritture delle proprietà caricate
            */
            properties.forEach((key, value) -> {
                
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append(key.toString());
                    sb.append(" in ");
                    sb.append(value.toString());
                    sb.append(NEW_LINE);
                    Log.writeLog(sb.toString(), true);     
                } catch(IOException ioe) {
                    Logger.getLogger(File.class.getName()).log(Level.SEVERE, null, ioe);
                }
                
            });
            
            
        }
        
        Log.writeLog(NEW_LINE, true);
        
        /**
         * Caricamento del file
        */
        java.io.File myFile = loadFile(properties.getProperty(pathProperties));
        if(myFile == null) {
            
            stringBuilder = new StringBuilder();
            stringBuilder.append("Errore nel caricamento del file: ").append(myFile);
            stringBuilder.append(NEW_LINE);
            Log.writeLog(stringBuilder.toString(), true);
            Log.writeLog("Programma terminato", true);
            System.exit(0);
            
            return null;
            
        } else {
            
            stringBuilder = new StringBuilder();
            stringBuilder.append("Caricamento del file: ").append(myFile).append(" avvenuto con succeso");
            stringBuilder.append(NEW_LINE);
            Log.writeLog(stringBuilder.toString(), true);
            
            /**
             * Lettura del file con FileInputStream
            */
            FileInputStream fileInputStream = new FileInputStream(myFile);
            
            return fileInputStream;
            
            
        }
        
    }
    
    /**
     * Caricamento e lettura del file
     * @param path
     * @return Object File
    */
    private static java.io.File loadFile(String path) {
        
        try {
            java.io.File file = new java.io.File(path);
            if(!file.exists()) {
                Logger.getLogger(File.class.getName()).log(Level.SEVERE, "ERROR - Caricamento del file non avvenuto");
                return null;
            }
            return file;
        } catch(Exception ex) {
            return null;
        }
        
    }
    
    /**
     * Caricamento delle proprietà
     * @param PROPERTIES
     * @return Object Properties
    */
    private static Properties loadProperties(String PROPERTIES) {
        
        try (InputStream is = new FileInputStream(PROPERTIES)) {
            Properties properties = new Properties();
            properties.load(is);
            return properties;
        } catch (IOException ioe) {
            return null;
        }
        
    }

   
}
