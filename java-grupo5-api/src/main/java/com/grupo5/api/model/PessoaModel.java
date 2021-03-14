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
@Table(name = "pessoas")
public class PessoaModel implements Serializable{
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="pessoa_id")
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPessoa;
	
	@Column(name="pessoa_nome")
	private String nomePessoa;
	
	@Column(name="pessoa_sobrenome")
	private String sobrenomePessoa;
	
	@OneToMany(mappedBy = "idPessoaEvento")
	private Set<PessoaEventoModel> idPessoaEvento;
	

	public PessoaModel() {};
	
	public PessoaModel(int idPessoa, String nomePessoa, String sobrenomePessoa) {
		super();
		this.idPessoa = idPessoa;
		this.nomePessoa = nomePessoa;
		this.sobrenomePessoa = sobrenomePessoa;
	}
	
}


