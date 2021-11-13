/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises.File;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author Mario
 */
public class Log {
    
    /**
     * Definizione del file log
    */
    private static final java.io.File LOG = new java.io.File("log.log");
    
    /**
     * Data
    */
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-mm-dd HH:mm:ss");
    
    /**
     * Funzione per scrittura sul file log
     * @param message
     * @param append
     * 
    */
    public static synchronized void writeLog(String message, boolean append) throws IOException {
        
        // Data/Ora odierna
        LocalDateTime logTime = LocalDateTime.now();
        
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(logTime.format(FORMATTER));
        stringBuilder.append(" ==> ");
        stringBuilder.append(message);
        
        /**
         * Avvia scrittura su file con FileUtils.writeStringToFile
        */
         FileUtils.writeStringToFile(LOG, message, StandardCharsets.UTF_8, append);
        
    }
    
    
}
