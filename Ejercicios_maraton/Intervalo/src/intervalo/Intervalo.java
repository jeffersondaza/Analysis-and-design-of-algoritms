/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intervalo;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author jefry
 */
public class Intervalo {

    public void intervalo(float a) {
        if (0 <= a && a <= 25) {
            System.out.println("Esta en el intervalo entre 0 y 25");
        } else if (25 <= a && a <= 50) {
            System.out.println("Esta en el intervalo entre 25 y 50");
        } else if (50 <= a && a <= 75) {
            System.out.println("Esta en el intervalo entre 50 y 75");
        } else if (75 <= a && a <= 100) {
            System.out.println("Esta en el intervalo entre 75 y 100");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Ingrese un numero de punto flotante");
            float a = sc.nextFloat();
            Intervalo i = new Intervalo();
            i.intervalo(a);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " No se pueden datos de tipo caracter");
        }
    }
    
}
