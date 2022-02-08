package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import connector.ConexaoComBanco;
import model.Contato;


public class ContatoService {
	
	public void save() {
		
		Scanner scan = new Scanner(System.in);
		
		Contato contato = new Contato();
		
		System.out.println("Digite seu nome: ");		
		contato.setNome(scan.next());
		
		System.out.println("Digite seu Email: ");		
		contato.setEmail(scan.next());
		
		System.out.println("Digite sua Mensagem: ");		
		contato.setMensagem(scan.next());
		
		
		String sql = "INSERT INTO contato(nome,telefone,mensagem) VALUES (?,?,?)";

		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
		
			conn = ConexaoComBanco.createConnection();
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, contato.getNome());
			pstm.setString(2, contato.getEmail());
			pstm.setString(3, contato.getMensagem());
			
			
			pstm.execute();
			
			System.out.println("Mensagem enviada!");
			
			conn.close();
			pstm.close();
			
			
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		} 
	}
	
		public void update() {
			
			Scanner scan = new Scanner(System.in);
			
			Contato contato = new Contato();
			
			System.out.println("Digite sua Id: ");		
			contato.setId(scan.next());
			
			System.out.println("Digite seu nome: ");
			scan.nextLine();
			contato.setNome(scan.next());
			
			System.out.println("Digite seu E-mail: ");	
			scan.nextLine();
			contato.setEmail(scan.next());
			
			System.out.println("Digite sua Mensagem: ");	
			scan.nextLine();
			contato.setMensagem(scan.next());
			
			
			String sql = "UPTADE contato set nome = ?, email = ?, mensagem = ? where id = ?";
			
			Connection conn = null;
			PreparedStatement pstm = null;
			
			try {
				conn = ConexaoComBanco.createConnection();
				pstm = conn.prepareStatement(sql);
				
				pstm.setString(1, contato.getNome());
				pstm.setString(2, contato.getEmail());
				pstm.setString(3, contato.Mensagem());
			
				
				pstm.execute();
				
				System.out.println("Contato atualizado!");
				conn.close();
				pstm.close();
				
			}catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
		}
		
		@SuppressWarnings("null")
		public void delete() {

			String sql = "DELETE FROM destino WHERE id = ?";

			Connection conn = null;
			PreparedStatement pstm = null;

			try {
				conn = ConexaoComBanco.createConnection();
				
				pstm = conn.prepareStatement(sql);

				Contato contato = null;
				pstm.setString(1, contato.getNome());
				pstm.setString(2, contato.getEmail());
				pstm.setString(3, contato.getMensagem());
				
				pstm.execute();
				
				System.out.println("Deletado!");
				conn.close();
				pstm.close();

			}catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
		}

}
