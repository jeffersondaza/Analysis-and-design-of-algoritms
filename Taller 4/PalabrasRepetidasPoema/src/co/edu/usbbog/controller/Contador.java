package co.edu.usbbog.controller;

import co.edu.usbbog.model.Palabras;
import java.util.ArrayList;

public class Contador {

    ArrayList<Palabras> palabras = new ArrayList<Palabras>();

    public int contarEspacios(String poema, int indice, int espacios) {
        if (indice != poema.length()) {

            if (' ' == poema.charAt(indice)) {
                espacios++;
                indice++;
                espacios = contarEspacios(poema, indice, espacios);
                indice = poema.length();
            } else {
                indice++;
                espacios = contarEspacios(poema, indice, espacios);
                indice = poema.length();
            }
        }
        return espacios;

    }

    public int contarComa(String poema, int indice, int espacios) {
        if (indice != poema.length()) {

            if (',' == poema.charAt(indice)) {
                espacios++;
                indice++;
                espacios = contarEspacios(poema, indice, espacios);
                indice = poema.length();
            } else {
                indice++;
                espacios = contarEspacios(poema, indice, espacios);
                indice = poema.length();
            }
        }
        return espacios;

    }

    public int contadorVocales(String poema, int indice, int vocales) {
        if (indice != poema.length()) {
            if ('a' == poema.charAt(indice) || 'e' == poema.charAt(indice)
                    || 'i' == poema.charAt(indice) || 'o' == poema.charAt(indice) || 'u' == poema.charAt(indice)
                    || 'A' == poema.charAt(indice) || 'E' == poema.charAt(indice) || 'I' == poema.charAt(indice)
                    || 'O' == poema.charAt(indice) || 'U' == poema.charAt(indice) || 'ú' == poema.charAt(indice)) {
                vocales++;
                indice++;
                vocales = contadorVocales(poema, indice, vocales);
                indice = poema.length();
            } else {
                indice++;
                vocales = contadorVocales(poema, indice, vocales);
                indice = poema.length();
            }
        }
        return vocales;
    }
    
        public int contadorConsonantesPro(String poema, int indice, int consonantes) {
        if (indice != poema.length()) {
            if ('b' == poema.charAt(indice) || 'c' == poema.charAt(indice)
                    || 'd' == poema.charAt(indice) || 'f' == poema.charAt(indice) || 'g' == poema.charAt(indice)
                    || 'h' == poema.charAt(indice) || 'j' == poema.charAt(indice) || 'k' == poema.charAt(indice)
                    || 'l' == poema.charAt(indice) || 'm' == poema.charAt(indice) || 'n' == poema.charAt(indice)
                    || 'p' == poema.charAt(indice) || 'q' == poema.charAt(indice) || 'y' == poema.charAt(indice)
                    || 'r' == poema.charAt(indice) || 's' == poema.charAt(indice) || 't' == poema.charAt(indice)
                    || 'v' == poema.charAt(indice) || 'w' == poema.charAt(indice) || 'x' == poema.charAt(indice)
                    || 'z' == poema.charAt(indice) || 'ñ' == poema.charAt(indice) || 'S' == poema.charAt(indice)) {
                consonantes++;
                indice++;
                consonantes = contadorConsonantesPro(poema, indice, consonantes);
                indice = poema.length();
            } else {
                indice++;
                consonantes = contadorConsonantesPro(poema, indice, consonantes);
                indice = poema.length();
            }
        }
        return consonantes;
    }


    public int contadorLetras(String poema, int indice, int espacios) {
        int contador = 0;
        int v = contadorVocales(poema, 0, 0);
        int c = contadorConsonantesPro(poema, 0, 0);
        contador = contador+v+c;
        return contador;
    }

    public void contarPalabras(String poema, int indice) {
        String palabra = "";
        int cont = 0;
        boolean condicion = true;
        boolean aux = false;
        if (indice < poema.length()) {
            do {
                if (indice < poema.length()) {
                    if (poema.charAt(indice) == ' ') {
                        condicion = false;
                    } else {
                        palabra = palabra + poema.charAt(indice);
                    }
                    indice++;
                } else {
                    condicion = false;
                }
            } while (condicion);
            if (palabras.isEmpty()) {
                Palabras nueva = new Palabras(palabra);
                palabras.add(nueva);
            } else {
                for (int j = 0; j < palabras.size(); j++) {
                    if (palabras.get(j).getPalabra().equalsIgnoreCase(palabra)) {
                        cont = palabras.get(j).getRepeticiones();
                        palabras.get(j).setRepeticiones(cont + 1);
                        aux = true;
                    }
                }
                if (aux == false) {
                    Palabras nueva = new Palabras(palabra);
                    palabras.add(nueva);
                }
            }

            palabra = "";
            condicion = true;
            contarPalabras(poema, indice);
            indice = poema.length();
        }

    }
}
