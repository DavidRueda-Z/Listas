class Nodo {
    String dato;
    Nodo siguiente;

    public Nodo(String dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}

class ListaEnlazada {
    Nodo cabeza;

    public void agregar(String dato) {
        Nodo nuevo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    public void mostrar() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }
    }

    public void eliminar(String dato) {
        if (cabeza == null)
            return;

        if (cabeza.dato.equals(dato)) {
            cabeza = cabeza.siguiente;
            return;
        }

        Nodo actual = cabeza;
        while (actual.siguiente != null && !actual.siguiente.dato.equals(dato)) {
            actual = actual.siguiente;
        }

        if (actual.siguiente != null) {
            actual.siguiente = actual.siguiente.siguiente;
        }
    }
}

public class Punto9 {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
        lista.agregar("Mateo");
        lista.agregar("Lucía");
        lista.agregar("Juan");

        lista.mostrar();

        System.out.println("Eliminando 'Lucía'...");
        lista.eliminar("Lucía");

        lista.mostrar();
    }
}