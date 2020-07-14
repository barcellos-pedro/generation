package ambienteTeste;

public class Roboto extends Criador implements Operacoes, FrasesTop{
	private String nome;
	private String descricao;
	private String versao;
	
	public Roboto(String nome, String descricao, String versao, String nomeCriador, String idadeCriador) {
		super(nomeCriador, idadeCriador);
		this.nome = nome;
		this.descricao = descricao;
		this.versao = versao;
	}

	@Override
	public void frase1(String frase) {
		System.out.print(frase);
	}
	
	@Override
	public int soma(int num1, int num2) {
		return num1+num2;
	};

	public void getDados() {
		System.out.println(
				"Nome: " + nome +
				"\nDescricao: " + descricao +
				"\nVersão: " + versao +
				"\nCriador: " + getNomeCriador() +
				"\nIdade do criador: " + getIdadeCriador()
		);
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

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}
	
}
