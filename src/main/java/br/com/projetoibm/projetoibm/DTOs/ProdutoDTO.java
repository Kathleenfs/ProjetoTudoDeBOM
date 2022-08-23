package br.com.projetoibm.projetoibm.DTOs;

import javax.validation.constraints.NotBlank;

public class ProdutoDTO {
	@NotBlank
	private String nome;
	@NotBlank
	private String desc_produto;
	@NotBlank
	private Double preco_produto;
	@NotBlank
	private boolean generico_produto;

	@NotBlank
	private int pedido_id;
	
	

	public int getPedido_id() {
		return pedido_id;
	}

	public void setPedido_id(int pedido_id) {
		this.pedido_id = pedido_id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDesc_produto() {
		return desc_produto;
	}

	public void setDesc_produto(String desc_produto) {
		this.desc_produto = desc_produto;
	}

	public Double getPreco_produto() {
		return preco_produto;
	}

	public void setPreco_produto(Double preco_produto) {
		this.preco_produto = preco_produto;
	}

	public boolean isGenerico_produto() {
		return generico_produto;
	}

	public void setGenerico_produto(boolean generico_produto) {
		this.generico_produto = generico_produto;
	}
}
