package models;

import enums.TipoPessoa;
import lombok.Data;

@Data
public class Cliente {

	private String nome;
	private TipoPessoa tipoPessoa;

	public Cliente(String nome, TipoPessoa tipoPessoa) {
		this.nome = nome;
		this.tipoPessoa = tipoPessoa;
	}
	
	@Override
	public String toString() {return this.nome;}
}
