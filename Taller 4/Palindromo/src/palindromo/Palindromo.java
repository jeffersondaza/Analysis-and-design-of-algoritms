/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromo;

import java.util.Scanner;

/**
 *
 * @author jefry
 */
public class Palindromo {

    static void PermutacionIterattivo(String[] elem, String act, int n, int r) {
        if (n == 0) {
            System.out.println(act);
        } else {
            for (int i = 0; i < r; i++) {
                if (!act.contains(elem[i])) { // Controla que no haya repeticiones
                    PermutacionIterattivo(elem, act + elem[i] + ", ", n - 1, r);
                }
            }
        }
    }

    static boolean PalindromoRecursivo(String s) {
        if (s.length() <= 1) {
            return true;
        } else {
            if (s.charAt(0) == s.charAt(s.length() - 1)) {
                return PalindromoRecursivo(s.substring(1, s.length() - 1));
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {

        //System.out.println(PalindromoRecursivo("rar"));
        //String[] elementos = "a,b,c,d,e,a,b,c,d".split(",");
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas variables va a ingresar?");
        int a = sc.nextInt();

        String[] permuta = new String[a];
        for (int i = 0; i < permuta.length; i++) {
            permuta[i] = sc.next();

        }
        System.out.println("Tamaño de los grupos?");
        int n = sc.nextInt();

        int r = permuta.length;
        PermutacionIterattivo(permuta, "", n, r);

        //palindromo con madam
        String s = "madam";
        
        System.out.println("La palabra madam es un palindromo: "+PalindromoRecursivo(s));
    }

}
