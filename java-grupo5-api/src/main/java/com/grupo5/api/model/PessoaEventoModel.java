package com.grupo5.api.model;



import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "pessoas_evento")
public class PessoaEventoModel implements Serializable {
	
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="pessoa_evento_id")
	private int idPessoaEvento;
	
	@ManyToOne
	@JoinColumn(name = "pessoa_id", referencedColumnName = "pessoa_id")
	private PessoaModel idPessoa;

	@ManyToOne
	@JoinColumn(name = "evento_id", referencedColumnName = "evento_id")
	private EventoModel idEvento;
	
	
	
	public PessoaEventoModel() {}

	public PessoaEventoModel(int idPessoaEvento, PessoaModel idPessoa, EventoModel idEvento) {
		super();
		this.idPessoaEvento = idPessoaEvento;
		this.idPessoa = idPessoa;
		this.idEvento = idEvento;
	}


}
