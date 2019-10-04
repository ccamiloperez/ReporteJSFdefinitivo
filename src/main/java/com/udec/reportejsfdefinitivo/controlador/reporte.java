/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.reportejsfdefinitivo.controlador;

import com.udec.reportejsfdefinitivo.modelo.logica;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

/**
 *
 * @author Camilo Perez
 * @author Julian Arias
 */
@Named(value = "reporte")
@RequestScoped
public class reporte {

    logica log=new logica();
    /**
     * Inyeccion de dependencia
     */
    @Inject
    private principal principal;
    /**
     * Costructor de la clase
     */
    public reporte() {
    }
    /**
     * Getters y Setters de la varible principal
     * @return 
     */
    public principal getPrincipal() {
        return principal;
    }

    public void setPrincipal(principal principal) {
        this.principal = principal;
    }
    /**
     * Metodo que llama la funcion de calcular el sueldo
     * @return el sueldo total
     */
    public double ejecutar(){
        principal.setSalario(log.calcularCuentaCobro(principal.getDias(), principal.getProfesion(), principal.getIdiomas(),principal.getUbicacion()));
        return principal.getSalario();
    }
    
    /**
     * Metodo que llama la funcion que imprime el genero
     * @return el genero seleccionado
     */
   public String imprimirGenero(){
       principal.setGenero(log.tipoGenero(principal.getGenero()));
       return principal.getGenero();
   }
    /**
     * metodo que devuelve los idiomas
     * @return  idiomas
     */       
    public String tipoIdioma(){
       String valorIdioma;
       valorIdioma=(log.imprimirIdiomas(principal.getIdiomas()));
       return valorIdioma;
    }
}
