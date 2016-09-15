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
public class tarea121y122 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File f = new File("prueba2.txt");
        
        System.out.println(f.getAbsolutePath());
        if(f.exists()){
            System.out.println("El archivo existe");
        }else{
            System.out.println("El archivo no existe");
        }
        //Realiza un programa al que se le pase un determinado fichero y nos muestre la
        //Siguiente información: Nombre, Ruta relativa, Ruta absoluta, Si se puede escribir en él
        //si es de lectura, tamaño, si es directorio y si es un fichero
    }
    
}
