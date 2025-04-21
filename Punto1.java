import java.util.ArrayList;

public class Punto1 {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Carlos");

        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}