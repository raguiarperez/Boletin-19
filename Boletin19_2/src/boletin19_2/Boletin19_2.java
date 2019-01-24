/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19_2;

/**
 *
 * @author raguiarperez
 */
public class Boletin19_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Métodos notas = new Métodos(10);
    notas.mostrar();
    System.out.println("Aprobados: " +notas.aprobados());
    System.out.println("Nota media: " +notas.media());
    System.out.println("Nota mas alta: " +notas.notaMax());
            
    }
    
}
