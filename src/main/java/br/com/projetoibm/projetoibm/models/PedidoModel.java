package br.com.projetoibm.projetoibm.models;


import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="pedido")
public class PedidoModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@JsonIgnore
    @ManyToOne()
    private ClientModel cliente;

	@OneToMany(mappedBy = "pedido")
	private List<ProdutoModel> produtos = new ArrayList<>();

	public List<ProdutoModel> getProdutos() {
		return produtos;
	}
	
	public PedidoModel() {
    }

    public PedidoModel(Long id, ClientModel cliente) {
        this.id = id;
        this.cliente = cliente;
    }


	public Long getId() {
		return id;
	}

	public void setProdutos(List<ProdutoModel> produtos) {
		this.produtos = produtos;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ClientModel getCliente() {
		return cliente;
	}

	public void setCliente(ClientModel cliente) {
		this.cliente = cliente;
	}
	
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PedidoModel pedido = (PedidoModel) o;
        return id.equals(pedido.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}
