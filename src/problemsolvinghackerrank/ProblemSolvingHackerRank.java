/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemsolvinghackerrank;

import exercises.BirthdayCakeCandles;
import exercises.CountingValleys;
import exercises.DesignerPdfViewer;
import exercises.MinMaxSum;
import exercises.SalesByMatch;
import exercises.TimeConversion;

/**
 *
 * @author Mario
 */
public class ProblemSolvingHackerRank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        DesignerPdfViewer designerPdfViewer = new DesignerPdfViewer();
        int resultProblem1 = designerPdfViewer.resultProblem();
        
        TimeConversion timeConversion = new TimeConversion();
        String resultProblem2 = timeConversion.resultProblem();
        
        BirthdayCakeCandles birthdayCakeCandles = new BirthdayCakeCandles();
        int resultProblem3 = birthdayCakeCandles.resultProblem();
        
        MinMaxSum minMaxSum = new MinMaxSum();
        minMaxSum.resultProblem(); // 4 Result problem
        
        SalesByMatch salesByMatch = new SalesByMatch();
        int resultProblem5 = salesByMatch.resultProblem();
        
        CountingValleys countingValleys = new CountingValleys();
        int resultProblem6 = countingValleys.resultProblem();
        
        
    }
    
}
