package br.com.projetoibm.projetoibm.controllers;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetoibm.projetoibm.DTOs.ProdutoDTO;
import br.com.projetoibm.projetoibm.models.ProdutoModel;
import br.com.projetoibm.projetoibm.services.ProdutoService;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
	
	@Autowired
	ProdutoService produtoService;
	
	@PostMapping
	public ResponseEntity<ProdutoModel> saveClient(@RequestBody ProdutoDTO produtoDTO) {
		var produtoModel = new ProdutoModel();
		BeanUtils.copyProperties(produtoDTO, produtoModel);
		if (produtoModel.isGenerico_produto()) {
			produtoModel.setPreco_produto(produtoModel.getPreco_produto() * 0.8);
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(produtoService.save(produtoModel));
	}
	
	@GetMapping
	public ResponseEntity<List<ProdutoModel>> listProdutos() {
		return ResponseEntity.status(HttpStatus.OK).body(produtoService.listProdutos());
	}
}
