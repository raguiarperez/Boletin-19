/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19_3;

/**
 *
 * @author raguiarperez
 */
public class Boletin19_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tamaño=30;
        int[] notas=new int[tamaño];
        String[] alumnos=new String[tamaño];
        Notas clase=new Notas();
        clase.notasAlumnos(notas,alumnos);
        clase.lista(notas, alumnos);
        clase.visualizarLista(notas, alumnos);
        clase.visualizarAlumno(notas, alumnos);
    }
    
}
    

