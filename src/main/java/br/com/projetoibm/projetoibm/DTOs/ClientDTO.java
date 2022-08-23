package br.com.projetoibm.projetoibm.DTOs;

import javax.validation.constraints.NotBlank;

public class ClientDTO {
	@NotBlank
	private String nome;
	@NotBlank
	private String cpf;	
	@NotBlank
	private String email;	
	@NotBlank
	private String tel;
	
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

	
	
}
