package EjercicioNo6;
import java.util.Scanner;

public class InvertirTexto {
    public static void main(String[] args) {
        // Solicitar al usuario que ingrese una palabra o frase
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una palabra o frase: ");
        String entrada = scanner.nextLine();
        scanner.close();

        // Llamar a la función para invertir el texto
        String textoInvertido = invertirTexto(entrada);

        // Imprimir el texto invertido
        System.out.println("Texto invertido: " + textoInvertido);
    }

    // Función para invertir el texto
    public static String invertirTexto(String texto) {
        // Crear un StringBuilder para construir el texto invertido
        StringBuilder textoInvertido = new StringBuilder();

        // Recorrer el texto en sentido inverso y agregar cada carácter al StringBuilder
        for (int i = texto.length() - 1; i >= 0; i--) {
            textoInvertido.append(texto.charAt(i));
        }

        // Convertir el StringBuilder a String y devolverlo
        return textoInvertido.toString();
    }
}