/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemsolvinghackerrank;

import exercises.BirthdayCakeCandles;
import exercises.CatsAndMouse;
import exercises.CountingValleys;
import exercises.DesignerPdfViewer;
import exercises.ElectronicsShop;
import exercises.File.RepeatedString;
import exercises.FormingAMagicSquare;
import exercises.JavaDatatypes;
import exercises.JavaEndoffile;
import exercises.JavaLoopsII;
import exercises.JumpingOnClouds;
import exercises.MinMaxSum;
import exercises.SalesByMatch;
import exercises.TimeConversion;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class ProblemSolvingHackerRank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
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
        
        JumpingOnClouds jumpingOnClouds = new JumpingOnClouds();
        int resultProblems7 = jumpingOnClouds.resultProblem();
        
        ElectronicsShop electronicsShop = new ElectronicsShop();
        int resultProblem8 = electronicsShop.resultProblem();
        
        CatsAndMouse catsAndMouse = new CatsAndMouse();
        String resultProblem9 = catsAndMouse.resultProblem();
        
        FormingAMagicSquare formingAMagicSquare = new FormingAMagicSquare();
        int resultProblem10 = formingAMagicSquare.resultProblem();
        
        RepeatedString repeatedString = new RepeatedString();
        long resultProblem11 = repeatedString.resultProblem(); 
        
        // Per il contare il numero totale delle cifre presenti nel valore intero
        int i = 50;
        int count = 0;
        while(i != 0) {
            i = i / 10;
            ++count;
        }
        System.out.println(count);
        
        JavaLoopsII.resultProblem();
        
        JavaDatatypes.resultProblem();
        
        JavaEndoffile.resultProblem();
        
        
        
        
    }
    
}
