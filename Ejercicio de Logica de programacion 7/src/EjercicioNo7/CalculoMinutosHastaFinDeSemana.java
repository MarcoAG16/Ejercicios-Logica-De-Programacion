package EjercicioNo7;
import java.util.Scanner;

public class CalculoMinutosHastaFinDeSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] diasSemana = {"lunes", "martes", "miércoles", "jueves", "viernes"};
        int[] minutosPorDia = {0, 1440, 2880, 4320, 5760}; // Minutos acumulados hasta el final de cada día

        System.out.println("Ingrese un día de la semana (lunes - viernes):");
        String diaSemana = scanner.nextLine().toLowerCase();

        int minutosDia = 0;
        if (diaSemana.equals("viernes")) {
            System.out.println("Ingrese la hora (0-23):");
            int horas = scanner.nextInt();
            System.out.println("Ingrese los minutos (0-59):");
            int minutos = scanner.nextInt();
            minutosDia = horas * 60 + minutos;
        } else if (diaSemana.equals("sábado") || diaSemana.equals("domingo")) {
            System.out.println("¡Ya es fin de semana!");
        } else if (diaSemana.equals("lunes") || diaSemana.equals("martes") || diaSemana.equals("miércoles") || diaSemana.equals("jueves")) {
            minutosDia = 24 * 60; // 24 horas por día
        } else {
            System.out.println("Día de la semana no válido. Ingrese un día de lunes a viernes.");
            return; // Termina el programa si el día no es válido
        }

        int minutosFaltantes = (minutosPorDia[4] - minutosDia); // Diferencia con el viernes
        System.out.println("Faltan " + minutosFaltantes + " minutos para el fin de semana");
    }
}

