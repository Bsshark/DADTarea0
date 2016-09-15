/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareas;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author 2dama
 */
public class tareas125 {
    //Realiza un programa que cree un directorio y un fichero en el escritorio
    //Y que después pregunte si deseas borrarlos
    public static void main(String[] args){
        String path = "C:"+ File.separator +"Users" + File.separator + "Abraham" + File.separator + "Desktop" + File.separator + "prueba.txt";
        String pathdir = "C:"+ File.separator +"Users" + File.separator + "Abraham" + File.separator + "Desktop" + File.separator + "prueba";
        File f = new File(path);
        try {
            //f.getParentFile().mkdirs();
            if(f.createNewFile()){
                System.out.println("El archivo ha sido creado");
            }else{
                System.out.println("El archivo ya existe");
            }
        } catch (IOException ex) {
            Logger.getLogger(tareas125.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Directorio
        File dir = new File(pathdir);
        if(!dir.exists()){
            try{
                dir.mkdir();
            }
            catch(SecurityException se){
                
            }
        }else{
            System.out.println("El directorio ya existe");
        }
        //Preguntamos
        Scanner scan = new Scanner(System.in);
        System.out.print("¿Deseas borrarlos?(y/n)");
        String respuesta = scan.next();
        if(respuesta.equals("y") || respuesta.equals("Y")){
            f.delete();
            dir.delete();
            System.out.println("¡Borrados satisfactoriamente!");
        }else if(respuesta.equals("n") || respuesta.equals("n")){
            System.out.println("¡No se han borrado los archivos!");
        }else{
            System.out.println("¡Porfavor, introduce sólo Y o N!");
        }
    }
}
