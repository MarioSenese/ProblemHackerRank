/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises;

/**
 *
 * @author Mario
 */
public class JavaLoopsII {
    
    
    /**
     * Problem: https://www.hackerrank.com/challenges/java-loops/problem
    */
    public static void resultProblem() {
        
        int t = 2; // num queries
        //  int a = 0; int b = 2; int n = 10;
        int a = 5; int b = 3; int n = 5;
        
        for(int i = 0; i < t; i++) {
            
            double sum = 0;
            for(int l = 1; l <= n; l++) {
                
                double result = Math.pow(2, l-1);
                sum += result*b;
                int total = (int)(a + sum);
                System.out.print(total + " ");
            
            }
            System.out.println();
            
        }
        
    }
    
}
