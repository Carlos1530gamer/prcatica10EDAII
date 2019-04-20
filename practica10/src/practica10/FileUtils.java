/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica10;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author edaII05alu19
 */
public class FileUtils implements printMethods{
    
    /*El uso del singlenton(Patron de disenio) es por que no nesecito crear muchos objetos solo una 
    referencia estatica de uno mismo*/
    static FileUtils instance = new FileUtils();
    
    public FileUtils(){
        print("el objeto fue referenciado");
    }
    
    public void createNewFileWithName(String fileName){
        final File file = new File(fileName);
        
        try{
            if(file.createNewFile()){
                println("El archivo fue creado exitosamente");
            }else{
                println("El objeto no pudo ser creado");
            }
        }catch(IOException exeption){
            print("Error al crear el archivo: " + exeption.getLocalizedMessage());
        }
        
    }
    
    public void overWriteFileWithName(String fileName){
        File file = new File(fileName);
        if(file.exists()){
            try {
                FileWriter fileWriter = new FileWriter(file);
                println("Escribe todo lo que deses:");
                fileWriter.write(new Scanner(System.in).next());
                fileWriter.close();
            } catch (IOException ex) {
                println("Error al tratar de escribir en el archivo: "+ ex.getLocalizedMessage());
            }
        }else{
            println("El archivo no existe si desea crearlo elija la opcion crear\nen el menu principal");
        }
    }
    
    public void modifyFileWithName(String fileName){
        final File file = new File(fileName);
        if(file.exists()){
            try {
                final BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                final String auxContFile = bufferedReader.readLine();
                bufferedReader.close();
                FileWriter fileWriter = new FileWriter(file);
                println("Escribe lo que deseas agregar al archivo: ");
                fileWriter.write(auxContFile + new Scanner(System.in).next());
                fileWriter.close();
            } catch (IOException ex) {
                println("Error al tratar de escribir en el archivo: " + ex.getLocalizedMessage());
            }
        }else{
            println("El archivo no existe si desea crearlo elija la opcion crear\nen el menu principal");
        }
    }
    
    public void deleteFileWithName(String fileName){
        File file = new File(fileName);
        
        if (file.exists()) {
            if(file.delete()){
                println("El archivo se elimino exitosamente ");
            }else{
                println("Error al eliminar el archivo");
            }
        }else{
            println("El archivo no existe si desea crearlo elija la opcion crear\nen el menu principal para despues eliminarlo :v");
        }
    }
}