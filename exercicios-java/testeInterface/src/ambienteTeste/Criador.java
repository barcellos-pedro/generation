package ambienteTeste;

public class Criador {
	private String nomeCriador;
	private String idadeCriador;

	Criador(String nomeCriador, String idadeCriador){
		this.nomeCriador = nomeCriador;
		this.idadeCriador = idadeCriador;
	}
	
	public String getNomeCriador() {
		return nomeCriador;
	}
	public void setNomeCriador(String nomeCriador) {
		this.nomeCriador = nomeCriador;
	}
	public String getIdadeCriador() {
		return idadeCriador;
	}
	public void setIdadeCriador(String idadeCriador) {
		this.idadeCriador = idadeCriador;
	}
	
}
