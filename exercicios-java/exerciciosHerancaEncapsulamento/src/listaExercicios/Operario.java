package listaExercicios;

public class Operario extends Pessoa{
	private double valorProducao;
	private double comissao;
	
	public Operario(String nome, String endereco, String telefone, String dtNascimento, String escolaridade, double valorProducao, double comissao) {
		super(nome, endereco, telefone, dtNascimento, escolaridade);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}
	
	public double calcValorFinal() {
		double valorFinal = (valorProducao + (valorProducao * comissao));
		return valorFinal;
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
}
