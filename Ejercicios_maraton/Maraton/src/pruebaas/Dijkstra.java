/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaas;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Dijkstra {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        ArrayList<Object> lista = new ArrayList<Object>();
        String dis = "";
        int cont = 0;
        Boolean kk = false;
        do {

            dis = sc.next();
            lista.add(dis);

            if (dis.equalsIgnoreCase("*")) {
                kk = true;
            }
        } while (kk == false);

        if (lista.contains("((")) {
            cont++;

        }
        if (lista.contains("))")) {
            cont++;

        }
        if (lista.contains("(")) {
            cont++;

        }
        if (lista.contains(")")) {
            cont++;

        }

        System.out.println(cont + "");
    }
}
