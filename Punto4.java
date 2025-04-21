import java.util.ArrayList;

public class Punto4 {
    public static void main(String[] args) {
        ArrayList<Double> precios = new ArrayList<>();
        precios.add(12.5);
        precios.add(8.75);
        precios.add(10.0);
        precios.add(14.2);

        double suma = 0;
        for (double precio : precios) {
            suma += precio;
        }

        double promedio = suma / precios.size();
        System.out.println("El promedio es: " + promedio);
    }
}
