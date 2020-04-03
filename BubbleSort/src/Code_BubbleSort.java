import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Code_BubbleSort {

	public static void main(String[] args) {

		int tamano;

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite la longitud del vector");

		tamano = sc.nextInt();

		// crear array de tamaño N digitado por el usuario

		int Array[] = new int[tamano];

		/*
		 * Bucle rellear el array con lo que digite el usuario
		 */

		for (int i = 0; i < Array.length; i++) {
			System.out.println("Digite el numero para el elemento " + (i + 1));
			Array[i] = sc.nextInt();

		}

		/*
		 * Metodo para mostrar el arreglo deordenado
		 */

		System.out.println("*****SIN ORDENAR****");
		mostrarArreglo(Array);

		System.out.println("***** ORDENADO *****");
		//bubbleSort(Array);
		//insercionDirecta(Array);
		//seleccion(Array);
		bucketSort(Array, tamano);

		System.out.println(Arrays.toString(Array));
	}

	/**
	 * 
	 * @param arrayN
	 */
	static void mostrarArreglo(int[] arrayN) {
		System.out.println("*******************");
		for (int i = 0; i < arrayN.length; i++) {
			System.out.println("Elemento: " + (i + 1) + "=====" + arrayN[i] + "\n");

		}
	}

	/**
	 * 
	 * @param arrayN
	 * @param size
	 */
	public static void bucketSort(int[] arrayN, int size) {

		int max = (Arrays.stream(arrayN).max().getAsInt());
		int[] bucket = new int[max + 1];
	    for (int i = 0; i <= max; i++) {
	      bucket[i] = 0;
	    }

	    for (int i = 0; i < size; i++) {
	      bucket[arrayN[i]]++;
	    }

	    for (int i = 0, j = 0; i <=max; i++) {
	      while (bucket[i] > 0) {
	        arrayN[j++] = i;
	        bucket[i]--;
	      }
	    }
	   
	  }

	
	/**
	 * 
	 * @param arrayN
	 */
	static void seleccion(int[] arrayN) {
		int i, j, menor, pos, tmp;
		for (i = 0;  i< arrayN.length; i++) {
			menor=arrayN[i];
			pos=i;
			
			for (j = 0; j < arrayN.length; j++) {
				if (arrayN[j]<menor) {
					menor=arrayN[j];
					pos=j;
				}	
			}
			
			if (pos!=i) {
				tmp=arrayN[i];
				arrayN[i]=arrayN[pos];
				arrayN[pos]=tmp;
			}
		}
		mostrarArreglo(arrayN);
	}
	
	/**
	 * 
	 * @param arrayN
	 */

	//Copara con los de la isquierda para saber cual es menor y lo reemplaza
	static void insercionDirecta(int[] arrayN) {
		int a, s, aux;
		for (a = 0; a < arrayN.length; a++) { // desde el segundo elemento hacia el vector
			aux = arrayN[a]; // guardo un elemento
			s = a - 1; // inicio en el anterior
			while ((s >= 0) && (aux < arrayN[s])) { // minetras queden en posicion valor aux sea menor a los que
													// desplaza
				arrayN[s + 1] = arrayN[s];// izquierda se dezplaza a la derecha
				s--;
			}
			arrayN[s + 1] = aux;
		}
		mostrarArreglo(arrayN);
	}
	
	/**
	 * 
	 * @param arrayN
	 */

	static void bubbleSort(int[] arrayN) {
		for (int i = 0; i < arrayN.length - 1; i++) {
			for (int j = 0; j < arrayN.length - 1; j++) {
				// pregunta el anterior por el siguiente
				if (arrayN[j] > arrayN[j + 1]) {
					int temp = arrayN[j + 1];
					arrayN[j + 1] = arrayN[j];
					arrayN[j] = temp;
				}

			}

			mostrarArreglo(arrayN);
		}

	}

}
