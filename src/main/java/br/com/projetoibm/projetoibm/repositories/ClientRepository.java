package br.com.projetoibm.projetoibm.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projetoibm.projetoibm.models.ClientModel;

@Repository
public interface ClientRepository extends JpaRepository<ClientModel, Integer> {
	boolean existsBycpf(String cpf);
}
