package exerciciosCollections;

import java.awt.List;

public class Principal {
	
	public static void listarEstoque(String[] param) {
		for(String item: param) {
			System.out.println("\n"+item);
		}
	}
	
	public static void main(String args[]) {
		int opcao;
		
		List estoque = new List();

		//Armazenar dados da List
		estoque.add("item 1");
		estoque.add("item 2");
		estoque.add("item 3");
		
		estoque.add("item A");
		estoque.add("item B");
		estoque.add("item C");		
		
		//Remover dados da list;
		//estoque.removeAll();
		estoque.remove("item B");
		
		//Atualizar dados da list.
		estoque.replaceItem("novo item", 1);
		
		//Apresentar todos os dados da list.
		String[] items = estoque.getItems();
		listarEstoque(items);
	}
}
