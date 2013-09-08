package br.edu.ifes.sr.poo2.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Resposta extends Model {
	
	private static final long serialVersionUID = 1L;

	@Column
	private String valor;
	
	@Column
	private Boolean correta;

	public Boolean getCorreta() {
		return correta;
	}

	public void setCorreta(Boolean correta) {
		this.correta = correta;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
}
