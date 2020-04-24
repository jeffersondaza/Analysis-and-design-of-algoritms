package algoritmo_marcaje;

import javax.swing.JOptionPane;

public class Algoritmo_marcaje {

    public static void main(String[] args) {

        int cant = 0;
        cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de usuarios conectados "));

        if (cant <= 2000) {
            JOptionPane.showMessageDialog(null, "Tarida normal");
        }

        if (2000 < cant && cant <= 4000) {
            JOptionPane.showMessageDialog(null, "Tarida aumentada un 25%");
        }

        if (cant > 4000) {
            JOptionPane.showMessageDialog(null, "Tarida aumentada un 50%%");
        }
    }

}
