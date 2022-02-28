package br.cefet.sistema_estagios.dto;

import java.util.ArrayList;
import java.util.List;

import br.cefet.sistema_estagios.model.Orientador;

public class OrientadorDTO {

	private String matricula;
	private String nome;
	private String curso;
	
	public OrientadorDTO(Orientador orientador) {
		matricula = orientador.getMatricula();
		nome = orientador.getNome();
		curso = orientador.getCurso();
	}

	public static List<OrientadorDTO> converter(List<Orientador> orientadores)
	{
		List<OrientadorDTO> listaOrientadorDTO = new ArrayList<OrientadorDTO>();
		for (Orientador orientador : orientadores) {
			OrientadorDTO orientadorDTO = new OrientadorDTO(orientador);
			
			listaOrientadorDTO.add(orientadorDTO);
		}
		return listaOrientadorDTO;
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

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

}
