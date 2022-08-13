
public class Principal {
	public static void main(String[] args) {
		BancoDeDados sintaxeBanco = new BancoDeDados();
		sintaxeBanco.conectar();
		
		if(sintaxeBanco.estaConectado()) {
			sintaxeBanco.listarClientes();
			sintaxeBanco.editarCliente("Ka Ferre", "89919414", "9988-5436", "kathyk07@ibm.com", "Rua 408loja 101-casa 404","3");
			sintaxeBanco.inserirCliente("Kathleen Ferreira", "885419414", "99578-5436", "kathynik07@ibm.com", "Rua 404-loja 101-casa 404");
			sintaxeBanco.excluirCliente("3");
			
		//+++++++++++++++++++++++++++++produto+++++++++++++++++++++++++++++++++
			sintaxeBanco.listarProduto();
			sintaxeBanco.inserirProduto("Dipirona", "4.90", "10", "sim", "Remedio para dor de cabeça");
			sintaxeBanco.excluirProduto("3");
			sintaxeBanco.editarProduto("Dipna", "4.9", "1", "nao", "Remedio colica","2");
			
			
			
			System.out.println("Conexão realizada");
		}
		else
			System.out.println("Conexao não realizado");

	}



}
