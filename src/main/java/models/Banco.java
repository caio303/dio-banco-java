package models;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import enums.TipoPessoa;
import lombok.Data;

@Data
public class Banco {

	private String nome;
	private List<Conta> contas;
	
	public Banco(String nome) {
		this.nome = nome;
		this.contas = new ArrayList<>();
	}
	
	public void imprimirMetricas() {
		int contasPessoaFisica = 0;
		int contasPessoaJuridica = 0;
		for(Conta conta : contas) {
			TipoPessoa tipoTitular = conta.getTitular().getTipoPessoa(); 
			if(tipoTitular.equals(TipoPessoa.PESSOA_FISICA))
				contasPessoaFisica++;
			else if (tipoTitular.equals(TipoPessoa.PESSOA_JURIDICA))
				contasPessoaJuridica++;
				
		};
		System.out.println(String.format("Métricas do %s:\nContas de pessoas Físicas cadastradas: %s\nContas de pessoas Jurídicas cadastradas: %s", 
				this.nome,contasPessoaFisica,contasPessoaJuridica));
	}
	
	public Set<Cliente> listarClientes() {
		Set<Cliente> clientes = new HashSet<Cliente>();
		contas.forEach(conta -> clientes.add(conta.titular));
		return clientes;
	}
	
	public void adicionarConta(Conta conta) {
		this.contas.add(conta);
	}
	
	public void adicionarContas(Conta... listaContas) {
		for(Conta conta : listaContas) {
			this.contas.add(conta);
		}
	}
	
}
