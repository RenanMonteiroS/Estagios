package br.cefet.sistema_estagios.form;

import br.cefet.sistema_estagios.model.AvaliacaoRelatorio;
import br.cefet.sistema_estagios.model.Estagiario;

public class AvaliacaoRelatorioForm {
	private String dataApresentacaoRelatorio;
    private String assunto;
    private String avaliacao;
    private String dataAvaliacao;
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
    
	public AvaliacaoRelatorio converter() {
		// TODO Auto-generated method stub
		return new AvaliacaoRelatorio(dataApresentacaoRelatorio, assunto, avaliacao, dataAvaliacao);
	}
}
