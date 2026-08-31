/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio9empleado;

/**
 *
 * @author famil
 */
import java.util.ArrayList;
import java.util.Scanner;

class Empleado {
    private String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
}

public class Ejercicio9Empleado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();

        System.out.print("¿Cuántos empleados ingresarás? ");
        int cantidad = scanner.nextInt();

        for (int i = 0; i < cantidad; i++) {
            scanner.nextLine(); // Limpiar buffer
            System.out.print("Nombre del empleado " + (i + 1) + ": ");
            String nombre = scanner.nextLine();
            System.out.print("Salario de " + nombre + ": ");
            double salario = scanner.nextDouble();

            listaEmpleados.add(new Empleado(nombre, salario));
        }

        double sumaSalarios = 0;
        for (Empleado emp : listaEmpleados) {
            sumaSalarios += emp.getSalario();
        }

        double promedio = listaEmpleados.isEmpty() ? 0 : sumaSalarios / listaEmpleados.size();
        System.out.printf("\nEl promedio de salario es: $%.2f\n", promedio);
    }
}
