/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaas;

import java.util.Scanner;
public class Intership {
        public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int M = sc.nextInt();
            int totalC = 0;
            int totalNC = 0;
            for (int i = 0; i < M; i++) {
                double N = sc.nextInt();
                double C = sc.nextInt();
                totalNC += N * C;
                totalC += C;
            }
            double resultado = totalNC / (totalC * 100.0);
            System.out.println(String.format("%.4f", resultado));
        }
    }

}
