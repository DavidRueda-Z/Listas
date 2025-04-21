import java.util.LinkedList;
import java.util.Scanner;

public class Punto8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> tareas = new LinkedList<>();
        int opcion;

        do {
            System.out.println("\n1. Agregar tarea");
            System.out.println("2. Ver tareas");
            System.out.println("3. Eliminar tarea");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nueva tarea: ");
                    tareas.add(sc.nextLine());
                    break;
                case 2:
                    System.out.println("Tareas:");
                    for (String t : tareas)
                        System.out.println("- " + t);
                    break;
                case 3:
                    System.out.print("Tarea a eliminar: ");
                    String eliminar = sc.nextLine();
                    tareas.remove(eliminar);
                    break;
            }
        } while (opcion != 4);
    }
}