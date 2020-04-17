package punto1;

import java.util.Scanner;

public class Punto1 {

    static int factorial_iterativo(int a) {
        int cont = 1;
        for (int i = 1; i <= a; i++) {
            cont = cont * i;
        }
        return cont;
    }

    static int factorial_recursivo(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial_recursivo(n - 1);
        }
    }

    static void fibonacci_iterativo(int a) {
        int var1 = 0;
        int var2 = 1;
        int temp;
        while (var1 + var2 <= a) {
            temp = var1;
            var1 = var2;
            var2 = temp + var1;
            System.out.println(var2);
        }
    }

    static int fibonacci_recursivo(int n) {
        if (n > 1) {
            return fibonacci_recursivo(n - 1) + fibonacci_recursivo(n - 2);  //función recursiva
        } else if (n == 1) {  // caso base
            return 1;
        } else if (n == 0) {  // caso base
            return 0;
        } else { //error
            System.out.println("Debes ingresar un tamaño mayor o igual a 1");
            return -1;
        }
    }

    static void invertir_numero(int a) {
        int resto;
        int invertido = 0;
        while (a > 0) {
            resto = a % 10;
            invertido = invertido * 10 + resto;
            a /= 10;

        }
        System.out.println(invertido);
    }

    static int invertir_Numero_recursivo(int num, int pos) {
        if (num < 10) {
            return num;
        } else {
            return num % 10 * (int) Math.pow(10, pos) + invertir_Numero_recursivo(num / 10, pos - 1);
        }
    }

    static int suma_vector_iteraativo(int arreglo[]) {
        int cont = 0;
        for (int i = 0; i < arreglo.length; i++) {
            cont += arreglo[i];
        }
        return cont;
    }

    static int sumar_vector_recursivo(int arreglo[], int pos) {
        if (pos < arreglo.length) {
            return arreglo[pos] + sumar_vector_recursivo(arreglo, pos + 1);
        }
        return 0;
    }

    static int menor_iterativo(int arreglo[]) {
        int min = arreglo[0];
        for (int i = 0; i < arreglo.length - 1; i++) {
            if (min > arreglo[i + 1]) {
                min = arreglo[i + 1];
            }

        }
        return min;
    }

    static int menor_recursivo(int arreglo[], int size) {

        if (size == 0) {
            return arreglo[0];

        } else {

            if (arreglo[size] < menor_recursivo(arreglo, size - 1)) {
                return arreglo[size];
            } else {
                return menor_recursivo(arreglo, size - 1);
            }
        }
    }

    static void operaciones(int a, int b) {
        int cont = 0;
        System.out.println("la suma es: " + (a + b));
        System.out.println("la resta es: " + (a - b));
        System.out.println("la multiplicacion es: " + (a * b));
        System.out.println("la division es: " + (a / b));
        for (int i = 0; i < b; i++) {
            cont = a * a;
        }
        System.out.println("la potencia de " + a + " a la " + b + " es: " + cont);
    }

    static int suma_recursiva(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return 1 + suma_recursiva(a, b - 1);
        }
    }

    static int resta_recursiva(int a, int b) {
        if (a > b) {
            return 1 + resta_recursiva(a, b + 1);
        }
        if (b > a) {
            return -1 + resta_recursiva(a + 1, b);
        } else {
            return 0;
        }
    }

    static int multiplicacion_recursiva(int a, int b) {
        if (b == 0) {
            return 0;
        } else {
            return (a + multiplicacion_recursiva(a, b - 1));
        }
    }

    static int division_recursiva(int a, int b) {
        if (b > a) {
            return 0;
        } else {
            return (division_recursiva(a - b, b) + 1);
        }
    }

    static int potencia_recursiva(int a, int b) {

        if (b == 0) {
            return 1;
        } else if (b == 1) {
            return a;
        } else if (b < 0) {
            return potencia_recursiva(a, b + 1) / a;
        } else {
            return a * potencia_recursiva(a, b - 1);
        }
    }

    static boolean buscar_iterativo(String arr[][], String v) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (v.equalsIgnoreCase(arr[i][j])) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean buscar_recursivo(String matriz[][], int i, int j, boolean resultado, String dato) {
        if (i >= matriz.length) {
            return resultado;
        }
        if (dato.equals(matriz[i][j])) {
            resultado = true;
        }

        j++;
        if (j >= matriz[0].length) {
            i = i + 1;
            j = 0;
        }
        return buscar_recursivo(matriz, i, j, resultado, dato);
    }

    public static void main(String[] args) {
        System.out.println("ingrese el punto que desea realizar: " + "\n"
                + "1. factorial iterativo" + "\n"
                + "2. Factorial recursivo" + "\n"
                + "3. Fibonacci iterativo" + "\n"
                + "4. Fibonacci Recursivo " + "\n"
                + "5. Invertir numero iterativo" + "\n"
                + "6. Invertir numero recursivo" + "\n"
                + "7. Suma vector iterativo" + "\n"
                + "8. Suma vector recursivo" + "\n"
                + "9. Menor de un vector iterativo" + "\n"
                + "10. Menor de un vector recursivo" + "\n"
                + "11. Operaciones iterativas" + "\n"
                + "12. suma recursiva" + "\n"
                + "13. Buscar en matriz iterativo" + "\n"
                + "14.Buscar en matriz recursivo" + "\n"
                + "15. Resta recursiva" + "\n"
                + "16. Multiplicacion recursiva" + "\n"
                + "17. Division recursiva" + "\n"
                + "18. Exponente recursivo");

        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();

        if (op == 1) {
            System.out.println("Ingrese el numero del que desea saber el factorial");
            int a = sc.nextInt();
            System.out.println("El factorial de " + a + " es: " + factorial_iterativo(a));
        }
        if (op == 3) {
            System.out.println("Ingrese hasta el cual desea saber la serie de fibonacci");
            int a = sc.nextInt();
            fibonacci_iterativo(a);
        }
        if (op == 5) {
            System.out.println("Ingrese el numero a invertir");
            int a = sc.nextInt();
            invertir_numero(a);
        }
        if (op == 7) {
            int[] arreglo = {12, 8, 44, 282, 15};
            System.out.print(" El arreglo es: ");
            for (int i = 0; i < arreglo.length; i++) {
                System.out.print(arreglo[i] + ", ");
            }

            System.out.println("La suma del vector es: " + suma_vector_iteraativo(arreglo));
        }
        if (op == 9) {
            int[] arreglo = {12, 8, 44, 282, 15};
            System.out.println("El arreglo es: " + arreglo);
            System.out.println("El numero menor del arreglo es: " + menor_iterativo(arreglo));
        }
        if (op == 11) {
            System.out.println("ingrese el primer valor");
            int a = sc.nextInt();
            System.out.println("ingrese el segundo valor");
            int b = sc.nextInt();
            operaciones(a, b);
        }
        if (op == 13) {
            System.out.println("Ingrese las dimensiones de la matriz N*N");
            int a = sc.nextInt();
            System.out.println("Ingrese lo que desea buscar: ");
            String v = sc.next();
            String arr[][] = new String[a][a];
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < a; j++) {
                    System.out.println("Digite el valor de la posicion " + "[" + i + "]" + " " + "[" + j + "]");
                    arr[i][j] = sc.next();
                }
            }
            System.out.println(buscar_iterativo(arr, v));;
        }
        if (op == 4) {
            System.out.println("Ingrese el numero hasta el que desea conocer la serie de fibonacci");
            int n = sc.nextInt();
            System.out.println(fibonacci_recursivo(n));
        }
        if (op == 2) {
            System.out.println("Ingrese el numero que desa saber el factorial");
            int n = sc.nextInt();
            System.out.println(factorial_recursivo(n));
        }
        if (op == 6) {
            System.out.println("Ingrese el numero a invertir");
            int n = sc.nextInt();
            int numCifras = String.valueOf(n).length();
            System.out.printf("%nEl número %d invertido es el %d", n, invertir_Numero_recursivo(n, numCifras - 1));
        }
        if (op == 8) {
            int[] arreglo = {12, 8, 44, 282, 15};
            System.out.println("El arreglo es: ");
            for (int i = 0; i < arreglo.length; i++) {
                System.out.print(arreglo[i] + ", ");
            }
            System.out.println("La suma es: " + sumar_vector_recursivo(arreglo, 0));
        }
        if (op == 10) {
            int[] arreglo = {12, 8, 44, 282, 15};
            System.out.println("El numero menor del arreglo es: " + menor_recursivo(arreglo, 4));
        }
        if (op == 12) {
            System.out.println("Ingrese el primer valor");
            int a = sc.nextInt();
            System.out.println("Ingrese el segundo valor");
            int b = sc.nextInt();
            System.out.println("La suma recursiva es: " + suma_recursiva(a, b));
        }
        if (op == 14) {
            System.out.println("Ingrese las dimensiones de la matriz N*N");
            int a = sc.nextInt();
            System.out.println("Ingrese lo que desea buscar: ");
            String dato = sc.next();
            String matriz[][] = new String[a][a];
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < a; j++) {
                    System.out.println("Digite el valor de la posicion " + "[" + i + "]" + " " + "[" + j + "]");
                    matriz[i][j] = sc.next();
                }
            }
            System.out.println(buscar_recursivo(matriz, 0, 0, false, dato));
        }

        if (op == 15) {
            System.out.println("Ingrese el primer valor");
            int a = sc.nextInt();
            System.out.println("Ingrese el segundo valor");
            int b = sc.nextInt();
            System.out.println("La resta recursiva es: " + resta_recursiva(a, b));
        }
        if (op == 16) {
            System.out.println("Ingrese el primer valor");
            int a = sc.nextInt();
            System.out.println("Ingrese el segundo valor");
            int b = sc.nextInt();
            System.out.println("La multiplicacion recursiva es: " + multiplicacion_recursiva(a, b));
        }

        if (op == 17) {
            System.out.println("Ingrese el primer valor");
            int a = sc.nextInt();
            System.out.println("Ingrese el segundo valor");
            int b = sc.nextInt();
            System.out.println("La division recursiva es: " + division_recursiva(a, b));
        }
        if (op == 18) {
            System.out.println("Ingrese el primer valor");
            int a = sc.nextInt();
            System.out.println("Ingrese el segundo valor");
            int b = sc.nextInt();
            System.out.println("La potencia recursiva es: " + potencia_recursiva(a, b));
        }

//        System.out.println("ingrese el segundo valor");
//        int b=sc.nextInt();
//        System.out.println(suma_vector_iteraativo(arreglo));
//        System.out.println(menor_iterativo(arreglo));
//          operaciones(a, b);
//        
//        
    }

}
