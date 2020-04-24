package algoritmo_escalada;

import java.util.Random;
import javax.swing.JOptionPane;

public class Algoritmo_escalada {

    public static void main(String[] args) {

        Random ale = new Random();
        int obj = Integer.parseInt(JOptionPane.showInputDialog("que numero quiere buscar del 0 al 15?"));
        boolean enc = false;

        while (enc == false) {
            int a = ale.nextInt(16);
            if (a == obj) {
                JOptionPane.showMessageDialog(null, "Termina la busqueda con exito");
                enc = true;
            } else {
                JOptionPane.showMessageDialog(null, "Volviendo a intentarlo");
            }

        }

    }

}
