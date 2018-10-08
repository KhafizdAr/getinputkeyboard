/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getinputkeyboard;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author user
 */
public class Getinputkeyboard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                BufferedReader dataIn = new BufferedReader (new InputStreamReader(System.in));
        int no1;
        int no2;
        int no3;
        int rata;
        try {
            System.out.print("Number 1 = ");
            no1 = Integer.parseInt(dataIn.readLine());
            System.out.print("Number 2 = ");
            no2 = Integer.parseInt(dataIn.readLine());
            System.out.print("Number 3 = ");
            no3 = Integer.parseInt(dataIn.readLine());
            rata = ((no1+no2+no3)/3);
            System.out.println("Rata-rata = "+rata);
            
        }catch (Exception e){
             System.out.println("eror");
             System.exit(1);
        }
        // TODO code application logic here
    }
    
}
