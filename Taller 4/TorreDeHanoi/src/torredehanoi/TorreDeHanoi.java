/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torredehanoi;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author jefry
 */
public class TorreDeHanoi {

    static int nMovimientos = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // LEE EL NUMERO DE DISCOS

        ArrayList intento = new ArrayList<>();

        do {
            System.out.println("Que desea hacer?" + "\n"
                    + "1. Resolver la torre de hanoi" + "\n"
                    + "2. Ver solucion optima");
            int option = sc.nextInt();

            switch (option) {
                case 1:

                    int op = 1;
                    do {
                        System.out.println("Que desea hacer?" + "\n"
                                + "1. Hacer un movimiento" + "\n"
                                + "2. Terminar");
                        int option2 = sc.nextInt();

                        if (option2 == 1) {
                            System.out.println("Ingrese el numero del disco a mover");
                            int disco = sc.nextInt();

                            System.out.println("Ingrese la torre de origen del disco");
                            String torreo = sc.next();
                            System.out.println("Ingrese la torre de destino del disco");
                            String torred = sc.next();

                            intento.add("Mover disco " + disco + " de Torre " + torreo + " a Torre " + torred);
                        }

                        if (option2 == 2) {
                            op = 2;
                        }
                    } while (op == 1);

                    break;
                case 2:

                    int nDiscos = 4;

                    Hanoi(nDiscos, "Torre A", "Torre B", "Torre C");

                    System.out.println("Los movimientos optimos son: " + nMovimientos + " Movimientos.");
                    break;
            }
        } while (true);

    }
// METODO RECURSIVO

    static void Hanoi(int disco, String torreA, String torreB, String torreC) {
        if (disco == 1) {
            nMovimientos = nMovimientos + 1;
            System.out.println(nMovimientos + ": Mover disco " + disco + " de " + torreA + " a " + torreC);
        } else {
            Hanoi(disco - 1, torreA, torreC, torreB);
            nMovimientos = nMovimientos + 1;
            System.out.println(nMovimientos + ": Mover disco " + disco + " de " + torreA + " a " + torreC);
            Hanoi(disco - 1, torreB, torreA, torreC);

        }
    }

}
