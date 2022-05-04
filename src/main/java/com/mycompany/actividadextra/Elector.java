/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividadextra;

/**
 *
 * @author Vicente Sacco
 */
public class Elector {
    //Variables
    private String Rut;
    private String Circunscripcion ;
    private boolean Asiste ;

    //Getters
    public String getRut() {
        return Rut;
    }

    public String getCircunscripcion() {
        return Circunscripcion;
    }

    public boolean isAsiste() {
        return Asiste;
    }
    
    //Setters
    public void setRut(String rut) {
        this.Rut = rut;
    }

    public void setCircunscripcion(String circunscripcion) {
        this.Circunscripcion = circunscripcion;
    }

    public void setAsiste(boolean asiste) {
        this.Asiste = asiste;
    } 
}
