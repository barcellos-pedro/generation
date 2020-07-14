package listaExercicios;

public class Pessoa {
	private String nome;
	private String endereco;
	private String telefone;
	private String dtNascimento;
	private String escolaridade;
	
	public Pessoa(String nome, String endereco, String telefone, String dtNascimento, String escolaridade) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.dtNascimento = dtNascimento;
		this.escolaridade = escolaridade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(String dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public String getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}
	
	
}
