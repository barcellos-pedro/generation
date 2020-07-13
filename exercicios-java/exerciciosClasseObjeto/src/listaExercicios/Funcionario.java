package listaExercicios;

public class Funcionario {
	private String nome;
	private String dtNascimento;
	private String dtAdmissao;
	private double salarioInicial;
	
	public Funcionario(String nome, String dtNaascimento) {
		this.nome = nome;
		this.dtNascimento = dtNascimento;
		this.dtAdmissao = "20/20/2020";
		this.salarioInicial = 3300.00;
	}
	public String getDadosFuncionario() {
		String dados = "\nOlá " + nome + ". \nSua data de nascimento registrada: " + dtNascimento + ". \nData de admissão: " + dtAdmissao + ". \nSalário: " + salarioInicial;
		return dados;
	}
}
