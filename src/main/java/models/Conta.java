package models;

import interfaces.IConta;
import lombok.Getter;

public abstract class Conta implements IConta{
	
	private static int AGENCIA_PADRAO = 1;
	private static int NUMERO_SEQUENCIAL = 1;
	
	protected @Getter int agencia;
	protected @Getter int numero;
	protected @Getter double saldo;
	protected @Getter Cliente titular;
	
	public Conta(Cliente titular) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = NUMERO_SEQUENCIAL++;
		this.titular = titular;
	}

	public void sacar(double valor) {
		this.saldo -= valor;
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}

	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	protected void imprimirInfoComuns() {
		System.out.println(String.format("Titular: %s",this.titular));
		System.out.println(String.format("Agencia: %s",this.agencia));
		System.out.println(String.format("Numero: %s",this.numero));
		System.out.println(String.format("Saldo: %s",this.saldo));
	}
}
