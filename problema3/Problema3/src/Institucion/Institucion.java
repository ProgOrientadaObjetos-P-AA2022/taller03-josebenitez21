/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Institucion;

/**
 *
 * @author M S I
 */
public class Institucion {

    private String nombre;
    private String tipoIns;
    private int alumnos;
    private int docentes;
    private int sedes;
    private double gastoEst;
    private double presupuesto;

    public void establecerNombre(String a) {
        nombre = a;
    }

    public void establecerTipoIns(String a) {
        tipoIns = a;
    }

    public void establecerAlumnos(int a) {
        alumnos = a;
    }

    public void establecerDocentes(int a) {
        docentes = a;
    }

    public void establecerSedes(int a) {
        sedes = a;
    }

    public void establecerGastoEst(double a) {
        gastoEst = a;
    }

    public void establecerPresupuesto() {
        presupuesto = alumnos * gastoEst;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerTipoIns() {
        return tipoIns;
    }

    public int obtenerAlumnos() {
        return alumnos;
    }

    public int obtenerDocentes() {
        return docentes;
    }

    public int obtenerSedes() {
        return sedes;
    }

    public double obtenerGastoEst() {
        return gastoEst;
    }

    public double obtenerPresupuesto() {
        return presupuesto;
    }

}
