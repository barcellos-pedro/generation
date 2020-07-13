package listaExercicios;

public class ContaBanco {
	private String nome;
	private String tipoConta;
	private double saldo;
	
	public ContaBanco(String nome, String tipoConta) {
		this.nome = nome;
		this.tipoConta = tipoConta;
		this.saldo = 0; 
	}
	public String verSaldo() {
		String dados = "Seu saldo atual: " + saldo;
		return dados;
	}
	public String fazerDeposito(int valor) {
		this.saldo += valor;
		return "Boa tarde " + nome + ". | Depósito de " + valor + " realizado!";
	}
	public String sacarDinheiro(int valor) {
		this.saldo -= valor;
		return "Boa tarde " + nome + ". | Saque de " + valor + " realizado.\n" + verSaldo();
	}
}
