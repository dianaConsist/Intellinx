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
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;


@Reportable
@Entity(name = "ClienteBE")
@Table(name = "CLIENTE_BE")
@DisplayName(name = "ClienteBE")
@EntityType(EntityTypeDescriptor.BUSINESS_ENTITY)
@SortingOrder

public class ClienteBE extends BaseBOMEntityWithSurrogate  {

	private static final long serialVersionUID = 1L;
	@DisplayName(name = "idPersona")
	@Column(name = "ID_PERSONA", length = 255)
	private String idPersona;
	@DisplayName(name = "nombrePropio")
	@Column(name = "NOMBRE_PROPIO", length = 255)
	private String nombrePropio;
	@DisplayName(name = "nombrePropio2")
	@Column(name = "NOMBRE_PROPIO2", length = 255)
	private String nombrePropio2;
	@DisplayName(name = "apellidoPaterno")
	@Column(name = "APELLIDO_PATERNO", length = 255)
	private String apellidoPaterno;
	@DisplayName(name = "apellidoMaterno")
	@Column(name = "APELLIDO_MATERNO", length = 255)
	private String apellidoMaterno;
	@DisplayName(name = "estadoBE")
	@JoinColumn(name = "ESTADO_BE_FK")
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	private EstadoBE estadoBE;

	public String getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(String idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombrePropio() {
		return nombrePropio;
	}

	public void setNombrePropio(String nombrePropio) {
		this.nombrePropio = nombrePropio;
	}

	public String getNombrePropio2() {
		return nombrePropio2;
	}

	public void setNombrePropio2(String nombrePropio2) {
		this.nombrePropio2 = nombrePropio2;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public EstadoBE getEstadoBE() {
		return estadoBE;
	}

	public void setEstadoBE(EstadoBE estadoBE) {
		this.estadoBE = estadoBE;
	}

}
