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
        FileUtils fileUtils = null;
        
        while(!exit){
            println("");
            print("Dame tu opcion: ");
            input = new Scanner(System.in);
            option = input.nextInt();
            switch(option){
                case 1:
                    print("Dame el nombre del archivo: ");
                    fileUtils = new FileUtils(new Scanner(System.in).next());
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
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
