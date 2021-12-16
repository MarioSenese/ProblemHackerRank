/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
@SuppressWarnings("StaticNonFinalUsedInInitialization")
public class JavaStaticInitializerBlock {
    
    static boolean flag;
    static int B;
    static int H;
    
    static Scanner scanner;
    
    static {
        
        scanner = new Scanner(System.in);
        
        //B = scanner.nextInt();
        //H = scanner.nextInt();
        
        //B = 1;
        //H = 3;
       
        B = -1;
        H = 3;
        
        if(B <= 0 || H <= 0) {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else {
            flag = true;
        }
    
    }
    
    public static void resultProblem() {
        
        if(flag) {
            int area = B*H;
            System.out.println(area);
        }
    
    }
    
}
