package br.com.projetoibm.projetoibm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetoibm.projetoibm.models.PedidoModel;
import br.com.projetoibm.projetoibm.repositories.PedidoRepository;


@Service
public class PedidoService {

	@Autowired
	PedidoRepository pedidoRepository;

	public List<PedidoModel> listPedidos() {
		return pedidoRepository.findAll();
	}

	public PedidoModel save(PedidoModel pedidoModel) {
		return pedidoRepository.save(pedidoModel);
	}

}
