import java.util.LinkedList;

public class Punto5 {
    public static void main(String[] args) {
        LinkedList<String> colores = new LinkedList<>();
        colores.add("Rojo");
        colores.add("Azul");
        colores.add("Verde");

        for (String color : colores) {
            System.out.println(color);
        }
    }
}
