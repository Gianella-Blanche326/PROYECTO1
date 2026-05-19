/*Ejercicio 6: Adivina el número
Generar un número aleatorio y hacer que el usuario lo adivine (con pistas de “más alto” o “más bajo”). */
Package resol.Blanche;
import java.util.Random;
import java.util.Scanner;
public class AdivinaNumero {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1; // Genera un número entre 1 y 100
        int intentos = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("Estoy pensando en un número entre 1 y 100.");

        while (true) {
            System.out.print("Adivina el número: ");
            try {
                int intento = scanner.nextInt();
                intentos++;

                if (intento < numeroSecreto) {
                    System.out.println("¡Más alto!");
                } else if (intento > numeroSecreto) {
                    System.out.println("¡Más bajo!");
                } else {
                    System.out.println("¡Felicidades! ¡Adivinaste el número (" + numeroSecreto + ") en " + intentos + " intentos!");
                    break;
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Por favor, ingresa un número entero válido.");
                scanner.next(); // Limpiar el buffer del scanner
            }
        }
        scanner.close(); // Cerrar el scanner para liberar recursos
    }
}