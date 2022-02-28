/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefet.sistema_estagios.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * 
 */
@Entity
public class AvaliacaoRelatorio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    private String dataApresentacaoRelatorio;
    private String assunto;
    private String avaliacao;
    private String dataAvaliacao;    
    
    public AvaliacaoRelatorio() {

	}
    
    public AvaliacaoRelatorio(String dataApresentacaoRelatorio, String assunto, String avaliacao, String dataAvaliacao) {
		this.dataApresentacaoRelatorio = dataApresentacaoRelatorio;
		this.assunto = assunto;
		this.avaliacao = avaliacao;
		this.dataAvaliacao = dataAvaliacao;
	}

    
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDataApresentacaoRelatorio() {
        return dataApresentacaoRelatorio;
    }

    public void setDataApresentacaoRelatorio(String dataApresentacaoRelatorio) {
        this.dataApresentacaoRelatorio = dataApresentacaoRelatorio;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String getDataAvaliacao() {
        return dataAvaliacao;
    }

    public void setDataAvaliacao(String dataAvaliacao) {
        this.dataAvaliacao = dataAvaliacao;
    }
    
    
}
