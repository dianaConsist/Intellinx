package com.inbursa.model.be;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.intellinx.bom.annotations.DisplayName;
import com.intellinx.bom.annotations.EntityType;
import com.intellinx.bom.annotations.EntityTypeDescriptor;
import com.intellinx.bom.BaseBOMEntityWithSurrogate;
import com.intellinx.bom.annotations.SortingOrder;
import com.intellinx.bom.annotations.Reportable;
import javax.persistence.Column;
import org.hibernate.annotations.NaturalId;
import com.intellinx.bom.annotations.LookupKeys;
import com.intellinx.bom.annotations.EntityFields;
import com.intellinx.bom.annotations.PrimaryDisplayField;
import com.intellinx.bom.annotations.Editable;
import com.intellinx.bom.attribute.DrilldownType;
import com.intellinx.bom.annotations.Drilldown;
import com.intellinx.bom.annotations.Workflow;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;


@Drilldown(type = DrilldownType.DETAILS)
@Editable
@PrimaryDisplayField("numeroCuenta")
@Reportable
@Entity(name = "Cuenta")
@Table(name = "CUENTA")
@DisplayName(name = "Cuenta")
@EntityType(EntityTypeDescriptor.BUSINESS_ENTITY)
@SortingOrder

public class Cuenta extends com.intellinx.bom.BaseBOMEntityWithSurrogate  {

	private static final long serialVersionUID = 1L;
	@NaturalId
	@DisplayName(name = "Numero Cuenta")
	@Column(name = "NUMERO_CUENTA", length = 255)
	private String numeroCuenta;
	@DisplayName(name = "Tipo Cuenta")
	@Column(name = "TIPO_CUENTA", length = 255)
	private String tipoCuenta;
	@DisplayName(name = "nombreCuenta")
	@Column(name = "NOMBRE_CUENTA", length = 255)
	private String nombreCuenta;
	@DisplayName(name = "casoCuenta")
	@Column(name = "CASO_CUENTA", length = 255)
	private String casoCuenta;
	@DisplayName(name = "cliente")
	@JoinColumn(name = "CLIENTE_FK")
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	private ClienteBE cliente;

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public String getTipoCuenta() {
		return tipoCuenta;
	}

	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	public String getNombreCuenta() {
		return nombreCuenta;
	}

	public void setNombreCuenta(String nombreCuenta) {
		this.nombreCuenta = nombreCuenta;
	}

	public String getCasoCuenta() {
		return casoCuenta;
	}

	public void setCasoCuenta(String casoCuenta) {
		this.casoCuenta = casoCuenta;
	}

	public ClienteBE getCliente() {
		return cliente;
	}

	public void setCliente(ClienteBE cliente) {
		this.cliente = cliente;
	}

}
