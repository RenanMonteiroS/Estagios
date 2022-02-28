package br.cefet.sistema_estagios.form;

import br.cefet.sistema_estagios.model.Estagiario;

public class EstagiarioForm {

	private String matricula; 
    private String nome;
    private String email;
    private String curso;
    private String turma;
    private String unidade;
    
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
	public Estagiario converter() {
		// TODO Auto-generated method stub
		return new Estagiario(matricula, nome, email, curso, turma, unidade);
	}
    
    
}
