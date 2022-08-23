package br.com.projetoibm.projetoibm.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name="produto")

public class ProdutoModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nome;
    private String desc_produto;
    private Double preco_produto;
    private boolean generico_produto;

	@JsonIgnore
    @ManyToOne
	@JoinColumn(name = "pedido_id", referencedColumnName = "id")
    private PedidoModel pedido;
	

    public ProdutoModel(Long id, String nome, Double preco_produto, boolean generico_produto, String desc_produto, PedidoModel pedido) {
        this.id = id;
        this.nome = nome;
        this.preco_produto = preco_produto;
        this.generico_produto = generico_produto;
        this.desc_produto = desc_produto;
        this.pedido = pedido;
    }
    

    public ProdutoModel() {
    }

    public ProdutoModel(Long id, String nome, Double preco_produto, boolean generico_produto, String desc_produto) {
        this.id = id;
        this.nome = nome;
        this.preco_produto = preco_produto;
        this.generico_produto = generico_produto;
        this.desc_produto = desc_produto;
    }

	public PedidoModel getPedido() {
		return pedido;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
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

	public void setPedido(PedidoModel pedido) {
		this.pedido = pedido;
	}
	
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProdutoModel produto = (ProdutoModel) o;
        return id.equals(produto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    
}
