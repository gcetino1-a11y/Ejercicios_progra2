/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio8listafiltrar;

/**
 *
 * @author famil
 */
import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio8Listafiltrar {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(15, 8, 22, 9, 4, 31, 40, 13));
        ArrayList<Integer> pares = new ArrayList<>();

        for (int num : numeros) {
            if (num % 2 == 0) {
                pares.add(num);
            }
        }

        System.out.println("Lista completa: " + numeros);
        System.out.println("Números pares filtrados: " + pares);
    }
}
