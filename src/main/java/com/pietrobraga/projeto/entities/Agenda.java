package com.pietrobraga.projeto.entities;

import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "tb_agenda")
public class Agenda {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String titulo;
	private String descricao;
	
	@CreationTimestamp
	private Instant dataCriacao;
	@UpdateTimestamp
	private Instant dataAlteracao;
	
	private Instant dataFim;
	
	public Agenda() {
		super();
	}
	
	public Agenda(Long id, String titulo, String descricao, Instant dataCriacao, Instant dataAlteracao, Instant dataFim) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.dataCriacao = dataCriacao;
		this.dataAlteracao = dataAlteracao;
		this.dataFim = dataFim;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Instant getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Instant dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Instant getDataAlteracao() {
		return dataAlteracao;
	}

	public void setDataAlteracao(Instant dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}

	public Instant getDataFim() {
		return dataFim;
	}

	public void setDataFim(Instant dataFim) {
		this.dataFim = dataFim;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agenda other = (Agenda) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
