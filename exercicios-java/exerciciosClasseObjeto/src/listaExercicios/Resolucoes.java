package listaExercicios;

public class Resolucoes {
	public static void main(String args[]) {
		Cliente cliente = new Cliente("Pedro Reis", "00/00/2020", true, "Crédito");
		System.out.println(cliente.getDadosCliente());
		
		Aviao aviao = new Aviao("topzre", "Laranja", 3);
		System.out.println(aviao.getDadosAviao());
		
		ProdutoEletronico produto = new ProdutoEletronico("Fritadeira", "Frita umas paradas", 129.90, 4);
		System.out.println(produto.getDadosProduto());
		
		Funcionario funcionario = new Funcionario("Fulano novo funcionário da Silva", "00/00/2020");
		System.out.println(funcionario.getDadosFuncionario());
		
		Patinete patinete = new Patinete("Patinete do Gugu", "Laranja Fogo!");
		System.out.println(patinete.getDadosPatinete());
		System.out.println(patinete.pular());
		
		ContaBanco conta = new ContaBanco("Sr. Barcellos", "Universitário");
		System.out.println(conta.verSaldo());
		System.out.println(conta.fazerDeposito(1700));
		System.out.println(conta.sacarDinheiro(700));
		
		Paciente paciente = new Paciente("Pedro Barcellos", "02/02/2002");
		paciente.getDadosPaciente();
	}
}
