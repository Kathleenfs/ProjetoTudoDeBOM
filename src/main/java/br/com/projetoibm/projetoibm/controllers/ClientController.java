package br.com.projetoibm.projetoibm.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetoibm.projetoibm.DTOs.ClientDTO;
import br.com.projetoibm.projetoibm.models.ClientModel;
import br.com.projetoibm.projetoibm.services.ClientService;


@RestController
@RequestMapping("/client")
public class ClientController {
	@Autowired
	ClientService clientService;
	
	@PostMapping
	public ResponseEntity<Object> saveClient(@RequestBody @Valid ClientDTO clientDTO) {
		if(clientService.existsBycpfClient(clientDTO.getCpf())) {
			return ResponseEntity.status(HttpStatus.CONFLICT).body("Usuário ja cadastrado");
		}
		var clientModel = new ClientModel();
		BeanUtils.copyProperties(clientDTO, clientModel);
		return ResponseEntity.status(HttpStatus.CREATED).body(clientService.save(clientModel));
	}

	@GetMapping
	public ResponseEntity<List<ClientModel>> listClients() {
		return ResponseEntity.status(HttpStatus.OK).body(clientService.listClients());
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deleteClient(@PathVariable(value="id") int id) {
		Optional<ClientModel> clientModelOptional = clientService.findById(id);
		if(!clientModelOptional.isPresent()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente não encontrado");
		}
		clientService.delete(clientModelOptional.get());
		return ResponseEntity.status(HttpStatus.OK).body("Cliente deletado");
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Object> updateClient(@PathVariable(value = "id") int id, @RequestBody @Valid ClientDTO clientDTO) {
		Optional<ClientModel> clientModelOptional = clientService.findById(id);
		if(!clientModelOptional.isPresent()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente não encontrado");
		}
		var clientModel = new ClientModel();
		BeanUtils.copyProperties(clientDTO, clientModel);
		clientModel.setId(clientModelOptional.get().getId());
		return ResponseEntity.status(HttpStatus.OK).body(clientService.save(clientModel));
	}
	
	
}


