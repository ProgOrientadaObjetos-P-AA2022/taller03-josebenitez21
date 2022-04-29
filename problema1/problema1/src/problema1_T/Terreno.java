/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1_T;



/**
 *
 * @author reroes
 */
public class Terreno {

    private double ancho;
    private double vMetroCuadrado;
    private double largo;
    private double area;
    private double costoTerreno;

    public void establecerAncho(double c) {
        ancho = c;
    }

    public void establecerLargo(double c) {
        largo = c;
    }

    public void establecerArea() {
        area = largo * ancho;
    }

    public void establecerVMetroCuadrado(double c) {
        vMetroCuadrado = c;
    }

    // public void establecerValorFactura(){
    public void calcularCostoTerreno() {
        costoTerreno = area * vMetroCuadrado;
    }

    public double obtenerAncho() {
        return ancho;
    }

    public double obtenerLargo() {
        return largo;
    }

    public double obtenerArea() {
        return area;
    }

    public double obtenerValorMetroCuadrado() {
        return vMetroCuadrado;
    }

    public double obtenerValorFactura() {
        return costoTerreno;
    }

}
