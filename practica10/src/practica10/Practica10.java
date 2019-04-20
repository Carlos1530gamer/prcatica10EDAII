/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica10;

import java.util.Scanner;

/**
 *
 * @author edaII05alu19
 */
public class Practica10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean exit = false;
        Scanner input;
        int option;
        FileUtils fileUtils = FileUtils.instance;//referencia al singleton
        
        while(!exit){
            println("*********************************************");
            println("*                MENU PRINCIPAL             *");
            println("*********************************************");
            println("* 1) Crear un nuevo archivo                 *");
            println("* 2) Sobre-escribir un archivo              *");
            println("* 3) Modificar un archivo                   *");
            println("* 4) Eliminar un archivo                    *");
            println("* 0) Terminar el programa                   *");
            println("*********************************************");
            print("Dame tu opcion: ");
            input = new Scanner(System.in);
            option = input.nextInt();
            switch(option){
                case 1:
                    print("Dame el nombre del archivo que deseas crear: ");
                    fileUtils.createNewFileWithName(new Scanner(System.in).next());
                    break;
                case 2:
                    print("Dame el nombre del archivo que deseas modificar: ");
                    fileUtils.overWriteFileWithName(new Scanner(System.in).next());
                    break;
                case 3:
                    print("Dame el nombre del archivo al que deseas agregar mas cosas: ");
                    fileUtils.modifyFileWithName(new Scanner(System.in).next());
                    break;
                case 4:
                    print("Dame el nombre del archivo a eliminar: ");
                    fileUtils.deleteFileWithName(new Scanner(System.in).next());
                    break;
                case 0:
                    exit = true;
                    println("Gracias por utilizar el programa");
                    break;
                default:
                    break;
            }
        }
    }
    
    private static void print(Object arg){
        System.out.print(arg);
    }
    
    private static void println(Object arg){
        System.out.println(arg);
    }
    
}
