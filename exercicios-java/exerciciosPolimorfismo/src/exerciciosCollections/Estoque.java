package exerciciosCollections;

public class Estoque {
	private String nome;
	private String descricao;
	private int quantidade;
	
	Estoque(String nome, String descricao, int quantidade){
		this.nome = nome;
		this.descricao = descricao;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public String getDados() {
		return "Nome do produto: " + nome +
				"\nDescrição: " + descricao +
				"\nQuantidade: " + quantidade;
	}
}
