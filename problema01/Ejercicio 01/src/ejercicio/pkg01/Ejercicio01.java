/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner entrada = new Scanner(System.in);
       entrada.useLocale(Locale.US);
       
   String proyectoa;
        String proyectob;
        String proyectoc;
        double costoa;
        double costob;
        double costoc;
        double gasto;
        System.out.println("Nombre del proyecto uno: ");
        proyectoa = entrada.nextLine();
        System.out.println("Ingrese el gasto mensual del proyecto 1:");
        costoa = entrada.nextDouble();
        entrada.nextLine();
        
        System.out.println("Ingrese el nombre del proyecto dos: ");
        proyectob = entrada.nextLine();
        System.out.println("Ingrese el gasto mensual del proyecto 2:");
        costob= entrada.nextDouble();
        entrada.nextLine();
        
        System.out.println("Ingrese el nombre del proyecto tres: ");
        proyectoc = entrada.nextLine();
        System.out.println("Ingrese el gasto mensual del proyecto 3:");
        costoc= entrada.nextDouble();
        gasto= costoa + costob +costoc;
        
        System.out.printf("control gastos proectos \nProyectos\n"
                + "-----------------\n1. %s: $%.2f\n2. %s: $%.2f\n3. %s: $%.2f"
                + "\n----------------\nGASTO MENSUAL TOTAL: $%.2f\n",
                proyectoa,
                costoa,
                proyectob,
                costob,
                proyectoc,
                costoc,
                gasto);
                
    }
    
}
