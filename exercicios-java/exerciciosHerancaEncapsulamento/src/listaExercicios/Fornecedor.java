package listaExercicios;

public class Fornecedor extends Pessoa {
	private double valorCredito;
	private double valorDivida;
	
	public Fornecedor(String nome, String endereco, String telefone, String dtNascimento, String escolaridade, double valorCredito, double valorDivida) {
		super(nome, endereco, telefone, dtNascimento, escolaridade);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	
	public void getSaldo() {
		double saldo = (valorCredito - valorDivida);
		System.out.println("Seu saldo: " + saldo);
	}

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
}
