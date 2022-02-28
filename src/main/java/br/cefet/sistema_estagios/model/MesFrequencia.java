/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefet.sistema_estagios.model;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author henri
 */
public class MesFrequencia {
    
    private String mes;
    private int ano;
    private List<DiaFrequencia> listaDiaFrequencia;
    private int diasUteis;
    private int presencas;
    private int horas;

    public MesFrequencia(String mes, int ano) {
        this.mes = mes;
        this.ano = ano;
        this.listaDiaFrequencia = new ArrayList<DiaFrequencia>();
        diasUteis = 0;
        presencas = 0;
        horas = 0;
    }
    
    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public List<DiaFrequencia> getListaDiaFrequencia() {
        return listaDiaFrequencia;
    }

    public void setListaDiaFrequencia(List<DiaFrequencia> listaDiaFrequencia) {
        this.listaDiaFrequencia = listaDiaFrequencia;
    }

    public int getDiasUteis() {
        return diasUteis;
    }

    public void setDiasUteis(int diasUteis) {
        this.diasUteis = diasUteis;
    }

    public int getPresencas() {
        return presencas;
    }

    public void setPresencas(int presencas) {
        this.presencas = presencas;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    
    
}
