import java.util.LinkedList;
import java.util.Scanner;

public class Punto7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> lista = new LinkedList<>();
        lista.add("Pan");
        lista.add("Leche");
        lista.add("Huevos");

        System.out.println("Lista actual: " + lista);
        System.out.print("Elemento a eliminar: ");
        String nombre = sc.nextLine();

        if (lista.remove(nombre)) {
            System.out.println("Elemento eliminado.");
        } else {
            System.out.println("No se encontró.");
        }

        System.out.println("Lista final: " + lista);
    }
}