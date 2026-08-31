/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio6_controltareas;

/**
 *
 * @author famil
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio6_controltareas {

    public static void main(String[] args) {
        ArrayList<String> tareas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 4) {
            System.out.println("\n--- CONTROL DE TAREAS PENDIENTES ---");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Mostrar tareas");
            System.out.println("3. Completar y eliminar tarea");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la descripción de la tarea: ");
                    String nuevaTarea = scanner.nextLine();
                    tareas.add(nuevaTarea);
                    System.out.println("-> Tarea agregada exitosamente.");
                    break;

                case 2:
                    mostrarLista(tareas);
                    break;

                case 3:
                    mostrarLista(tareas);
                    if (!tareas.isEmpty()) {
                        System.out.print("Ingrese el número de la tarea a marcar como completada: ");
                        int numeroTarea = scanner.nextInt();

                        if (numeroTarea >= 1 && numeroTarea <= tareas.size()) {
                            // Se resta 1 porque el ArrayList inicia en índice 0
                            String completada = tareas.remove(numeroTarea - 1);
                            System.out.println("-> Tarea \"" + completada + "\" completada y eliminada.");
                        } else {
                            System.out.println("-> Número de tarea inválido.");
                        }
                    }
                    break;

                case 4:
                    System.out.println("¡Saliendo del programa!");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }

        scanner.close();
    }

    // Método auxiliar para imprimir las tareas numeradas
    private static void mostrarLista(ArrayList<String> tareas) {
        if (tareas.isEmpty()) {
            System.out.println("-> No hay tareas pendientes.");
        } else {
            System.out.println("\nLista de Tareas:");
            for (int i = 0; i < tareas.size(); i++) {
                System.out.println((i + 1) + ". " + tareas.get(i));
            }
        }
    }
}
