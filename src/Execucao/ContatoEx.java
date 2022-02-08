package Execucao;

import java.util.Scanner;

import services.ContatoService;


public class ContatoEx {
	public static void main(String[] args) {
					Scanner scan = new Scanner(System.in);
					Boolean repetir = true;
					do {
						System.out.println("Digite uma das opções abaixo");
						System.out.println("0 - Sair");
						System.out.println("1 - Adicionar Contato");
						System.out.println("2 - Atualizar Contato");
						System.out.println("3 - Deletar Contato");
						int opcao = scan.nextInt();
						ContatoService contatoService = new ContatoService();
						switch(opcao) {
							case 0:
								repetir = false;
								break;
							case 1:
								contatoService.save();
								break;
							case 2:
								contatoService.update();
								break;
							case 3:
								contatoService.delete();
								break;
							default:
								System.out.println("Opção inválida");
								break;
						}
					} while(repetir);
					
					}
		}

