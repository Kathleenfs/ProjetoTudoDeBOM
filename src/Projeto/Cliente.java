package Projeto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Cliente {
	private PreparedStatement pstm = null;
	private Connection connection=null;
	private ResultSet resultset=null;
	private String query = null;
	
	public Cliente() {
		try {
			this.connection = BancoDeDados.connect();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void listarClientes() {	
		try {
				
				query = "select * from cliente";	
				pstm = connection.prepareStatement(query);
				resultset = pstm.executeQuery();
				
				while(this.resultset.next()) {				

					String meuId = resultset.getString("id_cliente");
					String meuNome = resultset.getString("nome_cliente");
					String meuCpf = resultset.getString("cpf_cliente");
					String meuTel = resultset.getString("tel_cliente");
					String meuEmail = resultset.getString("email_cliente");
					String meuEndereco = resultset.getString("endereco_cliente");
					
					System.out.println("id: "+meuId);
					System.out.println("Nome:"+meuNome);
					System.out.println("Cpf:"+meuCpf);
					System.out.println("telefone: "+meuTel);
					System.out.println("Email:"+meuEmail);
					System.out.println("Endereco:"+meuEndereco);
				}
			
			}catch(Exception e ) {
				System.out.println("Erro "+e.getMessage());
			}
		}
	public void insereCliente(String nome_cliente, String cpf_cliente,String tel_cliente, String email_cliente,String endereco_cliente) {
		
		
		String query = "insert into cliente (nome_cliente,cpf_cliente,tel_cliente,email_cliente,endereco_cliente)"
				+ "values ('"+nome_cliente+"','"+cpf_cliente+"','"+tel_cliente+"','"+email_cliente+"','"+endereco_cliente+"')";
	   
		try {		
			pstm = connection.prepareStatement(query);
			pstm.execute();
		
		}catch(Exception e ) {
			System.out.println("Erro"+e.getMessage());
		}


	}
	public void updateCliente(String id_cliente,String nome_cliente) {			
			
			String query = "update cliente set nome_cliente = '"+nome_cliente+"' where id_cliente = '"+id_cliente+"'";
			try {
				pstm = connection.prepareStatement(query);
				pstm.execute();			
			}catch(Exception e ) {
				System.out.println("Erro"+e.getMessage());
			}	
	}
	public void deleteCliente(String id_cliente) {			
		
		String query = "delete from cliente where id_cliente = '"+id_cliente+"'";
		try {
			pstm = connection.prepareStatement(query);
			pstm.execute();			
		}catch(Exception e ) {
			System.out.println("Erro"+e.getMessage());
		}	
	}

}

    
    


