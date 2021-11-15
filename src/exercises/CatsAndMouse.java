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
public class CatsAndMouse {
    
    public String resultProblem() {
    
        String result = "";
        
        /*int x = 1; // position first cat
        int y = 3; // position second cat
        int z = 2; // position mouse*/
        
        /*int x = 1; // position first cat
        int y = 2; // position second cat
        int z = 3; // position mouse*/
        
        /*int x = 22; // position first cat
        int y = 75; // position second cat
        int z = 70; // position mouse*/
       
        /*int x = 100; // position first cat
        int y = 11; // position second cat
        int z = 55; // position mouse*/
        
        int x = 20; // position first cat
        int y = 49; // position second cat
        int z = 93; // position mouse
        
        result = catsAndMouse(x, y, z);
        System.out.println(result);
        
        return result;
    
    }
    
    /**
     * Problem: https://www.hackerrank.com/challenges/cats-and-a-mouse/problem
     * @param int x -> Position first cat
     * @param int y -> Position second cat
     * @param int z -> Position mouse
     * @return String
    */
    private static String catsAndMouse(int x, int y, int z) {
        
        String result = "";
        
        int distanceXZ = (z < x) ? (x - z) : (z - x);
        int distanzeYZ = (z < y) ? (y - z) : (z - y);
        
        if(distanceXZ < distanzeYZ) {
            return "Cat A";
        } else if(distanzeYZ < distanceXZ) {
             return "Cat B";
        } else if(distanzeYZ == distanceXZ) {
            return "Mouse C";
        }
        
        return result;
    
    }
    
}
