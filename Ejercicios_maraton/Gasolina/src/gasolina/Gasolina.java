/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gasolina;

import java.util.Scanner;

/**
 *
 * @author jefry
 */
public class Gasolina {

    public static void main(String[] args) {
        System.out.println("Ingrese el numero de horas que duro el viaje");
        Scanner sc = new Scanner(System.in);
        float h = sc.nextInt();
        System.out.println("Ingrese la velocidad media del viaje en km/h");
        float v = sc.nextInt();
        System.out.println("teniendo en cuenta que el combustible gasttado equivale a 12km/L");
        float d = h * v;
        System.out.println("La distancia recorrida es de:  " + d);
        float l = d / 12;
        System.out.println("El combustible consumido en litros es de:  " + String.format(("%.3f"), l));
    }

}
