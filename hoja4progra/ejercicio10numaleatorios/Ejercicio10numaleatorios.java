/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio10numaleatorios;

/**
 *
 * @author famil
 */
import java.util.ArrayList;
import java.util.Random;

public class Ejercicio10numaleatorios {
    public static void main(String[] args) {
        ArrayList<Integer> numerosAleatorios = new ArrayList<>();
        Random random = new Random();

        // Genera 20 números aleatorios entre 1 y 100
        for (int i = 0; i < 20; i++) {
            numerosAleatorios.add(random.nextInt(100) + 1);
        }

        System.out.println("Los 20 números aleatorios generados son:");
        System.out.println(numerosAleatorios);
    }
}