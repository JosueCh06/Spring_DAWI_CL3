package com.cl3.programador.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tb_proyecto")
public class Proyecto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cod_proyecto")
	private Integer codProyecto;
	
	@Column(name="nom_proyecto")
	private String nomProyecto;
	
	@JsonIgnore
	@OneToMany(mappedBy = "proyecto")
	private List<Programador> listaProgramadores;

	public Integer getCodProyecto() {
		return codProyecto;
	}

	public void setCodProyecto(Integer codProyecto) {
		this.codProyecto = codProyecto;
	}

	public String getNomProyecto() {
		return nomProyecto;
	}

	public void setNomProyecto(String nomProyecto) {
		this.nomProyecto = nomProyecto;
	}

	public List<Programador> getListaProgramadores() {
		return listaProgramadores;
	}

	public void setListaProgramadores(List<Programador> listaProgramadores) {
		this.listaProgramadores = listaProgramadores;
	}
}
