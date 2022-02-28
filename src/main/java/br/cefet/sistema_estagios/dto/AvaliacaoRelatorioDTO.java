package br.cefet.sistema_estagios.dto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.cefet.sistema_estagios.model.AvaliacaoRelatorio;
import br.cefet.sistema_estagios.model.Estagiario;
import br.cefet.sistema_estagios.model.Orientador;

public class AvaliacaoRelatorioDTO {
	private String dataApresentacaoRelatorio;
    private String assunto;
    private String avaliacao;
    private String dataAvaliacao;
    
    public AvaliacaoRelatorioDTO(AvaliacaoRelatorio avaliacaoRelatorio) {
    	dataApresentacaoRelatorio = avaliacaoRelatorio.getDataApresentacaoRelatorio();
    	assunto = avaliacaoRelatorio.getAssunto();
    	avaliacao = avaliacaoRelatorio.getAvaliacao();
    	dataAvaliacao = avaliacaoRelatorio.getDataAvaliacao();
	}
    
    public static List<AvaliacaoRelatorioDTO> converter(List<AvaliacaoRelatorio> avaliacaoRelatorios)
    {
    	List<AvaliacaoRelatorioDTO> listaAvaliacaoRelatorioDTO = new ArrayList<AvaliacaoRelatorioDTO>();
		for (AvaliacaoRelatorio avaliacaoRelatorio : avaliacaoRelatorios) {
			AvaliacaoRelatorioDTO avaliacaoRelatorioDTO = new AvaliacaoRelatorioDTO(avaliacaoRelatorio);
			
			listaAvaliacaoRelatorioDTO.add(avaliacaoRelatorioDTO);
		}
		return listaAvaliacaoRelatorioDTO;
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
