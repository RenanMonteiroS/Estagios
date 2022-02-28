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

@Entity
public class Estagiario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String matricula;
	private String nome;
	private String email;
	private String curso;
	private String turma;
	private String unidade;

//    private Orientador orientador;
//    private Supervisor supervisor;
//    private Contrato contrato;
//    private AvaliacaoConceitual avaliacaoConceitual;
//    private AvaliacaoRelatorio avaliacaoRelatorio;

	public Estagiario() {

	}

	public Estagiario(String matricula, String nome, String email, String curso, String turma, String unidade) {
		this.matricula = matricula;
		this.nome = nome;
		this.email = email;
		this.curso = curso;
		this.turma = turma;
		this.unidade = unidade;
	}

	public Long getId() {
		return id;
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

//    public Orientador getOrientador() {
//        return orientador;
//    }
//
//    public void setOrientador(Orientador orientador) {
//        this.orientador = orientador;
//    }
//
//    public Supervisor getSupervisor() {
//        return supervisor;
//    }
//
//    public void setSupervisor(Supervisor supervisor) {
//        this.supervisor = supervisor;
//    }

}
