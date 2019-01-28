package boletin19_3;

import javax.swing.JOptionPane;

/**
 * @author raguiarperez
 */
public class Notas {
    //Introducir valores.

    public int darValorInt() {
        return Integer.parseInt(JOptionPane.showInputDialog("Nota : "));
    }

    public String darValorString() {
        return JOptionPane.showInputDialog("Nombre alumno: ");
    }

    //Alumnos aprobados.
    public void aprobados(int[] arrayI, String[] arrayS) {

        for (int i = 0; i < arrayI.length; i++) {
            if (arrayI[i] >= 5.0) {
                System.out.println(arrayS[i]);
            }
        }
    }

    //Introducir notas y nombres de alumnos.
    public void notasAlumnos(int[] arrayI, String[] arrayS) {
        for (int i = 0; i < arrayI.length; i++) {
            arrayI[i] = darValorInt();
            arrayS[i] = darValorString();
        }
    }

    //Ordenar las notas en orden creciente.
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

    //Visualizar alumnos y notas.
    public void visualizarLista(int[] arrayI, String[] arrayS) {
        for (int i = 0; i < arrayI.length; i++) {
            System.out.println("\nAlumno: " + arrayS[i]);
            System.out.println("Nota: " + arrayI[i]);

        }
    }
    //Visualizar la nota de un alumno.

    public void visualizarAlumno(int[] arrayI, String[] arrayS) {
        String alumno = darValorString();
        for (int i = 0; i < arrayS.length; i++) {
            if (alumno == arrayS[i]) {
                System.out.println("Nota: " + arrayI[i]);
            }
        }
    }
}
