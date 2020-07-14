package listaExercicios;

public class Main {
	public static void main(String args[]) {
		Fornecedor fornecedor = new Fornecedor("Fornecedor 1", "rua do lalá", "4002-8922", "14/07/2020","Ensino médio/técnico", 600.00, 550.00);
		fornecedor.getSaldo();
		System.out.println(fornecedor.getNome());
		System.out.println(fornecedor.getEndereco());
		System.out.println(fornecedor.getTelefone());
		System.out.println(fornecedor.getDtNascimento());
		System.out.println(fornecedor.getEscolaridade());
		
		System.out.println("\n ##################### \n");
		
		Empregado empregado = new Empregado("Empregador 1", "Rua do empregado 999", "8989-0229", "00/00/0000", "Ensino fundamental", 001, 3300.00, 0.15);
		System.out.println(empregado.calcularSalario());
		System.out.println(empregado.getNome());
		System.out.println(empregado.getEndereco());
		System.out.println(empregado.getTelefone());
		System.out.println(empregado.getDtNascimento());
		System.out.println(empregado.getEscolaridade());
		System.out.println(empregado.getCodigoSetor());
		System.out.println(empregado.getSalarioBase());
		
		System.out.println("\n ##################### \n");
		
		Administrador adm = new Administrador("Adm topzera", "rua do zé", "2333-2312", "00/00/0000", "Pós Graduação", 50.00);
		System.out.println(adm.getNome());
		System.out.println(adm.getEndereco());
		System.out.println(adm.getTelefone());
		System.out.println(adm.getDtNascimento());
		System.out.println(adm.getEscolaridade());
		System.out.println(adm.getAjudaDeCusto());
		
		System.out.println("\n ##################### \n");
		
		Operario operario = new Operario("Operario baum", "rua dos operários", "3333-2222", "90/02/0003", "Doutor", 300.00, 0.5);
		System.out.println(operario.getNome());
		System.out.println(operario.getEndereco());
		System.out.println(operario.getTelefone());
		System.out.println(operario.getDtNascimento());
		System.out.println(operario.getEscolaridade());
		System.out.println(operario.getValorProducao());
		System.out.println(operario.getComissao());
		System.out.println(operario.calcValorFinal());
		
		System.out.println("\n ##################### \n");
		
		Vendedor vendedor = new Vendedor("Vendedor de amendoin", "rua dos vendedores", "1111-1111", "30/30/3003", "Mestre", 300.00, 0.5);
		System.out.println(vendedor.getNome());
		System.out.println(vendedor.getEndereco());
		System.out.println(vendedor.getTelefone());
		System.out.println(vendedor.getDtNascimento());
		System.out.println(vendedor.getEscolaridade());
		System.out.println(vendedor.getValorVendas());
		System.out.println(vendedor.getComissao());
		System.out.println(vendedor.calcValorFinal());
	}
}
