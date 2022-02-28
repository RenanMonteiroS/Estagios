package br.cefet.sistema_estagios.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.cefet.sistema_estagios.model.Estagiario;

public interface EstagiarioRepository extends JpaRepository<Estagiario, Long> {
	
}
