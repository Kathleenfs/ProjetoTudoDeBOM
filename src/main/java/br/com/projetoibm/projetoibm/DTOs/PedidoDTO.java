package br.com.projetoibm.projetoibm.DTOs;

import javax.validation.constraints.NotBlank;

public class PedidoDTO {
	@NotBlank
	private int cliente_id;

	public int getCliente_id() {
		return cliente_id;
	}

	
	public void setCliente_id(int cliente_id) {
		this.cliente_id = cliente_id;
	}
}
