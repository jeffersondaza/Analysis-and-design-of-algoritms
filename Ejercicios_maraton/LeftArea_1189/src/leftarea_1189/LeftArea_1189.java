/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leftarea_1189;

import java.util.Scanner;

/**
 *
 * @author jefry
 */
public class LeftArea_1189 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float[][] matriz = new float[12][12];
        int conts = 0;
        int contm = 0;

        do {

            System.out.println("Que desea hacer?" + ""
                    + "1. Agregar" + "\n"
                    + "2. Ver matriz " + "\n"
                    + "3. Hacer Sum or Average ('S' or 'M')");

            int b = sc.nextInt();
            switch (b) {
                case 1:
                    System.out.println("Ingrese los valores para la matriz 12x12");
                    for (int i = 0; i < matriz.length; i++) {
                        for (int j = 0; j < matriz.length; j++) {
                            System.out.print("Ingrese el valor de la posicion: Matriz[" + i + "][" + j + "]");
                            matriz[i][j] = sc.nextFloat();
                        }

                    }

                    break;

                case 2:

                    System.out.println("L amatriz es:");
                    for (int i = 0; i < matriz.length; i++) {
                        for (int j = 0; j < matriz.length; j++) {
                            System.out.print(matriz[i][j]);
                        }

                        System.out.println("\n");
                    }

                    break;
                case 3:

                    System.out.println("Ingrese ('S' or 'M')");
                    String cha = sc.nextLine();
                    String cham = sc.nextLine();

                    if (cham.equals("S")) {
                        for (int i = 0; i < matriz.length - 11; i++) {
                            conts += matriz[1][i];
                        }
                        for (int i = 0; i < matriz.length - 10; i++) {
                            conts += matriz[2][i];
                        }
                        for (int i = 0; i < matriz.length - 9; i++) {
                            conts += matriz[3][i];
                        }
                        for (int i = 0; i < matriz.length - 8; i++) {
                            conts += matriz[4][i];
                        }
                        for (int i = 0; i < matriz.length - 7; i++) {
                            conts += matriz[5][i];
                        }
                        for (int i = 0; i < matriz.length - 7; i++) {
                            conts += matriz[6][i];
                        }
                        for (int i = 0; i < matriz.length - 8; i++) {
                            conts += matriz[7][i];
                        }
                        for (int i = 0; i < matriz.length - 9; i++) {
                            conts += matriz[8][i];
                        }
                        for (int i = 0; i < matriz.length - 10; i++) {
                            conts += matriz[9][i];
                        }
                        for (int i = 0; i < matriz.length - 11; i++) {
                            conts += matriz[10][i];
                        }

                        System.out.println("La suma es: " + conts);

                    } else if (cham.equals("M")) {

                        for (int i = 0; i < matriz.length - 11; i++) {
                            contm += matriz[1][i];
                        }
                        for (int i = 0; i < matriz.length - 10; i++) {
                            contm += matriz[2][i];
                        }
                        for (int i = 0; i < matriz.length - 9; i++) {
                            contm += matriz[3][i];
                        }
                        for (int i = 0; i < matriz.length - 8; i++) {
                            contm += matriz[4][i];
                        }
                        for (int i = 0; i < matriz.length - 7; i++) {
                            contm += matriz[5][i];
                        }
                        for (int i = 0; i < matriz.length - 7; i++) {
                            contm += matriz[6][i];
                        }
                        for (int i = 0; i < matriz.length - 8; i++) {
                            contm += matriz[7][i];
                        }
                        for (int i = 0; i < matriz.length - 9; i++) {
                            contm += matriz[8][i];
                        }
                        for (int i = 0; i < matriz.length - 10; i++) {
                            contm += matriz[9][i];
                        }
                        for (int i = 0; i < matriz.length - 11; i++) {
                            contm += matriz[10][i];
                        }
                        
                        System.out.println("El promedio es: " + (contm / 30));

                    } else {
                        System.out.println("Solo se perimite 'S' or 'M'. Vuelva a intentarlo");
                    }

                    break;

            }
        } while (true);
    }

}
