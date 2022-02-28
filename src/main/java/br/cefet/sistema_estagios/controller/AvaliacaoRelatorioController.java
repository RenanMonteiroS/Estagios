package br.cefet.sistema_estagios.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import br.cefet.sistema_estagios.dto.AvaliacaoRelatorioDTO;
import br.cefet.sistema_estagios.dto.EstagiarioDTO;
import br.cefet.sistema_estagios.form.AvaliacaoRelatorioForm;
import br.cefet.sistema_estagios.form.EstagiarioForm;
import br.cefet.sistema_estagios.model.AvaliacaoRelatorio;
import br.cefet.sistema_estagios.model.Estagiario;
import br.cefet.sistema_estagios.repository.AvaliacaoRelatorioRepository;


@RestController
@RequestMapping("/avaliacao+relatorios")
public class AvaliacaoRelatorioController {

	@Autowired
	private AvaliacaoRelatorioRepository avaliacaoRelatorioRepository;
	
	@GetMapping
	public List<AvaliacaoRelatorioDTO> AvaliacaoRelatorios()
	{
		List<AvaliacaoRelatorio> tabelaAvaliacaoRelatorios = avaliacaoRelatorioRepository.findAll();
		return AvaliacaoRelatorioDTO.converter(tabelaAvaliacaoRelatorios);
	}
	
	@PostMapping
	public ResponseEntity<AvaliacaoRelatorioDTO> cadastrar(@RequestBody AvaliacaoRelatorioForm avaliacaoRelatorioForm,
																		UriComponentsBuilder uriBuilder)
	{
		AvaliacaoRelatorio avaliacaoRelatorio = avaliacaoRelatorioForm.converter();
		avaliacaoRelatorioRepository.save(avaliacaoRelatorio);
		//Status 200 = sucesso  
		//HTTPStatus 201 = Criado   
		UriComponents uriComponents =
								uriBuilder.path("/avaliacao+relatorios/{id}").buildAndExpand(avaliacaoRelatorio.getId());
		return ResponseEntity.created(uriComponents.toUri()).body(new AvaliacaoRelatorioDTO(avaliacaoRelatorio)); 
		
	}
	
}
