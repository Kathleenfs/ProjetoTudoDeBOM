package br.com.projetoibm.projetoibm.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetoibm.projetoibm.models.ClientModel;
import br.com.projetoibm.projetoibm.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	ClientRepository clientRepository;
	
	@Transactional
	public ClientModel save(ClientModel clientModel) {
		return clientRepository.save(clientModel);
	}
	
	public List<ClientModel> listClients() {
		return clientRepository.findAll();
	}

	public boolean existsBycpfClient(String cpf) {
		return clientRepository.existsBycpf(cpf);
	}
	
	public Optional<ClientModel> findById(int id) {
		return clientRepository.findById(id);
	}


	@Transactional
	public void delete(ClientModel clientModel) {
		clientRepository.delete(clientModel);
	}
	
}
