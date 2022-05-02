/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EquivalenteHora;

/**
 *
 * @author M S I
 */
public class EquivalenteHora {

    private double dias;
    private int horas;
    private int minutos;
    private int segundos;
    
    public void establecerHoras(int a){
        horas = a;
    }
    public void establecerDias(double a){
         dias = a/24;
    }
    public void establecerMinutos(int a){
         minutos = horas * 60;
    }
    public void establecerSegundos(int a){
         segundos = horas * 3600;
    }
    
    public int obtenerHoras (){
        return horas;
    }
    public double obtenerDias (){
        return dias;
    }
    public int obtenerMinutos (){
        return minutos;
    }
    public int obtenerSegundos (){
        return segundos;
    }
    
    
}
