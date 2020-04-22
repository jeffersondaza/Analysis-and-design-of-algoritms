/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belowthesecundarydiagonal_1186;

import java.util.Scanner;

/**
 *
 * @author jefry
 */
public class BelowTheSecundaryDiagonal_1186 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float[][] matriz = new float[12][12];
        int conts = 0;
        int contm = 0;
        int leng = matriz.length;

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

                        for (int j = 1; j < matriz.length; j++) {
                            conts += matriz[11][j];
                        }
                        for (int j = 2; j < matriz.length; j++) {
                            conts += matriz[10][j];
                        }
                        for (int j = 3; j < matriz.length; j++) {
                            conts += matriz[9][j];
                        }
                        for (int j = 4; j < matriz.length; j++) {
                            conts += matriz[8][j];
                        }
                        for (int j = 5; j < matriz.length; j++) {
                            conts += matriz[7][j];
                        }
                        for (int j = 6; j < matriz.length; j++) {
                            conts += matriz[6][j];
                        }
                        for (int j = 7; j < matriz.length; j++) {
                            conts += matriz[5][j];
                        }
                        for (int j = 8; j < matriz.length; j++) {
                            conts += matriz[4][j];
                        }
                        for (int j = 9; j < matriz.length; j++) {
                            conts += matriz[3][j];
                        }
                        for (int j = 10; j < matriz.length; j++) {
                            conts += matriz[2][j];
                        }
                        for (int j = 11; j < matriz.length; j++) {
                            conts += matriz[1][j];
                        }

                        System.out.println("La suma es: " + conts);

                    } else if (cham.equals("M")) {

                        for (int j = 1; j < matriz.length; j++) {
                            contm += matriz[11][j];
                        }
                        for (int j = 2; j < matriz.length; j++) {
                            contm += matriz[10][j];
                        }
                        for (int j = 3; j < matriz.length; j++) {
                            contm += matriz[9][j];
                        }
                        for (int j = 4; j < matriz.length; j++) {
                            contm += matriz[8][j];
                        }
                        for (int j = 5; j < matriz.length; j++) {
                            contm += matriz[7][j];
                        }
                        for (int j = 6; j < matriz.length; j++) {
                            contm += matriz[6][j];
                        }
                        for (int j = 7; j < matriz.length; j++) {
                            contm += matriz[5][j];
                        }
                        for (int j = 8; j < matriz.length; j++) {
                            contm += matriz[4][j];
                        }
                        for (int j = 9; j < matriz.length; j++) {
                            contm += matriz[3][j];
                        }
                        for (int j = 10; j < matriz.length; j++) {
                            contm += matriz[2][j];
                        }
                        for (int j = 11; j < matriz.length; j++) {
                            contm += matriz[1][j];
                        }
                        System.out.println("El promedio es: " + (contm / 66));

                    } else {
                        System.out.println("Solo se perimite 'S' or 'M'. Vuelva a intentarlo");
                    }

                    break;
            }
        } while (true);
    }
}

