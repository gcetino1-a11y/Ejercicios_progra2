/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio4menu;

/**
 *
 * @author famil
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> elementos = new ArrayList<>();
        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Agregar elemento");
            System.out.println("2. Eliminar por índice");
            System.out.println("3. Ver lista");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el elemento a agregar: ");
                    elementos.add(scanner.nextLine());
                    System.out.println("Elemento agregado.");
                    break;
                case 2:
                    System.out.print("Ingresa el índice a eliminar (0 a " + (elementos.size() - 1) + "): ");
                    int indice = scanner.nextInt();
                    if (indice >= 0 && indice < elementos.size()) {
                        String eliminado = elementos.remove(indice);
                        System.out.println("Se eliminó: " + eliminado);
                    } else {
                        System.out.println("Índice no válido.");
                    }
                    break;
                case 3:
                    System.out.println("Lista actual: " + elementos);
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 4);
    }
}
