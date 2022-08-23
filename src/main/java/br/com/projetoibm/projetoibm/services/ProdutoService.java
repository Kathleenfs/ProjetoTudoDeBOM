package br.com.projetoibm.projetoibm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetoibm.projetoibm.models.ProdutoModel;
import br.com.projetoibm.projetoibm.repositories.ProdutoRepository;

@Service
public class ProdutoService {
	@Autowired
	ProdutoRepository produtoRepository;

	public ProdutoModel save(ProdutoModel produtoModel) {
		return produtoRepository.save(produtoModel);
	}

	public List<ProdutoModel> listProdutos() {
		return produtoRepository.findAll();
	}


}
