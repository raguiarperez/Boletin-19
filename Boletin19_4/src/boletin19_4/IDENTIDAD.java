/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19_4;

import javax.swing.JOptionPane;

/**
 *
 * @author raguiarperez
 */
public class IDENTIDAD {
    
 public void letra(int[] arrayI,String[] arrayS){
     int dni=Integer.parseInt(JOptionPane.showInputDialog("Número DNI: "));
     int resto=dni%23;
      for (int i = 0; i < arrayI.length; i++) {
           if(resto==arrayI[i]){
            System.out.println("\nnº: " + arrayI[i]+"--> "+ arrayS[i]);           
           }
        }
 }   
    

}
