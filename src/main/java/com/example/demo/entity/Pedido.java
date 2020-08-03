/*package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class Pedido extends EntidadGenerica implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Column(name = "N° de Factura")
	private String numFactura;
	
	@Column(name = "Fecha")
	private Date fecha;
	
	@Column(name = "Estado")
	private String estado;
	
	@Column(name = "Hora de Fin")
	private Date horaFin;
	
	@Column(name = "Forma de PAgo")
	private String formaPago;
	
	@Column(name = "N° de Tarjeta")
	private String numTarjeta;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="cliente_id")
	private Cliente cliente;

	
	
	//Constructores
	
	
	public Pedido() {
		super();
	}



	public Pedido(String numFactura, Date fecha, String estado, Date horaFin, String formaPago, String numTarjeta,
			Cliente cliente) {
		super();
		this.numFactura = numFactura;
		this.fecha = fecha;
		this.estado = estado;
		this.horaFin = horaFin;
		this.formaPago = formaPago;
		this.numTarjeta = numTarjeta;
		this.cliente = cliente;
	}

	//Getter&Setters

	public String getNumFactura() {
		return numFactura;
	}



	public void setNumFactura(String numFactura) {
		this.numFactura = numFactura;
	}



	public Date getFecha() {
		return fecha;
	}



	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}



	public String getEstado() {
		return estado;
	}



	public void setEstado(String estado) {
		this.estado = estado;
	}



	public Date getHoraFin() {
		return horaFin;
	}



	public void setHoraFin(Date horaFin) {
		this.horaFin = horaFin;
	}



	public String getFormaPago() {
		return formaPago;
	}



	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}



	public String getNumTarjeta() {
		return numTarjeta;
	}



	public void setNumTarjeta(String numTarjeta) {
		this.numTarjeta = numTarjeta;
	}



	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	

	
	
}*/
