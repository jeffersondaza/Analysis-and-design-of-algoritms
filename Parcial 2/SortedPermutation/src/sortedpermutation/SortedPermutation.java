/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortedpermutation;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author jefry
 */
public class SortedPermutation {

    /**
     * @param args the command line arguments
     */
    static void PermutacionRecursivo(String a, LinkedList<String> conjunto) {
        if (conjunto.size() == 1) {
            System.out.println(a + conjunto.get(0));
        }
        for (int i = 0; i < conjunto.size(); i++) {
            String b = conjunto.remove(i);
            PermutacionRecursivo(a + b, conjunto);
            conjunto.add(i, b);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas Palabras va a ingresar?");
        int a = sc.nextInt();

        if (a > 3) {
            System.out.println("Profe, el eejercicio de uri lo prueban con 3 palabras, VUELVA A INTENTARLO");
        }
        String b = "";
        ArrayList<String> temp = new ArrayList<String>();

        for (int i = 0; i < a; i++) {
            System.out.println("Ingrese la palabra");
            b = sc.next();
            temp.add(b);
        }

        String palabra1 = "";
        String palabra2 = "";
        String palabra3 = "";
        if (a < 3) {
            System.out.println("El ejercicio de URI online lo prueban con 3, vuelva a intentarlo");
        } else {
            palabra1 = temp.get(0);
            palabra2 = temp.get(1);
            palabra3 = temp.get(2);
        }

        LinkedList<String> conjunto = new LinkedList<String>();
        LinkedList<String> conjunto2 = new LinkedList<String>();
        LinkedList<String> conjunto3 = new LinkedList<String>();

        try {
            for (int i = 0; i < palabra1.length(); i++) {
                conjunto.add(palabra1.charAt(i) + "");
            }

            System.out.println("========================================");
            PermutacionRecursivo("", conjunto);

            for (int i = 0; i < palabra2.length(); i++) {
                conjunto2.add(palabra2.charAt(i) + "");
            }

            System.out.println("========================================");
            PermutacionRecursivo("", conjunto2);

            for (int i = 0; i < palabra3.length(); i++) {
                conjunto3.add(palabra3.charAt(i) + "");
            }

            System.out.println("========================================");
            PermutacionRecursivo("", conjunto3);
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Error inesperado, vuelva a intentarlo");
        }

    }

}
