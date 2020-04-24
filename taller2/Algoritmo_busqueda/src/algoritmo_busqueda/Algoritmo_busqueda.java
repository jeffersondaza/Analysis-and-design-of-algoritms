package algoritmo_busqueda;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Algoritmo_busqueda {

    public static void main(String[] args) {

        Object dato;
        ArrayList lista = new ArrayList();
        boolean enc = false;

        lista.add("perro");
        lista.add("gato");
        lista.add("12");
        lista.add("10");

        dato = JOptionPane.showInputDialog("Ingrese el objecto que quiere buscar ");

        int i = 0;
        while (i < lista.size() && enc == false) {

            if (lista.get(i).equals(dato)) {
                enc = true;
            }

            i++;
        }

        if (enc == false) {
            JOptionPane.showMessageDialog(null, "El objeto no esta en la lista");
        } else {
            JOptionPane.showMessageDialog(null, "El objeto si esta dentro de la lista");
        }

    }

}
