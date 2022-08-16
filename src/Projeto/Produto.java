package Projeto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Produto {
	private PreparedStatement pstm = null;
	private Connection connection=null;
	private ResultSet resultset=null;
	private String query = null;
	
	public Produto() {
		try {
			this.connection = BancoDeDados.connect();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	public void listarProdutos() {
        try {

                query = "select * from produto";
                pstm = connection.prepareStatement(query);
                resultset = pstm.executeQuery();

                while(this.resultset.next()) {

                    String prodId = resultset.getString("id_produto");
                    String prodNome = resultset.getString("nome_produto");
                    Double prodPreco = resultset.getDouble("preco_produto");
                    String Generico = resultset.getString("generico");
                    String Descricao = resultset.getString("desc_produto");


                    System.out.println("id: "+prodId);
                    System.out.println("Nome:"+prodNome);
                    System.out.println("Preco:"+prodPreco);
                    System.out.println("Generico: "+Generico);
                    System.out.println("Descricao:"+Descricao);
                    if (Generico.equals("sim")){

                        System.out.printf("Valor com desconto: R$ %.2f\n",(prodPreco *0.8));
                    }

                }
            }catch(Exception e ) {
                System.out.println("Erro "+e.getMessage());
            }
        }
	public void insereProduto(String nome, String preco,String qtd,String generico,String descricao) {
		
		
		String query = "insert into produto(nome_produto ,preco_produto, qtd_produto ,generico, desc_produto) values ('"+nome+"','"+preco+"','"+qtd+"','"+generico+"','"+descricao+"')";
	   
		try {		
			pstm = connection.prepareStatement(query);
			pstm.execute();
		
		}catch(Exception e ) {
			System.out.println("Erro"+e.getMessage());
		}


	}
	public void updateProduto(String id,String nome) {			
			
			String query = "update produto set nome_produto = '"+nome+"' where id_produto = '"+id+"'";
			try {
				pstm = connection.prepareStatement(query);
				pstm.execute();			
			}catch(Exception e ) {
				System.out.println("Erro"+e.getMessage());
			}	
	}
	public void deleteProduto(String id) {			
		
		String query = "delete from produto where id_produto = '"+id+"'";
		try {
			pstm = connection.prepareStatement(query);
			pstm.execute();			
		}catch(Exception e ) {
			System.out.println("Erro"+e.getMessage());
		}	
	}

}


