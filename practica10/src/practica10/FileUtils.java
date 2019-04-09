/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica10;


import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author edaII05alu19
 */
public class FileUtils implements printMethods{
    
    FileWriter fileWriter = null;
    FileReader fileReader = null;
    
    String fileName;
    
    public FileUtils(String fileName){
        this.fileName = fileName;
       
        try{
            fileReader = new FileReader(fileName);
            fileWriter = new FileWriter(fileName);
        }catch(IOException ex){
            println(ex);
        }
    }
    
}
