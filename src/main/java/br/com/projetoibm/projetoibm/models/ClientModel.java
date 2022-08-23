package br.com.projetoibm.projetoibm.models;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="cliente")
public class ClientModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	private String cpf;
	private String email;
	private String tel;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="cliente")
    private List<PedidoModel> pedidos = new ArrayList<>();

	
	public ClientModel() {
		
	}
	
	public ClientModel(int id, String nome, String cpf, String email, String tel) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.tel = tel;
        this.email = email;
    }

	public ClientModel(int id, String nome, String cpf, String tel, String email, List<PedidoModel> pedidos) {
        this.id = id;
		this.nome = nome;
        this.cpf = cpf;
        this.tel = tel;
        this.email = email;
        this.pedidos = pedidos;
    }
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}
	

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public List<PedidoModel> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<PedidoModel> pedidos) {
		this.pedidos = pedidos;
	}

	
}
