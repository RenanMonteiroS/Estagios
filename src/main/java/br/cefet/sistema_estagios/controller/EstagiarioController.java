package br.cefet.sistema_estagios.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import br.cefet.sistema_estagios.dto.EstagiarioDTO;
import br.cefet.sistema_estagios.form.EstagiarioForm;
import br.cefet.sistema_estagios.model.Estagiario;
import br.cefet.sistema_estagios.repository.EstagiarioRepository;

@RestController
@RequestMapping("/estagiarios")
public class EstagiarioController {
	
	@Autowired
	private EstagiarioRepository estagiarioRepository;
	
	
	@GetMapping
	public List<EstagiarioDTO> estagiarios()
	{
		List<Estagiario> tabelaEstagiarios = estagiarioRepository.findAll();					
		return EstagiarioDTO.converter(tabelaEstagiarios);
	}
	
	@PostMapping
	public ResponseEntity<EstagiarioDTO> cadastrar(@RequestBody EstagiarioForm estagiarioForm,
																		UriComponentsBuilder uriBuilder)
	{
		Estagiario estagiario = estagiarioForm.converter();
		estagiarioRepository.save(estagiario);
		//HTTPStatus 200 : sucesso  HTTPStatus 201: created (um recurso foi criado -> um estagiário)   
		UriComponents uriComponents =
								uriBuilder.path("/estagiarios/{id}").buildAndExpand(estagiario.getId());
		//retorna HTTPStatus 201 e no corpo da resposta manda o json do EstagiarioDTO
		return ResponseEntity.created(uriComponents.toUri()).body(new EstagiarioDTO(estagiario)); 
		
	}
}
