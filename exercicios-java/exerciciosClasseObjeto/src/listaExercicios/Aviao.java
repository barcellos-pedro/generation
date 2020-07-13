package listaExercicios;

public class Aviao {
	private String modelo;
	private String cor;
	private int lugares;
	
	public Aviao(String modelo, String cor, int lugares) {
		this.modelo = modelo;
		this.cor = cor;
		this.lugares = lugares;
	}
	public String getDadosAviao() {
		String dados = "\nModelo: " + modelo + ". \nCor: " + cor + ". \nQuantidade de lugares: " + lugares;
		return dados;
	}
}
