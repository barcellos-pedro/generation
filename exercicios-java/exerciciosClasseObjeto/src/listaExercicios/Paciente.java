package listaExercicios;

public class Paciente {
	String nome;
	private String dtNascimento;
	private String dtEntrada;
	private String doutor;
	private String diagnostico;
	
	public Paciente(String nome, String dtNascimento) {
		this.nome = nome;
		this.dtNascimento = dtNascimento;
		dtEntrada = "13/07/2020";
		doutor = "Doutor M�rio";
		diagnostico = "Covid19 negativo";
	}
	void getDadosPaciente() {
		System.out.println(
				"\nOl� " + nome + "." +
				"\nSua data de entrada foi: " + dtEntrada +
				"\nO m�dico que ir� te acompanhar hoje ser� o " + doutor +
				"\nSeu diagn�stico do �ltimo exame realizado: [" + diagnostico + "]"
		);
	}
}
