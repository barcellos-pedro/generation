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
		doutor = "Doutor Mário";
		diagnostico = "Covid19 negativo";
	}
	void getDadosPaciente() {
		System.out.println(
				"\nOlá " + nome + "." +
				"\nSua data de entrada foi: " + dtEntrada +
				"\nO médico que irá te acompanhar hoje será o " + doutor +
				"\nSeu diagnóstico do último exame realizado: [" + diagnostico + "]"
		);
	}
}
