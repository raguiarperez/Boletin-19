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
    
 public void letra(int[] arrayL,String[] arrayS){
     int dni=Integer.parseInt(JOptionPane.showInputDialog("Número DNI: "));
     int resto=dni%23;
      for (int i = 0; i < arrayL.length; i++) {
           if(resto==arrayL[i]){
            System.out.println("\nnº: " + arrayL[i]+"--> "+ arrayS[i]);           
           }
        }
 }   
    

}
