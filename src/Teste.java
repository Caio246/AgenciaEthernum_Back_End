import java.util.Scanner;

import services.DestinoService;


public class Teste {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner scan = new Scanner(System.in);
				Boolean repetir = true;
				do {
					System.out.println("Digite uma das opções abaixo");
					System.out.println("0 - Sair");
					System.out.println("1 - Adicionar Destino");
					System.out.println("2 - Atualizar Destino");
					System.out.println("3 - Deletar Destino");
					int opcao = scan.nextInt();
					DestinoService destinoService = new DestinoService();
					switch(opcao) {
						case 0:
							repetir = false;
							break;
						case 1:
							destinoService.save();
							break;
						case 2:
							destinoService.update();
							break;
						case 3:
							destinoService.delete();
							break;
						default:
							System.out.println("Opção inválida");
							break;
					}
				} while(repetir);
				
				}
	}
	