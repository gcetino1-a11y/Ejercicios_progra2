/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio7promedio;

/**
 *
 * @author famil
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio7Promedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();

        System.out.print("¿Cuántas calificaciones vas a ingresar? ");
        int n = scanner.nextInt();

        double suma = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Calificación " + (i + 1) + ": ");
            double nota = scanner.nextDouble();
            notas.add(nota);
            suma += nota;
        }

        double promedio = notas.isEmpty() ? 0 : suma / notas.size();
        System.out.printf("\nLista de notas: %s\n", notas);
        System.out.printf("El promedio final es: %.2f\n", promedio);
    }
}
