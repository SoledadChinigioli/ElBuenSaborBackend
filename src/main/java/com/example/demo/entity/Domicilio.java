package com.example.demo.entity;


import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Domicilio extends EntidadGenerica implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String calle;
	
	private int numero;
	
	private String localidad;
	
	private String departamento;
	

	public Domicilio() {
		super();
	}


	public Domicilio(String calle, int numero, String localidad, String departamento) {
		super();
		this.calle = calle;
		this.numero = numero;
		this.localidad = localidad;
		this.departamento = departamento;
	}


	public String getCalle() {
		return calle;
	}


	public void setCalle(String calle) {
		this.calle = calle;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getLocalidad() {
		return localidad;
	}


	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}


	public String getDepartamento() {
		return departamento;
	}


	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	
	

}
