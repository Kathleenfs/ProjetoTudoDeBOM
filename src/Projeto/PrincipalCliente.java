package Projeto;

public class PrincipalCliente {
	public static void main(String[] args) {	
		Cliente cliente = new Cliente();
		cliente.listarClientes();
		cliente.insereCliente("Leo10003", "2222222", "555955959", "leo@hotmail", "Av. Leo bolado");
		cliente.listarClientes();
		cliente.updateCliente("5", "Leo10053");
		cliente.listarClientes();
		cliente.deleteCliente("5");
		cliente.listarClientes();
	}

}
