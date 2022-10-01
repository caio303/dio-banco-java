package models;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente titular) {
		super(titular);
	}

	public void imprimirExtrato() {
		System.out.println("=== Extrado de Conta Poupança ===");
		super.imprimirInfoComuns();
	}
}
