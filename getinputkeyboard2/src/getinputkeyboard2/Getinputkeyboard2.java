/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getinputkeyboard2;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Getinputkeyboard2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int no1;
        int no2;
        int no3;
        int rata;
        try {
            no1 = Integer.parseInt(JOptionPane.showInputDialog("Number 1 = "));
            no2 = Integer.parseInt(JOptionPane.showInputDialog("Number 2 = "));
            no3 = Integer.parseInt(JOptionPane.showInputDialog("Number 3 = "));
            rata = ((no1+no2+no3)/3);
            String msg = "Rata-rata = "+rata;
                JOptionPane.showMessageDialog(null,msg);
        }catch (Exception e){
                JOptionPane.showMessageDialog(null,"eror");
        }
        // TODO code application logic here
    }
    
}
