/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea123;

import java.io.File;

/**
 *
 * @author 2dama
 */
public class tarea123 {
    public static void main(String[] args){
        //Realiza un programa al que se le pase un determinado fichero y nos muestre la
        //Siguiente información: Nombre, Ruta relativa, Ruta absoluta, Si se puede escribir en él
        //si es de lectura, tamaño, si es directorio y si es fichero
        String si = "Sí";
        String no = "No";
        
        File f = new File("tarea123.txt");
        System.out.println("Nombre: "+ f.getName());
        System.out.println("Ruta: " + f.getPath());
        System.out.println("Ruta absoluta: "+ f.getAbsolutePath());
        System.out.print("Se puede escribir: ");
        if(f.canWrite()){
            System.out.println(si);
        }else{
            System.out.println(no);
        }
        System.out.print("Se puede leer: ");
        if(f.canRead()){
            System.out.println(si);
        }else{
            System.out.println(no);
        }
        System.out.println("Tamaño: " + f.getTotalSpace());
        System.out.print("Es fichero: ");
        if(f.isFile()){
            System.out.println(si);
        }else{
            System.out.println(no);
        }
        System.out.print("Es directorio: ");
        if(f.isDirectory()){
            System.out.println(si);
        }else{
            System.out.println(no);
        }
        
    }
}
