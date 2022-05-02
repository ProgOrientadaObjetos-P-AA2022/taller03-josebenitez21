/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejecutor;

import EquivalenteHora.EquivalenteHora;

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
        EquivalenteHora ti = new EquivalenteHora();
        int horas = 6;
        double dias;
        int minutos;
        int segundos;

        ti.establecerHoras(horas);
        ti.establecerDias(horas);
        ti.establecerMinutos(horas);
        ti.establecerSegundos(horas);

        System.out.printf("""
                          Conversiones de Hora a: 
                          
                          Hora: %d
                          Dias: %.4f
                          Minutos: %d
                          Segundos: %d
                          """, ti.obtenerHoras(), 
                          ti.obtenerDias(), 
                          ti.obtenerMinutos(),
                          ti.obtenerSegundos());

    }

}
