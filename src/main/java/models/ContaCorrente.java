package models;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente titular) {
		super(titular);
	}

	public void imprimirExtrato() {
		System.out.println("=== Extrado de Conta Corrente ===");
		super.imprimirInfoComuns();
	}
	
}
