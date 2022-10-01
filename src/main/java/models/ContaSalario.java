package models;

public class ContaSalario extends Conta {

	public ContaSalario(Cliente titular) {
		super(titular);
	}

	public void imprimirExtrato() {
		System.out.println("=== Extrado de Conta Salario ===");
		super.imprimirInfoComuns();
	}
	
}
