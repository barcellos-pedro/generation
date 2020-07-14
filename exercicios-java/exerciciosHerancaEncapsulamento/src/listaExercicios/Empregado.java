package listaExercicios;

public class Empregado extends Pessoa{
	private int codigoSetor;
	private double salarioBase;
	private double imposto;
	
	public Empregado(String nome, String endereco, String telefone, String dtNascimento, String escolaridade, int codigoSetor, double salarioBase, double imposto) {
		super(nome, endereco, telefone, dtNascimento, escolaridade);
		 this.codigoSetor = codigoSetor;
		 this.salarioBase = salarioBase;
		 this.imposto = imposto;
	}

	public double calcularSalario() {
		double salarioFinal = ( salarioBase - (salarioBase * imposto) );
		return salarioFinal;
	}
	
	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
}
