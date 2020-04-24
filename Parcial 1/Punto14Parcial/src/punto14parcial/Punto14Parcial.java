/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto14parcial;

import java.util.Scanner;

/**
 *
 * @author Jefry Daza
 */
public class Punto14Parcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingtrese el valor de X");
        int x=sc.nextInt();
        System.out.println("Ingrese el valor de Y");
        int y=sc.nextInt();
        
        if(x==0 && y==0){
            System.out.println("El punto esta en el eje");
        }else if(x>0 && y>0){
            System.out.println("El punto esta en: Q1");
        }else if(x<0 && y>0){
            System.out.println("El punto esta en Q2");
        }else if(x<0 && y<0){
            System.out.println("El punto esta en Q3");
        }else if(x>0 && y<0){
            System.out.println("El punto esta en Q4");
        }else if(x==0 && y>0){
            System.out.println("El punto esta entre Q1 Y Q2");
        }else if(x==0 && y<0){
            System.out.println("El punto esta entre Q3 Y Q4");
        }else if(x>0 && y==0){
            System.out.println("El puNto esta entre Q1 Y Q4");
        }else if(x<0 && y==0){
            System.out.println("El punto esta entre Q2 Y Q3");
        }
        
        
        
    }
    
}
