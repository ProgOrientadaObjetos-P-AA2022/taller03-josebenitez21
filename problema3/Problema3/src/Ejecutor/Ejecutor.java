/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejecutor;

import Institucion.Institucion;

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

        Institucion ins = new Institucion();

        String nombre = "La Salle";
        String tipoIns = "Privada";
        int alumnos = 450;
        int docentes = 40;
        int sedes = 10;
        double gastoEst = 80;
        double presupuesto;

        ins.establecerNombre(nombre);
        ins.establecerTipoIns(tipoIns);
        ins.establecerAlumnos(alumnos);
        ins.establecerDocentes(docentes);
        ins.establecerSedes(sedes);
        ins.establecerGastoEst(gastoEst);
        ins.establecerPresupuesto();

        System.out.printf("Datos de Instituciones Educativas\n\n"
                + "Nombre: %s\nTipo de Institucion: %s\nAlumnos: %d\n"
                + "Docentes: %d\nSedes: %d\nGastos por Estudiante: %.2f\n"
                + "Presupuesto: %.2f", ins.obtenerNombre(), ins.obtenerTipoIns(),
                ins.obtenerAlumnos(), ins.obtenerDocentes(), ins.obtenerSedes(),
                ins.obtenerGastoEst(), ins.obtenerPresupuesto());

    }

}
