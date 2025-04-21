import java.util.LinkedList;

public class Punto6 {
    public static void main(String[] args) {
        LinkedList<String> frutas = new LinkedList<>();
        frutas.add("Manzana");
        frutas.add("Banano");

        System.out.println("Antes:");
        System.out.println(frutas);

        frutas.addFirst("Fresa");
        frutas.addLast("Pera");

        System.out.println("Después:");
        System.out.println(frutas);
    }
}