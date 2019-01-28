/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19_3;

import javax.swing.JOptionPane;

/**
 *
 * @author raguiarperez
 */
public class Notas {
       //Método para introducir valores.

    public int darValorInt() {
        return Integer.parseInt(JOptionPane.showInputDialog("Nota: "));
    }

    public String darValorString() {
        return JOptionPane.showInputDialog("Nombre alumno: ");
    }

    //Método que visualiza los alumnos aprobados.
    public void aprobados(int[] arrayI, String[] arrayS) {

        for (int i = 0; i < arrayI.length; i++) {
            if (arrayI[i] >= 5.0) {
                System.out.println(arrayS[i]);
            }
        }
    }

    //Método para introducir valores de notas y nombres de alumnos.
    public void notasAlumnos(int[] arrayI, String[] arrayS) {
        for (int i = 0; i < arrayI.length; i++) {
            arrayI[i] = darValorInt();
            arrayS[i] = darValorString();
        }
    }

    //Método para ordenar las notas en orden creciente.
    public void lista(int[] arrayI, String[] arrayS) {

        int aux;
        String aux2;
        for (int i = 0; i < arrayI.length - 1; i++) {
            for (int j = i + 1; j < arrayI.length; j++) {
                if (arrayI[i] > arrayI[j]) {
                    aux = arrayI[i];
                    arrayI[i] = arrayI[j];
                    arrayI[j] = aux;
                    aux2 = arrayS[i];
                    arrayS[i] = arrayS[j];
                    arrayS[j] = aux2;
                }
            }
        }
    }

    //Método para visualizar los alumnos y sus notas.
    public void visualizarLista(int[] arrayI, String[] arrayS) {
        for (int i = 0; i < arrayI.length; i++) {
            System.out.println("\nAlumno: " + arrayS[i]);
            System.out.println("Nota: " + arrayI[i]);

        }
    }
     //Método para visualizar la nota de un alumno.
    public void visualizarAlumno(int[] arrayI, String[] arrayS) {
        String alumno = darValorString();
        for (int i = 0; i < arrayS.length; i++) {
            if (alumno == arrayS[i]) {
                System.out.println("Nota: " + arrayI[i]);
            }
        }
    }
}
