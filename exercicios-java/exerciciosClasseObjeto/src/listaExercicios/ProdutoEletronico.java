package listaExercicios;

public class ProdutoEletronico {
	private String nome;
	private String descricao;
	private double valor;
	private int quantidade;
	
	public ProdutoEletronico(String nome, String descricao, double valor, int quantidade) {
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
		this.quantidade = quantidade;
	}
	public String getDadosProduto() {
		String dados = "\nNome do produto: " + nome + ". \nDescrição: " + descricao + ". \nValor: R$" + valor + ". \nQuantidade restante: " + quantidade;
		return dados;
	}
}
