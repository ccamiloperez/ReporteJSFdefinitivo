/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.reportejsfdefinitivo.controlador;

import com.udec.reportejsfdefinitivo.modelo.logica;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Camilo Perez
 * @author Julian Arias
 */
@Named(value = "principal")
@RequestScoped
public class principal {
    /**
     * Variables donde se almacena lo que digite el usuario
     */
    private String nombre;
    private String apellido;
    private String profesion;
    private String genero;
    private String[] idiomas;
    private String ubicacion;
    private int dias;
    private double salario;
    /**
    * Costructor de la clase
    */
    public principal() {
        
    }
    /**
     * Getters y Setters de las variables
     * @return 
     */
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    

    public String[] getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String[] idiomas) {
        
        this.idiomas = idiomas;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
   

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }
    
    
    
}
