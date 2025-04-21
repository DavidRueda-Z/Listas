import java.util.ArrayList;
import java.util.Collections;

public class Punto2 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(25);
        numeros.add(5);
        numeros.add(30);
        numeros.add(15);

        int maximo = Collections.max(numeros);
        System.out.println("El número mayor es: " + maximo);
    }
}