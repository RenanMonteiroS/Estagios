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
public class CriterioAvaliacao {
    
    private String nomeCriterio;
    private String avaliacaoObtida;

    public CriterioAvaliacao(String nomeCriterio) {
        this.nomeCriterio = nomeCriterio;            
        this.avaliacaoObtida = CodigosAvaliacao.EM_BRANCO;
    }

    
    public String getNomeCriterio() {
        return nomeCriterio;
    }

    public void setNomeCriterio(String nomeCriterio) {
        this.nomeCriterio = nomeCriterio;
    }

    public String getAvaliacaoObtida() {
        return avaliacaoObtida;
    }

    public void setAvaliacaoObtida(String avaliacaoObtida) {
        this.avaliacaoObtida = avaliacaoObtida;
    }
    
    
}
