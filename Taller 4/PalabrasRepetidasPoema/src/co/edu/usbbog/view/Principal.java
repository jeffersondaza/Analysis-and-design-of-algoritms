
package co.edu.usbbog.view;

import co.edu.usbbog.controller.Contador;
import co.edu.usbbog.controller.LeerPoema;
import java.io.IOException;


public class Principal {

    public static void PalabrasRepetidas() throws IOException {
        LeerPoema fichero = new LeerPoema();
        Contador contadores = new Contador();
        String cadena = fichero.cargarPoema();
        System.out.println(cadena);
        int moment =cadena.length();
        System.out.println("kk"+moment);
        System.out.println("La cantidad de vocales es: "+contadores.contadorVocales(cadena, 0, 0));
        System.out.println("La cantidad de consonantes es: "+contadores.contadorConsonantesPro(cadena, 0, 0));
        System.out.println("La cantidad de espacios es: "+contadores.contarEspacios(cadena, 0, 0));
        System.out.println("La cantidad de letras es: "+contadores.contadorLetras(cadena, 0, 0));
        contadores.contarPalabras(cadena, 0);
    }

    public static void main(String[] args) throws IOException {
        PalabrasRepetidas();
    }

}
