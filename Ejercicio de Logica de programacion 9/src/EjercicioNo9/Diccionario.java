package EjercicioNo9;
import java.util.HashMap;
import java.util.Scanner;

public class Diccionario {
    public static void main(String[] args) {
        // Crear un diccionario Español-Inglés utilizando un HashMap
        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("gato", "cat");
        diccionario.put("perro", "dog");
        diccionario.put("casa", "house");
        diccionario.put("coche", "car");
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
        diccionario.put("calle", "street");
        
       

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una palabra en español:");
        String palabraEspañol = scanner.nextLine().toLowerCase();

        // Verificar si la palabra está en el diccionario
        if (diccionario.containsKey(palabraEspañol)) {
            String traduccion = diccionario.get(palabraEspañol);
            System.out.println("La traducción al inglés es: " + traduccion);
        } else {
            System.out.println("La palabra no se encuentra en el diccionario.");
        }
    }
}
