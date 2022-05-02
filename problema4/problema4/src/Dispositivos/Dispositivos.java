/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dispositivos;

/**
 *
 * @author M S I
 */
public class Dispositivos {

    private String sistema;
    private double pantalla;
    private double costoI;
    private double ivaI;
    private double ivaCI;
    private double costoFinal;
    private String dirMac;
    private String imei;

    public void establecerSistema(String a) {
        sistema = a;
    }

    public void establecerPantalla(double a) {
        pantalla = a;
    }

    public void establecerCostoI(double a) {
        costoI = a;
    }

    public void establecerIvaI(double a) {
        ivaI = a;
    }

    public void establecerIvaCI() {
        ivaCI = (costoI * ivaI) / 100;
    }

    public void establecerDirMac(String a) {
        dirMac = a;
    }

    public void establecerImei(String a) {
        imei = a;
    }

    public void establecerCostoFinal() {
        costoFinal = costoI + ivaCI;
    }

    public String obtenerSistema() {
        return sistema;

    }

    public double obtenerPantalla() {
        return pantalla;
    }

    public double obtenerCostoI() {
        return costoI;
    }

    public double obtenerIvaI() {
        return ivaI;
    }

    public double obtenerIvaCI() {
        return ivaCI;
    }

    public String obtenerDirMac() {
        return dirMac;
    }

    public String obtenerImei() {
        return imei;
    }

    public double obtenerCostoFinal() {
        return costoFinal;
    }
}
