package com.grupo5.api.model;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name = "evento")
public class EventoModel implements Serializable {

	@Id
	@Column(name="evento_id")
	private int idEvento;
	
	@Column(name="evento_nome")
	private String nomeEvento;
	
	@Column(name="evento_inscricoes")
	private int inscricoesEvento;
	
	@OneToMany(mappedBy = "idPessoaEvento")
	private Set<PessoaEventoModel> pesssoas_evento;
	
	public EventoModel() {}


	public EventoModel(int idEvento, String nomeEvento, int inscricoesEvento) {
		super();
		this.idEvento = idEvento;
		this.nomeEvento = nomeEvento;
		this.inscricoesEvento = inscricoesEvento;
	};
	
}
