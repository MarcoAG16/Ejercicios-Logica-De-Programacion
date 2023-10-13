package Ejercicio10;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class JuegoTraduccion {
    public static void main(String[] args) {
        // Crear un diccionario Español-Inglés utilizando un HashMap
        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("gato", "cat");
        diccionario.put("perro", "dog");
        diccionario.put("casa", "house");
        diccionario.put("coche", "car");
        diccionario.put("árbol", "tree");
        diccionario.put("sol", "sun");
        diccionario.put("agua", "water");
        diccionario.put("mesa", "table");
        diccionario.put("cielo", "sky");
        diccionario.put("amigo", "friend");
        diccionario.put("rojo", "red");
        diccionario.put("manzana", "apple");
        diccionario.put("playa", "beach");
        diccionario.put("libro", "book");
        diccionario.put("nube", "cloud");
        // Agregar más palabras y traducciones aquí...

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numPreguntas = 5;
        int respuestasCorrectas = 0;

        for (int i = 0; i < numPreguntas; i++) {
            // Seleccionar una palabra al azar del diccionario
            int randomIndex = random.nextInt(diccionario.size());
            String palabraEspañol = (String) diccionario.keySet().toArray()[randomIndex];
            String palabraIngles = diccionario.get(palabraEspañol);

            System.out.println("Traduce la palabra al inglés: " + palabraEspañol);
            String respuestaUsuario = scanner.nextLine().toLowerCase();

            // Verificar si la respuesta del usuario es correcta
            if (respuestaUsuario.equals(palabraIngles)) {
                System.out.println("¡Correcto!");
                respuestasCorrectas++;
            } else {
                System.out.println("Incorrecto. La respuesta correcta es: " + palabraIngles);
            }
        }

        // Mostrar el resultado final
        System.out.println("Respuestas correctas: " + respuestasCorrectas + " de " + numPreguntas);
        System.out.println("Respuestas incorrectas: " + (numPreguntas - respuestasCorrectas) + " de " + numPreguntas);
    }
}
