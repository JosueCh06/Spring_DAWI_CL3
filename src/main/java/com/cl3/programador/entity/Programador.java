package com.cl3.programador.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_programador")
public class Programador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_programador")
	private Integer codProgramador;
	
	@Column(name = "nom_programador")
	private String nomProgramador;

	@Column(name = "ape_programador")
	private String apeProgramador;
	
	@Column(name = "dni_programador")
	private int dniProgramador;
	
	@Column(name = "num_hijos")
	private int numHijos;
	
	@Column(name = "sueldo")
	private double pago;
	
	@ManyToOne
	@JoinColumn(name = "cod_proyecto")
	private Proyecto proyecto;

	public Integer getCodProgramador() {
		return codProgramador;
	}

	public void setCodProgramador(Integer codProgramador) {
		this.codProgramador = codProgramador;
	}

	public String getNomProgramador() {
		return nomProgramador;
	}

	public void setNomProgramador(String nomProgramador) {
		this.nomProgramador = nomProgramador;
	}

	public String getApeProgramador() {
		return apeProgramador;
	}

	public void setApeProgramador(String apeProgramador) {
		this.apeProgramador = apeProgramador;
	}

	public int getDniProgramador() {
		return dniProgramador;
	}

	public void setDniProgramador(int dniProgramador) {
		this.dniProgramador = dniProgramador;
	}

	public int getNumHijos() {
		return numHijos;
	}

	public void setNumHijos(int numHijos) {
		this.numHijos = numHijos;
	}

	public double getPago() {
		return pago;
	}

	public void setPago(double pago) {
		this.pago = pago;
	}

	public Proyecto getProyecto() {
		return proyecto;
	}

	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}
}
