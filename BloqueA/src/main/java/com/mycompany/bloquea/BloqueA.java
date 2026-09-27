/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bloquea;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author samah
 */
public class BloqueA {

  public static void main(String[] args) {
        
       ejercicio1();
       ejercicio2();
       ejercicio3();

    }
    
    public static void ejercicio1(){
    
     File carpeta = new File("ficheros_dam");
       
        if(carpeta.exists()){
          System.out.println("la carpeta existe");
          
           if(carpeta.isDirectory()){
        System.out.println("la carpeta es un directorio");
            System.out.println("numero de archivos: "+ carpeta.list().length);
    
           }else{
           
           System.out.println("existe pero no es directorio");
           }    
     
        }else{
      System.out.println("no es un directorio");
            
           carpeta.mkdir();
           
           File nuevaCarpeta = new File(carpeta,"setup.log");
         
        try{ if(nuevaCarpeta.createNewFile()){
         
             System.out.println("Nuevo directorio creado correctamente");
         
         }
       
        }catch(IOException e){
        
        System.err.println("Error al crear"+ e.getMessage());
        }
       
           
        }
        
        
    
    }
    
    
    public static void ejercicio2(){
    
    //Ejercicio 2: El limpiador de temporales. Crea un pr
    //ograma que busque un archivo llamado temp.bak dentro de una ruta introducida 
   // por el usuario. Si el archivo existe, debe borrarlo y 
     // mostrar un mensaje de confirmación. Si no existe, debe avisar al usuario.
     
     Scanner sc = new Scanner(System.in);
     
       System.out.println("Introduce la ruta:");
       String rutaA = sc.nextLine();
       File Archivo = new File(rutaA,"temp.bak");
     
     
     if(Archivo.exists()){
     
         System.out.println("El archivo existe");
         if(Archivo.delete()){
         
          System.out.println("El archivo ha sido borrado");
         }
     
     }else{
         System.out.println("El archivo no existe");
     }
     
    
    
    }
    
    
    public static void ejercicio3(){
        
        // crear las carpetas anidadas
      File carpeta = new File("MurciaFP/2026/AccesoDatos");

        if (carpeta.exists()){
            System.out.println("La carpeta ya existia: " + carpeta.getPath());
            
        }else if(carpeta.mkdirs()){
            System.out.println(" Estructura creada: " + carpeta.getPath());
            
        }else{
            System.out.println("No se pudo crear la estructura.");
        }

        // para renombrar la carpeta AccesoDatos a AD_backup
        File carpetaNueva = new File("MurciaFP/2026/AD_Backup");

        if (carpeta.renameTo(carpetaNueva)){
            System.out.println("Carpeta renombrada a: " + carpetaNueva.getPath());
            
        }else{
            System.out.println("No se pudo renombrar la carpeta.");
        }
    
       
        }
    
    
  
}
