/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19_2;

import java.util.Random;

/**
 *
 * @author raguiarperez
 */
public class Métodos {
       int[] notas;

    public Métodos(int numeroDeNotas) {
        notas=new int[numeroDeNotas];
        randNotas();
    }
    
    
    public void randNotas(){
        Random rand = new Random();
        for(int i=0;i<notas.length ; i++){
            notas[i]=rand.nextInt(10);
        }
    }
    public static void mostrar(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i+" : "+array[i]);
        }
    }
    public void mostrar(){
        mostrar(notas);
    }
    
    public static int aprobados(int[] array){
        int aprobados=0;
        for(int ele :array){
            if (ele > 4)aprobados++;
        }
        return aprobados;    
    }
    public int aprobados(){
        return aprobados(notas);
    }
    public static float media(int[] array){
        int total=0, notas = 0;
        for(int nota : array){
            total+=nota;
            notas++;
        }
        return total/notas;
    }
    public float media(){
        return media(notas);
    }
    public static int indiceNotaMax(int[] array){
        int notaMax=0, indexMax=-1;
        for(int i = 0; i<array.length;i++){
            if(array[i]>notaMax){
                notaMax=array[i];
                indexMax=i;
            }
            
        }
        return indexMax;
    }
    public int indiceNotaMax(){
        return indiceNotaMax(notas);
    }
    public static int notaMax(int[] array){
        return array[indiceNotaMax(array)];
    }
    public int notaMax(){
        return notaMax(notas);
    }
    

}
