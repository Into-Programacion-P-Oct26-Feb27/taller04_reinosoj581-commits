/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg5;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); 
        
        String nombreCliente;
        //precio base
        double precioMensualNetflix;
        double precioMensualYouTube;
        double precioMensualDropBox;
        double precioMensualSpotify;
        // Dinero que se descuenta
        double descuentoNetflix;
        double descuentoYouTube;
        double descuentoDropBox;
        double descuentoSpotify;
        // Valor despues del descuento
        double precioFinalNetflix;
        double precioFinalYouTube;
        double precioFinalDropBox;
        double precioFinalSpotify;
        
        double costoTotal;
        double dineroAhorrado;
        double costoTotalDescuento;
        
        System.out.println("Ingrese nombre del cliente");
        nombreCliente = entrada.nextLine();
        
        System.out.println("Ingrese la mensualidad de Netflix");
        precioMensualNetflix = entrada.nextDouble();
        System.out.println("Ingrese la mensualidad de YouTube");
        precioMensualYouTube = entrada.nextDouble();
        System.out.println("Ingrese la mensualidad de DropBox");
        precioMensualDropBox = entrada.nextDouble();
        System.out.println("Ingrese la mensualidad de Spotify");
        precioMensualSpotify = entrada.nextDouble();
        // calcular el dinero que no tiene que pagar, que se  descuenta
        descuentoNetflix = 0.23 * precioMensualNetflix;
        descuentoYouTube = 0.23 * precioMensualYouTube;
        descuentoDropBox = 0.45 * precioMensualDropBox;
        descuentoSpotify = 0 * precioMensualSpotify;
        // Calcular lo que tiene que pagar despues del descuento
        precioFinalNetflix = precioMensualNetflix - descuentoNetflix;
        precioFinalYouTube = precioMensualYouTube - descuentoYouTube;
        precioFinalDropBox = precioMensualDropBox - descuentoDropBox;
        precioFinalSpotify = precioMensualSpotify -descuentoSpotify;
        // Calcula el valor total a pagar sin descuento
        costoTotal = precioMensualNetflix + precioMensualYouTube + precioMensualDropBox + precioMensualSpotify;
        // Calcula el valor a pagar con descuento
        costoTotalDescuento = precioFinalNetflix + precioFinalYouTube + precioFinalDropBox + precioFinalSpotify;
        // Dinero ahorrado
        dineroAhorrado = costoTotal - costoTotalDescuento;
        
        System.out.printf("Nombre del cliente: %s\n" 
                + "Precio mensual de Netflix %.2f\n"
                + "Precio mensual de YouTube %.2f\n"
                + "Precio mensual de DropBox %.2f\n"
                + "Precio mensual de Spotify %.2f\n\n"
                + "Descuento de Netflix: %.2f\n"
                + "Descuento de YouTube: %.2f\n"
                + "Descuento de DropBox: %.2f\n"
                + "Descuento de Spotify: %.2f\n\n"
                + "Costo total sin descuento: %.2f\n"
                + "Dinero ahorrado: %.2f\n"
                + "Costo total con descuento: %.2f\n", 
                nombreCliente, 
                precioFinalNetflix, 
                precioFinalYouTube, 
                precioFinalDropBox, 
                precioFinalSpotify,
                descuentoNetflix,
                descuentoYouTube,
                descuentoDropBox,
                descuentoSpotify,
                costoTotal, 
                dineroAhorrado, 
                costoTotalDescuento);
        
        
    }
    
}
