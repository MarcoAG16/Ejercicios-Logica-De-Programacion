package EjercicioNo8;
import java.util.Scanner;

public class OrdenarNumerosPrimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        // Solicitar al usuario 10 números
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Separar los números primos y no primos
        int[] primos = new int[10];
        int[] noPrimos = new int[10];
        int contadorPrimos = 0;
        int contadorNoPrimos = 0;

        for (int i = 0; i < 10; i++) {
            if (esPrimo(numeros[i])) {
                primos[contadorPrimos] = numeros[i];
                contadorPrimos++;
            } else {
                noPrimos[contadorNoPrimos] = numeros[i];
                contadorNoPrimos++;
            }
        }

        // Mostrar el array original
        System.out.println("Array original:");
        for (int i = 0; i < 10; i++) {
            System.out.println("pos[" + i + "] = " + numeros[i]);
        }

        // Mostrar el array con primos al inicio
        System.out.println("\nArray con primos al inicio:");
        for (int i = 0; i < contadorPrimos; i++) {
            System.out.println("pos[" + i + "] = " + primos[i]);
        }
        for (int i = 0; i < contadorNoPrimos; i++) {
            System.out.println("pos[" + (contadorPrimos + i) + "] = " + noPrimos[i]);
        }
    }

    // Función para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
