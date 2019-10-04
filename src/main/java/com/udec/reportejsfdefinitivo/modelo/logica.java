/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.reportejsfdefinitivo.modelo;

/**
 *
 * @author Camilo Perez
 * @author Julian Arias
 */
public class logica {
  /**
   * Metodo que calcula el precio segun la profesion
   * @param profesion
   * @return el precio de la profesion
   */
    public double calcularProfesion(String profesion){
        double sueldo;
        if(profesion.equals("ingeniero")){
            sueldo=200000;
        }else if (profesion.equals("tecnologo")) {
            sueldo=150000;
        }
        else if (profesion.equals("tecnico")) {
            sueldo=100000;
        }else{
            sueldo=50000;
        }
        return sueldo;
    }
    /**
     * Metodo que calcula el precio segun los idiomas
     * @param idioma
     * @return el precio de los idiomas
     */
     public double calcularIdioma(String[] idioma){
        double sueldo=0;
        for (String idioma1 : idioma) {
            if (idioma1.equals("ingles")) {
                sueldo=sueldo+250000;
            } else if (idioma1.equals("frances")) {
                sueldo=sueldo+330000;
            } else if (idioma1.equals("aleman")) {
                sueldo=sueldo+500000;
            } else {
                sueldo=sueldo+0;
            }
        }
        return sueldo;
    }
     /**
      * Metodo que calcula el precio segun la ubicacion 
      * @param ubicacion
      * @return el precio segun la ubicacion seleccionada
      */
     public double calcularUbicacion(String ubicacion){
        double sueldo;
        if(ubicacion.equals("afueras")){
            sueldo=80000;
        }else{
            sueldo=0;
        }
        return sueldo;
    }
     /**
      * Metodo que calcula el sueldo total segun el idioma, la profesion y la ubicacion
      * @param dias
      * @param profesion
      * @param idioma
      * @return el sueldo total
      */
     public double calcularCuentaCobro(int dias, String profesion,String[]idioma,String ubicacion){
        double salario,salario2,salario3,salariodef;
         if (dias==0) {
             salariodef=0;
         }else{
        salario=(dias*calcularProfesion(profesion));
        salario2=calcularUbicacion(ubicacion);
        salario3=calcularIdioma(idioma);
        salariodef=salario+salario2+salario3;
         }
        return salariodef;
     }
     /**
     * Metodo que imprime los idiomas 
     * @param idioma
     * @return los idiomas seleccionados 
     */
    public String imprimirIdiomas(String [] idioma){
       String idiomas="";
       
       for(String a:idioma){
           if(a!=null){
                idiomas=idiomas+a+",";
           }
       }
    return idiomas;
    }
    /**
     * Metodo que imprime el genero 
     * @param genero
     * @return el genero seleccionado
     */
     public String tipoGenero(String genero){
        String ger;
        if(genero.equals("mujer")){
            ger = "Señora";
        }else{
            ger="Señor";
        }
    return ger;
    }
}
