/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica10;

/**
 *
 * @author edaII05alu19
 */
public interface printMethods {
    default void print(Object arg){
        System.out.print(arg);
    }
    
    default void println(Object arg){
        System.out.println(arg);
    }
}
