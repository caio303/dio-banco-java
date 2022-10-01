package program;

import enums.TipoPessoa;
import models.Banco;
import models.Cliente;
import models.Conta;
import models.ContaCorrente;
import models.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		Cliente caio = new Cliente("Caio", TipoPessoa.PESSOA_FISICA);
		
		Conta cc = new ContaCorrente(caio);
		Conta cp = new ContaPoupanca(caio);
		cc.depositar(100);
		cc.transferir(50, cp);
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		
		Cliente stella = new Cliente("Stella", TipoPessoa.PESSOA_JURIDICA);
		Conta cc2 = new ContaCorrente(stella);
		Conta cp2 = new ContaPoupanca(stella);
		cp2.depositar(200);
		cp2.transferir(75, cc2);
		
		Banco bb = new Banco("Banco do Brasil");
		bb.adicionarContas(cc, cp, cc2, cp2);
		System.out.println(bb.listarClientes());
		bb.imprimirMetricas();
		
	}

}
