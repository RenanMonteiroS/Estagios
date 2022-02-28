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
public class Orientador {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    private String matricula;
    private String nome;
    private String cargo;
    private String email;
    private String curso;

//    private List<Estagiario> listaEstagiarios;

    public Orientador()
    {
    	
    }
    public Orientador(String matricula, String nome, String cargo, String email, String curso) {
        this.matricula = matricula;
        this.nome = nome;
        this.cargo = cargo;
        this.email = email;
        this.curso = curso;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
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
	public Long getId() {
		return id;
	}
	
    
}
