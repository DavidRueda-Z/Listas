import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Punto3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();
        String entrada;

        System.out.println("Ingresa nombres (escribe 'salir' para terminar):");
        while (true) {
            entrada = sc.nextLine();
            if (entrada.equalsIgnoreCase("salir"))
                break;
            nombres.add(entrada);
        }

        Collections.reverse(nombres);
        System.out.println("Nombres en orden inverso:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}