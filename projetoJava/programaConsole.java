package unidade1.prova.com;

import java.util.ArrayList;
import java.util.Scanner;

public class Programa{
	
		
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		ArrayList<Jogos> listaJogo = new ArrayList<>();
		
		System.out.println("Iniciar: [Y/N]?");
		String iniciar = entrada.nextLine();
		
		while(iniciar.equalsIgnoreCase("Y") || iniciar.equalsIgnoreCase("y")) {
					
						
			System.out.println("\nEscolha as opcoes:\n" + "1 - Cadastrar jogo\n" + "2 - consulta de jogos\n" + 
			"3 - Registro de venda\n" + "4 - Relatorio de venda\n" + "5 - sair do programa\n" + "Digite qual opcao escolher: ");
			
			int opcao = Integer.parseInt(entrada.nextLine());
			
			if(opcao == 1) {
				
				Jogos jogo = new Jogos();
				
				jogo.setId(listaJogo.size() + 1);
				
				System.out.println("Nome do jogo: ");
				jogo.setNomeJogo(entrada.nextLine());
				
				System.out.println("Faixa etaria do jogo(14, 16 ou 18 anos): ");
				jogo.setFaixaEtaria(Integer.parseInt(entrada.nextLine()));
				
				listaJogo.add(jogo);
				System.out.println("Jogo foi cadastrado com sucesso!");
				
			}
			
			else if (opcao == 2) {
				
				for(Jogos jogo: listaJogo) {
					
					int id = jogo.getId();
					
					int idade = jogo.getFaixaEtaria();
					
					String nome = jogo.getNomeJogo();
					
					String status = jogo.getStatus();
					
					System.out.println("Id: \n" + id + "\n" +"Nome do jogo: \n" + nome + "\n" + "Faixa etaria(14, 16, 18): \n"  + idade + '\n' + 
							"Status: \n" + status + "\n");
					
				}
				
				
			}
			else if (opcao == 3) {
			  
			  System.out.println("Id do jogo: ");
			  int testaId = Integer.parseInt(entrada.nextLine());
			  
			  for(int i = 0;i <= listaJogo.size(); i++ ) {
				  
				  int id = listaJogo.get(i).getId();
				  
				  if(testaId == id) {
					  
					  Jogos indice = listaJogo.get(i);
					  
					  indice.setStatus("Vendido");
					  
					  System.out.print("Data da venda: ");					  
					  indice.setData(entrada.nextLine());
					  
					  System.out.print("Preco do jogo: ");					  
					  indice.setPreco(Double.parseDouble(entrada.nextLine()));
					  
					  System.out.print("Valor da desconto: ");
					  indice.setDesconto(Double.parseDouble(entrada.nextLine()));
					  
					  System.out.print("\njogo foi vendido");
				  }
				  
			  }
			  
		  }
			else if(opcao == 4) {
			
			
			for(int i =0; i<= listaJogo.size(); i++) {
				
				double preco = listaJogo.get(i).getPreco();
				
				String status = listaJogo.get(i).getStatus();
				
				if(preco > 0 && status.equalsIgnoreCase("Vendido")) {
					
					int id = listaJogo.get(i).getId();
					
					String nome = listaJogo.get(i).getNomeJogo();
					
					int idade = listaJogo.get(i).getFaixaEtaria();
					
					String data = listaJogo.get(i).getData();
					
					double desconto = listaJogo.get(i).getDesconto();
					
					double valorTotal = preco - desconto;
					
					System.out.println("Id: \n" + id + "\n" +"Nome do jogo: \n" + nome + "\n" + "Faixa etaria(14, 16, 18): \n"  + idade + "\n" + 
							"Status: \n" + status + "\n" + "Data da venda: \n" + data + "\n" + "Preco do jogo: \n" + preco + "\n" + "Desconto do jogo: \n" + desconto
							+ "\n" + "Valor Arrecadado: \n" + valorTotal + "\n");
					System.out.println("Consulta concluida com sucesso!");
					
				}
				
				
			}
			
		}
		else if (opcao == 5) {
		  System.out.println("Saindo do sistema...");
		  entrada.close();
		  break;
		  
	  }
		else {
			
			System.out.println("Erro de digitacao");
			
		}
			
		}

	}

		
	}
	