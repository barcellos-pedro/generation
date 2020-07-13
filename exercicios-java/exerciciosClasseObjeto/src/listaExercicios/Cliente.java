package listaExercicios;

public class Cliente{
	private String nome;
	private String dtNascimento;
	private boolean statusAtivo;
	private String metodoPagamento;
		
	public Cliente(String nome, String dtNascimento, boolean statusAtivo, String metodoPagamento) {
		this.nome = nome;
		this.dtNascimento = dtNascimento;
		this.statusAtivo = statusAtivo;
		this.metodoPagamento = metodoPagamento;
	}
	public String getDadosCliente() {
		String dados = "Olá " + nome + ". \nSua data de nascimento: " + dtNascimento + ". \nSeu status conosco: " + (statusAtivo ? "Ativo" : "Inativo") + ". \nMétodo de pagamento atual: " + metodoPagamento;
		return dados;
	}
}
