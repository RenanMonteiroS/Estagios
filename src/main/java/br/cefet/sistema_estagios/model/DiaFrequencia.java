/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefet.sistema_estagios.model;

/**
 *
 * @author henri
 */
public class DiaFrequencia {
    private int dia;
    private String codigoFrequencia;

    public DiaFrequencia(int dia) {
        this.dia = dia;
        this.codigoFrequencia = CodigosFrequencia.EM_BRANCO;
    }
   
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getCodigoFrequencia() {
        return codigoFrequencia;
    }

    public void setCodigoFrequencia(String codigoFrequencia) {
        this.codigoFrequencia = codigoFrequencia;
    }
    
    
}
