package br.cefet.sistema_estagios.dto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.cefet.sistema_estagios.model.Estagiario;

public class EstagiarioDTO {
	
	private String matricula; 
    private String nome;
    private String email;
    private String curso;
    private String turma;
    private String unidade;
    
    public EstagiarioDTO(Estagiario estagiario)
    {
    	this.setMatricula(estagiario.getMatricula());
		this.setNome(estagiario.getNome());
		this.setEmail(estagiario.getEmail());
		this.setCurso(estagiario.getCurso());
		this.setTurma(estagiario.getTurma());
		this.setUnidade(estagiario.getUnidade());
    }
    
    public static List<EstagiarioDTO> converter(List<Estagiario> listaEstagiario)
    {
    	List<EstagiarioDTO> estagiariosDTO = new ArrayList<EstagiarioDTO>();
    	
    	for (Iterator<Estagiario> iterator = listaEstagiario.iterator(); iterator.hasNext();) {
			Estagiario estagiario = (Estagiario) iterator.next();
			EstagiarioDTO estagiarioDTO = new EstagiarioDTO(estagiario);
			
			estagiariosDTO.add(estagiarioDTO);
		}
    	
    	return estagiariosDTO;
    }
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getTurma() {
		return turma;
	}
	public void setTurma(String turma) {
		this.turma = turma;
	}
	public String getUnidade() {
		return unidade;
	}
	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
    
    

}
