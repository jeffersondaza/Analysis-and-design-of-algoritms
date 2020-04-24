package algoritmo_las_vegas;

import java.util.Random;
import javax.swing.JOptionPane;

public class Algoritmo_las_vegas {

    public static void main(String[] args) {

        //int a =  (int)Math.random();
        Random ale = new Random();
        int a = ale.nextInt(9);
        if (a <= 6) {
            JOptionPane.showMessageDialog(null, "Correcto, su turno es el: " + a);
        } else {
            JOptionPane.showMessageDialog(null, "ERROR!!!");
        }
    }

}
