/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grupo5_proyectofinal;
import java.util.Scanner;
/**
 *
 * @author Kenny
 */
public class Grupo5_ProyectoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Datos de entrada
        System.out.print("Ingrese el nombre del vendedor: ");
        String nombre = input.nextLine();

        System.out.print("Ingrese el sueldo mensual del vendedor: ");
        double sueldoMensual = input.nextDouble();

        System.out.print("Ingrese el monto de la venta 1: ");
        double venta1 = input.nextDouble();

        System.out.print("Ingrese el monto de la venta 2: ");
        double venta2 = input.nextDouble();

        System.out.print("Ingrese el monto de la venta 3: ");
        double venta3 = input.nextDouble();

        // Cálculos
        double comision = (venta1 + venta2 + venta3) * 0.10;
        double sueldoNeto = sueldoMensual + comision;

        // Resultados
        System.out.println("\nResultados:");
        System.out.println("La comisión de la venta es: " + comision);
        System.out.println("El sueldo neto del vendedor es: " + sueldoNeto);
    }
    //Cambio en Netbeans
} // Cambio en Jenkins
