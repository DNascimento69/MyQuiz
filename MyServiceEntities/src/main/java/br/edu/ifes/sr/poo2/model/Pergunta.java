package br.edu.ifes.sr.poo2.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Pergunta extends Model {
	
	private static final long serialVersionUID = 1L;

	@Column
	private String valor;

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
}
