package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import connector.ConexaoComBanco;
import model.Cliente;


public class ClienteService {
	

			public void save() {
				
				Scanner scan = new Scanner(System.in);
				
				Cliente cliente = new Cliente();
				
				System.out.println("Digite seu nome: ");		
				cliente.setNome(scan.next());
				
				System.out.println("Digite seu e-mail: ");		
				cliente.setEmail(scan.next());
				
				System.out.println("Digite seu CPF: ");		
				cliente.setCpf(scan.nextInt());
				
				System.out.println("Digite a data de destino: ");		
				cliente.setRegistrigeral(scan.nextInt());
				
				String sql = "INSERT INTO destino(nome,email,cpf,registrogeral) VALUES (?,?,?,?)";

				
				Connection conn = null;
				PreparedStatement pstm = null;
				
				try {
				
					conn = ConexaoComBanco.createConnection();
					pstm = conn.prepareStatement(sql);
					
					pstm.setString(1, cliente.getNome());
					pstm.setString(2, cliente.getEmail());
					pstm.setInt(3, cliente.getCpf());
					pstm.setInt(4, cliente.getRegistrigeral());
				
					pstm.execute();
					
					System.out.println("Cliente inserido!");
					
					conn.close();
					pstm.close();
					
					
				} catch(Exception ex) {
					System.out.println(ex.getMessage());
				} 
			}
			
				public void update() {
					
					Scanner scan = new Scanner(System.in);
					
					Cliente cliente = new Cliente();
					
					System.out.println("Digite sua Id: ");		
					cliente.setId(scan.next());
					
					System.out.println("Digite seu nome: ");
					scan.nextLine();
					cliente.setNome(scan.next());
					
					System.out.println("Digite seu e-mail: ");	
					scan.nextLine();
					cliente.setEmail(scan.nextInt());
					
					System.out.println("Digite seu CPF: ");	
					scan.nextLine();
					cliente.setCpf(scan.next());
					
					System.out.println("Digite seu local de destino: ");	
					scan.nextLine();
					cliente.setTelefone(scan.next());
					
					System.out.println("Digite seu RG: ");	
					scan.nextLine();
					cliente.setRegistrigeral(scan.nextInt());
					
					String sql = "UPTADE destino set nome = ?, telefone = ?, cpf = ?, registrogeral = ? where id = ?";
					
					Connection conn = null;
					PreparedStatement pstm = null;
					
					try {
						conn = ConexaoComBanco.createConnection();
						pstm = conn.prepareStatement(sql);
						
						pstm.setString(1, cliente.getNome());
						pstm.setInt(2, cliente.getTelefone());
						pstm.setInt(3, cliente.getCpf());
						pstm.setInt(4, cliente.getRegistrigeral());
						
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

					String sql = "DELETE FROM cliente WHERE id = ?";

					Connection conn = null;
					PreparedStatement pstm = null;

					try {
						conn = ConexaoComBanco.createConnection();
						
						pstm = conn.prepareStatement(sql);

						Cliente cliente = null;
						pstm.setString(1, cliente.getNome());
						pstm.setInt(2, cliente.getTelefone());
						pstm.setInt(3, cliente.getCpf());
						pstm.setInt(4, cliente.getRegistrigeral());
					
						
						pstm.execute();
						
						System.out.println("Deletado!");
						conn.close();
						pstm.close();

					}catch (Exception ex) {
						System.out.println(ex.getMessage());
					}
				}
			}
