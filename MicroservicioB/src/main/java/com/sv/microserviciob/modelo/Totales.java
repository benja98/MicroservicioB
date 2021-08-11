package com.sv.microserviciob.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "totales")
public class Totales implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
    @Column(name="id")
    private int id;
	
	@Column(name="impaga")
	private String impaga;
	    
    @Column(name="fechapago")
    private String fechaPago;
    
    @Column(name="formapago")
    private String formaPago;
	
    @Column(name="subtotal")
    private Double subTotal;
    
    @Column(name="subtotaliva")
    private Double subtoTaliva;
    
    @Column(name="subtotalcesc")
    private Double subTotalcesc;
    
    @Column(name="subtotaldescuentos")
    private Double subTotaldescuentos;
    
    @Column(name="totalapagar")
    private Double totalaPagar;

	public Totales(int id, String impaga, String fechaPago, String formaPago, Double subTotal, Double subtoTaliva,
			Double subTotalcesc, Double subTotaldescuentos, Double totalaPagar) {
		super();
		this.id = id;
		this.impaga = impaga;
		this.fechaPago = fechaPago;
		this.formaPago = formaPago;
		this.subTotal = subTotal;
		this.subtoTaliva = subtoTaliva;
		this.subTotalcesc = subTotalcesc;
		this.subTotaldescuentos = subTotaldescuentos;
		this.totalaPagar = totalaPagar;
	}

	public Totales() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getImpaga() {
		return impaga;
	}

	public void setImpaga(String impaga) {
		this.impaga = impaga;
	}

	public String getFechaPago() {
		return fechaPago;
	}

	public void setFechaPago(String fechaPago) {
		this.fechaPago = fechaPago;
	}

	public String getFormaPago() {
		return formaPago;
	}

	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}

	public Double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}

	public Double getSubtoTaliva() {
		return subtoTaliva;
	}

	public void setSubtoTaliva(Double subtoTaliva) {
		this.subtoTaliva = subtoTaliva;
	}

	public Double getSubTotalcesc() {
		return subTotalcesc;
	}

	public void setSubTotalcesc(Double subTotalcesc) {
		this.subTotalcesc = subTotalcesc;
	}

	public Double getSubTotaldescuentos() {
		return subTotaldescuentos;
	}

	public void setSubTotaldescuentos(Double subTotaldescuentos) {
		this.subTotaldescuentos = subTotaldescuentos;
	}

	public Double getTotalaPagar() {
		return totalaPagar;
	}

	public void setTotalaPagar(Double totalaPagar) {
		this.totalaPagar = totalaPagar;
	}

	
}
