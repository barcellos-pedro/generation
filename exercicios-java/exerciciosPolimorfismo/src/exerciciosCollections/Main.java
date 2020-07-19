package exerciciosCollections;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static Estoque criarItem(String nome, String descricao, int qtd) {
		Estoque item = new Estoque(nome, descricao, qtd);
		return item;
	}
	
	public static void listarEstoque(List<Estoque> estoqueParam) {
		for(Estoque item : estoqueParam) {
			System.out.println("\n" + item.getDados());
		}	
	}
	
	public static void main (String args[]) {
		Scanner leitura = new Scanner(System.in);
		
		//Criar ArrayList do tipo Estoque
		List<Estoque> estoquePrincipal = new ArrayList<Estoque>();
		
		int opcao = 0;
		
		System.out.println(
				"Boa tarde!" +
					"\n\nDigite a opção desejada:" +
						"\n1) Adicionar novo item" +
						"\n2) Remover item" +
						"\n3) Atualizar item" +
						"\n4) Mostrar estoque geral."
		);
		
		try {
			opcao = leitura.nextInt();
		}
		catch(InputMismatchException err){
			System.out.println("\nDigite somente números.");
			return;
		}
		
		//Instanciar objetos do tipo Estoque para serem add a lista estoquePrincipal
		Estoque item1 = new Estoque("Sabão", "Sabão em pó para lavar roupas", 3);
		Estoque item2 = new Estoque("Suco", "Suco do bem", 2);
		Estoque item3 = new Estoque("Tônica", "Juice of life", 99);
		
		//Add objetos a lista
		estoquePrincipal.add(item1);
		estoquePrincipal.add(item2);
		estoquePrincipal.add(item3);
		
		switch(opcao) {
			case 1: //Add item
				String nome, descricao;
				int quantidade;
			
				System.out.println("Digite o nome do produto: ");
				nome = leitura.next();
			
				System.out.println("Digite o descrição do produto: ");
				descricao = leitura.next();
				
				System.out.println("Digite a quantidade do produto: ");
				quantidade = leitura.nextInt();
				
				estoquePrincipal.add(criarItem(nome, descricao, quantidade));
				
				System.out.println("\nItem adicionado!" + "\n\n[Estoque atual]");
				
				listarEstoque(estoquePrincipal);
			break;
				
			case 2: //Remover item
				Iterator<Estoque> iterator = estoquePrincipal.iterator();
				
				String nomeDelete;
				
				System.out.println("\n[Estoque atual]");
				listarEstoque(estoquePrincipal);
				
				System.out.println("\nDigite o nome do produto que você deseja excluir: ");
				nomeDelete = leitura.next();
				
				while(iterator.hasNext()) {
					if(nomeDelete.equals(iterator.next().getNome())) {
						iterator.remove();
					}
				}
				
				System.out.println("\n[Estoque atual]");
				listarEstoque(estoquePrincipal);
			break;
				
			case 3: //Atualizar item
				String nomePesquisa;
				
				String novoNome;
				String novaDescricao;
				int novaQtd;
				
				System.out.println("\n[Estoque atual]");
				listarEstoque(estoquePrincipal);
				
				System.out.println("\nDigite o nome do produto que você atualizar as informações: ");
				nomePesquisa = leitura.next();
				
				for(Estoque item : estoquePrincipal) {
					if(nomePesquisa.equals(item.getNome())) {
						System.out.println("\nDigite o novo nome: ");
						novoNome= leitura.next();
						
						System.out.println("\nDigite a nova descrição: ");
						novaDescricao = leitura.next();
						
						System.out.println("\nDigite a nova quantidade: ");
						novaQtd = leitura.nextInt();
						
						item.setNome(novoNome);
						item.setDescricao(novaDescricao);
						item.setQuantidade(novaQtd);
					}
				}
				
				System.out.println("\n[Estoque atual]");
				listarEstoque(estoquePrincipal);
			break;
				
			case 4: //Listar estoque total
				System.out.println("\n[Estoque atual]");
				listarEstoque(estoquePrincipal);
				break;
			
			default:
				System.out.println("Opção inválida");
			break;
		}
		
		/* ##################################### */
		
	}
}
