package br.edu.desagil.delivery;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Estabelecimento {
	
	private String nome;
	
	private Map<Integer,Item> itens;

	public Estabelecimento(String nome) {
		this.nome = nome;
		this.itens= new HashMap<>();
	}
	
	public void cadastra(Integer codigo,Item item) {
		
		this.itens.put(codigo, item);
		
	}
	
	public double processa(List<Integer>codigos) {
		double preco=0;
		for(int codigo:codigos) {
			preco+=this.itens.get(codigos).getPreco();
		}
		return preco;
	}
	
	
}
