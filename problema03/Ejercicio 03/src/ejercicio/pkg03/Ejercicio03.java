/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg03;


import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String nombre;
        String direccion;
        double tarifa;
        int minutos;
        double total;
        
        System.out.println("Ingrese nombres: ");
        nombre = entrada.nextLine();
        
        System.out.println("Ingrese direccion: ");
        direccion = entrada.nextLine();
        
        System.out.println("Ingrese valor de la tarifa: ");
        tarifa = entrada.nextDouble();
        
        System.out.println("Ingrese minutos utilizados: ");
        minutos = entrada.nextInt();
        
        total = tarifa * minutos;
        
        System.out.printf("===================================================="
                + "====== \n PLANTILLA DE SERVICIO TEFELONICO \n"
                + "==========================================================\n"
                + "Titular: %s\n Direccion %s\n ================================"
                + "==========================\n"
                + "----------------------------------------------------------\n"
                + "Costo por minuto: $ %.2f\n Minutos consumidos: %d\n"
                + "----------------------------------------------------------\n"
                + "VALOR TOTAL A PAGAR: $ %.2f\n"
                + "==========================================================\n",
                nombre,
                direccion,
                tarifa,
                minutos,
                total);
    }
    
}
