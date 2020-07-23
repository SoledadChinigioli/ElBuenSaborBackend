package com.example.demo.entity;


import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Cliente extends EntidadGenerica implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "apellido")
	private String apellido;
	
	@Column(name = "telefono")
	private int telefono;
	
	@Column(name = "email")
	private String email;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="domicilio_id")
	private Domicilio domicilio;



	//Constructores
	
	public Cliente() {
		super();
	}



	public Cliente(String nombre, String apellido, int telefono, String email, Domicilio domicilio) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.email = email;
		this.domicilio = domicilio;
	}

	//Getter&Setters

	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public int getTelefono() {
		return telefono;
	}



	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public Domicilio getDomicilio() {
		return domicilio;
	}



	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}
	
		
	
	
	

}
