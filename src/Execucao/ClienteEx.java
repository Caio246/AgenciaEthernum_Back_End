package Execucao;

import java.util.Scanner;

import services.ClienteService;

public class ClienteEx {
	
		public static void main(String[] args) {
						Scanner scan = new Scanner(System.in);
						Boolean repetir = true;
						do {
							System.out.println("Digite uma das opções abaixo");
							System.out.println("0 - Sair");
							System.out.println("1 - Adicionar Cliente");
							System.out.println("2 - Atualizar Cliente");
							System.out.println("3 - Deletar Cliente");
							int opcao = scan.nextInt();
							ClienteService clienteService = new ClienteService();
							switch(opcao) {
								case 0:
									repetir = false;
									break;
								case 1:
									clienteService.save();
									break;
								case 2:
									clienteService.update();
									break;
								case 3:
									clienteService.delete();
									break;
								default:
									System.out.println("Opção inválida");
									break;
							}
						} while(repetir);
						
						}
			}
