package listaExercicios;

public class Patinete {
	private String modelo;
	private String cor;
	
	public Patinete(String modelo, String cor) {
		this.modelo = modelo;
		this.cor = cor;
	}
	public String getDadosPatinete() {
		String dados = "\nModelo do patinete: " + modelo + ". \nCor atual: " + cor;
		return dados;
	}
	public String pular() {
		return "Pulando alguns centímetros... \nPulou!\n";
	}
}
