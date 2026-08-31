/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5verificar;

/**
 *
 * @author famil
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio5Verificar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> personas = new ArrayList<>();

        personas.add("Ana");
        personas.add("Carlos");
        personas.add("María");
        personas.add("Juan");

        System.out.print("Ingresa un nombre para buscar en la lista: ");
        String busqueda = scanner.nextLine();

        if (personas.contains(busqueda)) {
            System.out.println("¡El nombre '" + busqueda + "' SÍ se encuentra en la lista!");
        } else {
            System.out.println("El nombre '" + busqueda + "' NO está en la lista.");
        }
    }
}
