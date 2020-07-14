package listaExercicios;

public class Vendedor extends Pessoa{
	private double valorVendas;
	private double comissao;
	
	public Vendedor(String nome, String endereco, String telefone, String dtNascimento, String escolaridade, double valorVendas, double comissao) {
		super(nome, endereco, telefone, dtNascimento, escolaridade);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}

	public double calcValorFinal() {
		double valorFinal = (valorVendas + (valorVendas * comissao));
		return valorFinal;
	}
	
	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	
}
