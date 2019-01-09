package com.inbursa.model.alerts;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import com.intellinx.bom.annotations.DisplayName;
import com.intellinx.bom.annotations.EntityType;
import com.intellinx.bom.annotations.EntityTypeDescriptor;
import com.intellinx.bom.entity.Alert;
import javax.persistence.Column;
import java.util.Date;
import javax.persistence.TemporalType;
import javax.persistence.Temporal;
import com.inbursa.model.be.Cuenta;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;


@Entity(name = "Alert006_MovCargo01")
@DiscriminatorValue("Alert006_MovCargo01")
@DisplayName(name = "alert006_MovCargo01")
@EntityType(EntityTypeDescriptor.APPLICATIVE)

public class Alert006_MovCargo01 extends Alert {

	private static final long serialVersionUID = 1L;
	@DisplayName(name = "idTransaccion")
	@Column(name = "ID_TRANSACCION", length = 255)
	private String idTransaccion;
	@DisplayName(name = "fecha")
	@Column(name = "FECHA")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;
	@DisplayName(name = "idPersona")
	@Column(name = "ID_PERSONA", length = 255)
	private String idPersona;
	@DisplayName(name = "cliente")
	@Column(name = "CLIENTE", length = 255)
	private String cliente;
	@DisplayName(name = "Cuenta")
	@JoinColumn(name = "CUENTA_FK")
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	private Cuenta cuenta;
	@DisplayName(name = "descripcion")
	@Column(name = "DESCRIPCION", length = 255)
	private String descripcion;
	@DisplayName(name = "monto")
	@Column(name = "MONTO", length = 255)
	private String monto;
	@DisplayName(name = "descripcion1")
	@Column(name = "DESCRIPCION1", length = 255)
	private String descripcion1;

	public String getIdTransaccion() {
		return idTransaccion;
	}

	public void setIdTransaccion(String idTransaccion) {
		this.idTransaccion = idTransaccion;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(String idPersona) {
		this.idPersona = idPersona;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getMonto() {
		return monto;
	}

	public void setMonto(String monto) {
		this.monto = monto;
	}

	public String getDescripcion1() {
		return descripcion1;
	}

	public void setDescripcion1(String descripcion1) {
		this.descripcion1 = descripcion1;
	}

}
