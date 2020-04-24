package algotirmo_determinista;

import java.util.Random;
import javax.swing.JOptionPane;

public class Algotirmo_determinista {

    public static void main(String[] args) {

        Random ran = new Random();

        int a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un entero para el exponente diferente de 0"));
        int b = ran.nextInt(17);

        int res = 0;
        if (a == 1) {
            res = b;
        } else {
            for (int i = 1; i < a; i++) {
                if (res == 0) {
                    res = b;
                    res = res * b;
                } else {
                    res = res * b;
                }

            }
        }

        JOptionPane.showMessageDialog(null, "El resultado es: " + res);
    }

}
