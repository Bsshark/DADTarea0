/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareas;
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
        System.out.print("Nombre: "+ f.getName() + "");
    }
}
