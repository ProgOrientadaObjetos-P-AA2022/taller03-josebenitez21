/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;

import problema1_T.Terreno;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {

        Terreno ter = new Terreno();

        double ancho = 32.4;
        double largo = 230;
        double vMetroCuadrado = 242;

        ter.establecerAncho(ancho);
        ter.establecerLargo(largo);
        ter.establecerVMetroCuadrado(vMetroCuadrado);
        ter.establecerArea();
        ter.calcularCostoTerreno();

        // Se hace uso de los métodos obtener para presentar en pantalla lo 
        // requerido
        System.out.printf("Costo Terreno\n\nAncho: %.2f\n"
                + "Largo: %.2f\nValor de metro Cuadrado: %.2f\n"
                + "Area: %.2f\n"+ "Costo terreno: %.2f\n", ter.obtenerAncho(),
                ter.obtenerLargo(), ter.obtenerValorMetroCuadrado(),
                ter.obtenerArea(), ter.obtenerValorFactura());
    }
}
