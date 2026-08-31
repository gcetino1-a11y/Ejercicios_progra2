/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1fin;

/**
 *
 * @author famil
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1fin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        String entrada;

        System.out.println("Ingresa elementos (escribe 'fin' para terminar):");
        while (true) {
            System.out.print("> ");
            entrada = scanner.nextLine();
            if (entrada.equalsIgnoreCase("fin")) {
                break;
            }
            lista.add(entrada);
        }

        System.out.println("Elementos ingresados: " + lista);
    }
}
