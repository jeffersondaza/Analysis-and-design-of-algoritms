/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaas;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class WebBrowser {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        String[] database = new String[numero];

        for (int i = 0; i < database.length; i++) {
            database[i] = sc.next();
        }

        sc.nextLine();
        int cantb = sc.nextInt();

        for (int j = 0; j < cantb; j++) {

            String txt = sc.next();
            int cant = 0;
            int tamanio = 0;
            for (int i = 0; i < database.length; i++) {
                if (database[i].contains(txt)) {
                    cant++;
                    int aux = database[i].length();
                    if (aux > tamanio) {
                        tamanio = aux;
                    }
                }
            }
            if (cant > 0) {
                System.out.println(cant + " " + tamanio);
            } else {
                System.out.println("-1");
            }
        }
    }

}
