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
public class AvaliacaoConceitual {
    
    List<CriterioAvaliacao> listaCriteriosAvaliacao;
    String dataAvaliacao;
    
    public AvaliacaoConceitual() {
        listaCriteriosAvaliacao = new ArrayList<CriterioAvaliacao>();
        
        listaCriteriosAvaliacao.add(new CriterioAvaliacao("Assiduidade"));
        listaCriteriosAvaliacao.add(new CriterioAvaliacao("Pontualidade"));
        listaCriteriosAvaliacao.add(new CriterioAvaliacao("Disciplina"));
        listaCriteriosAvaliacao.add(new CriterioAvaliacao("Urbanidade"));
        listaCriteriosAvaliacao.add(new CriterioAvaliacao("Zelo Pessoal"));
        listaCriteriosAvaliacao.add(new CriterioAvaliacao("Dedicação"));
        listaCriteriosAvaliacao.add(new CriterioAvaliacao("Iniciativa"));
        listaCriteriosAvaliacao.add(new CriterioAvaliacao("Criatividade"));
        listaCriteriosAvaliacao.add(new CriterioAvaliacao("Capacidade de Planejar"));
        listaCriteriosAvaliacao.add(new CriterioAvaliacao("Senso Analítico"));
        listaCriteriosAvaliacao.add(new CriterioAvaliacao("Capacidade de Produção"));
        listaCriteriosAvaliacao.add(new CriterioAvaliacao("Cumprimento de metas (datas)"));
        listaCriteriosAvaliacao.add(new CriterioAvaliacao("Desembaraço"));
        listaCriteriosAvaliacao.add(new CriterioAvaliacao("Conhecimentos Gerais"));
        listaCriteriosAvaliacao.add(new CriterioAvaliacao("Conhecimentos Específicos"));
        listaCriteriosAvaliacao.add(new CriterioAvaliacao("Responsabilidade"));
        listaCriteriosAvaliacao.add(new CriterioAvaliacao("Aceitação pelo Grupo"));
        listaCriteriosAvaliacao.add(new CriterioAvaliacao("Capacidade de Liderança"));
        
        dataAvaliacao = "";        
    }
    
    
    
}
