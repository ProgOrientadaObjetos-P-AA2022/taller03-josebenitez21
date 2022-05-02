/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema4;

import Dispositivos.Dispositivos;

/**
 *
 * @author M S I
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Dispositivos dis = new Dispositivos();
        String sistema = "Android";
        double pantalla = 6.3;
        double costoI = 1200.55;
        double ivaI = 14;
        double ivaCI;
        String dirMac = "29-C0-37-5A-43-D3";
        String imei = "445777628759777";
        double costoFinal;

        dis.establecerSistema(sistema);
        dis.establecerPantalla(pantalla);
        dis.establecerCostoI(costoI);
        dis.establecerIvaI(ivaI);
        dis.establecerIvaCI();
        dis.establecerDirMac(dirMac);
        dis.establecerImei(imei);
        dis.establecerCostoFinal();

        System.out.printf("Datos de Celulares\n\n"
                + "Sistema: %s\nPantalla: %.2f\nCosto Inicial: %.2f\n"
                + "Iva: %.2f\nIva Inicial: %.2f\nDireccion Mac: %s\n"
                + "Imei: %s\nCosto Final: %.2f",
                dis.obtenerSistema(),
                dis.obtenerPantalla(),
                dis.obtenerCostoI(),
                dis.obtenerIvaI(),
                dis.obtenerIvaCI(),
                dis.obtenerDirMac(),
                dis.obtenerImei(),
                dis.obtenerCostoFinal());

    }

}
