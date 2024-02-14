/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act3;

import java.util.Arrays;

/**
 *
 * @author User
 */
public class Act3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] numericArray = {120, 150, 55, 1000, 5};
        
        String[] stringArray = {"menard", "arnel","baji"};
        
        System.out.println("Your original array "+" "+ Arrays.toString(numericArray)+ "\n" +
                Arrays.toString(numericArray) +"\n"+
                Arrays.toString(stringArray));
        
        Arrays.sort(numericArray);
        System.out.println("your sorted array" + Arrays.toString(numericArray));
        Arrays.toString(numericArray);
    }
    
}
