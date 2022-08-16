package Projeto;

public class PrincipalProduto {
	public static void main(String[] args) {	
		Produto produto = new Produto();
		produto.listarProdutos();
		produto.insereProduto("Di", "4.90", "10", "sim", "Remedio para dor de cabeça");
		//produto.listarProdutos();
		//produto.updateProduto("1", "dipina");
		produto.listarProdutos();
		//produto.deleteProduto("1");
		produto.listarProdutos();
	
	}

}