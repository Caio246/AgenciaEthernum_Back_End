package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import connector.ConexaoComBanco;
import model.Destino;


public class DestinoService {
		
		public void save() {
			
			Scanner scan = new Scanner(System.in);
			
			Destino destino = new Destino();
			
			System.out.println("Digite seu nome: ");		
			destino.setNome(scan.next());
			
			System.out.println("Digite seu telefone: ");		
			destino.setTelefone(scan.nextInt());
			
			System.out.println("Digite seu local de partida: ");		
			destino.setLocal_de_partida(scan.next());
			
			System.out.println("Digite a data de partida: ");		
			destino.setData_de_partida(scan.nextInt());
			
			System.out.println("Digite seu local de destino: ");		
			destino.setLocal_de_destino(scan.next());
			
			System.out.println("Digite a data de destino: ");		
			destino.setData_de_destino(scan.nextInt());
			
			String sql = "INSERT INTO destino(nome,telefone,local_de_partida,data_de_partida, local_de_destino, data_de_destino) VALUES (?,?,?,?,?,?)";

			
			Connection conn = null;
			PreparedStatement pstm = null;
			
			try {
			
				conn = ConexaoComBanco.createConnection();
				pstm = conn.prepareStatement(sql);
				
				pstm.setString(1, destino.getNome());
				pstm.setInt(2, destino.getTelefone());
				pstm.setString(3, destino.getLocal_de_partida());
				pstm.setInt(4, destino.getData_de_partida());
				pstm.setString(5, destino.getLocal_de_destino());
				pstm.setInt(6, destino.getData_de_destino());
				
				pstm.execute();
				
				System.out.println("Destino inserido!");
				
				conn.close();
				pstm.close();
				
				
			} catch(Exception ex) {
				System.out.println(ex.getMessage());
			} 
		}
		
			public void update() {
				
				Scanner scan = new Scanner(System.in);
				
				Destino destino = new Destino();
				
				System.out.println("Digite sua Id: ");		
				destino.setId(scan.next());
				
				System.out.println("Digite seu nome: ");
				scan.nextLine();
				destino.setNome(scan.next());
				
				System.out.println("Digite seu telefone: ");	
				scan.nextLine();
				destino.setTelefone(scan.nextInt());
				
				System.out.println("Digite seu local de partida: ");	
				scan.nextLine();
				destino.setLocal_de_partida(scan.next());
				
				System.out.println("Digite a data de partida: ");	
				scan.nextLine();
				destino.setData_de_partida(scan.nextInt());
				
				System.out.println("Digite seu local de destino: ");	
				scan.nextLine();
				destino.setLocal_de_destino(scan.next());
				
				System.out.println("Digite a data de destino: ");	
				scan.nextLine();
				destino.setData_de_destino(scan.nextInt());
				
				String sql = "UPTADE destino set nome = ?, telefone = ?, local_de_partida = ?, data_de_partida = ?, local_de_destino = ?, data_de_destino = ? where id = ?";
				
				Connection conn = null;
				PreparedStatement pstm = null;
				
				try {
					conn = ConexaoComBanco.createConnection();
					pstm = conn.prepareStatement(sql);
					
					pstm.setString(1, destino.getNome());
					pstm.setInt(2, destino.getTelefone());
					pstm.setString(3, destino.getLocal_de_partida());
					pstm.setInt(4, destino.getData_de_partida());
					pstm.setString(5, destino.getLocal_de_destino());
					pstm.setInt(6, destino.getData_de_destino());
					
					pstm.execute();
					
					System.out.println("Atualizado!");
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

					Destino destino = null;
					pstm.setString(1, destino.getNome());
					pstm.setInt(2, destino.getTelefone());
					pstm.setString(3, destino.getLocal_de_partida());
					pstm.setInt(4, destino.getData_de_partida());
					pstm.setString(5, destino.getLocal_de_destino());
					pstm.setInt(6, destino.getData_de_destino());
					
					pstm.execute();
					
					System.out.println("Deletado!");
					conn.close();
					pstm.close();

				}catch (Exception ex) {
					System.out.println(ex.getMessage());
				}
			}
		}		
	
