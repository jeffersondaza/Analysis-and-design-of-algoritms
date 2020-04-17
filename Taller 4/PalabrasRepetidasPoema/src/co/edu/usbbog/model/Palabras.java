
package co.edu.usbbog.model;


public class Palabras {
    public String palabra;
    public int repeticiones = 1;

    public Palabras(String palabra) {
        this.palabra = palabra;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public int getRepeticiones() {
        return repeticiones;
    }

    public void setRepeticiones(int repeticiones) {
        this.repeticiones = repeticiones;
    }

    @Override
    public String toString() {
        return palabra + ": "+ repeticiones+" veces";
    }
    
}
