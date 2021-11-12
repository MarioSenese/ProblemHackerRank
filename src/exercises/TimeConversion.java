/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Mario
 */
public class TimeConversion {
    
    public String resultProblem() {
        
        String dateInput = "07:05:45PM";
        String dateFormatted = timeConversion(dateInput);
    
        return dateFormatted;
        
    }
    
    /**
     * Problema: https://www.hackerrank.com/challenges/time-conversion/problem
     * @param dateString 
     * 07:05:45PM -> hh:mm:ssa 
     * 07:05:45 PM -> hh:mm:ss a
     * return String
    */
        private static String timeConversion(String dateString) {
            
            String fromPattern = "hh:mm:ssa"; // 12 hour time pattern with AM/PM
            
            String toPattern = "HH:mm:ss"; // 24 hour time pattern
            String time = dateString; //"09:15:34 PM";
            String output = null;

            DateFormat dfFrom = new SimpleDateFormat(fromPattern);
            DateFormat dfTo = new SimpleDateFormat(toPattern);
            
            try {
              Date date = dfFrom.parse(time); // converti stringa in data, seguendo il formato definito in dfFrom
              String changedTime = dfTo.format(date); // converti data in stringa, seguendo il formato definito in dfTo
              output = changedTime;
            } catch (ParseException e) {
              e.printStackTrace();
            }	
           
            
            return output;
        }
    
}
