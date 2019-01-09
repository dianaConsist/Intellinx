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
import com.intellinx.bom.annotations.PrimaryDisplayField;
import com.intellinx.bom.annotations.Editable;


@Editable
@PrimaryDisplayField("descripcion")
@Reportable
@Entity(name = "EstadoBE")
@Table(name = "ESTADO_BE")
@DisplayName(name = "EstadoBE")
@EntityType(EntityTypeDescriptor.BUSINESS_ENTITY)
@SortingOrder

public class EstadoBE extends com.intellinx.bom.BaseBOMEntityWithSurrogate  {

	private static final long serialVersionUID = 1L;
	@NaturalId
	@DisplayName(name = "codigoEstado")
	@Column(unique = false, name = "CODIGO_ESTADO", length = 255)
	private String codigoEstado;
	@DisplayName(name = "descripcion")
	@Column(name = "DESCRIPCION", length = 255)
	private String descripcion;
	@DisplayName(name = "descripcionAbreviada")
	@Column(name = "DESCRIPCION_ABREVIADA", length = 255)
	private String descripcionAbreviada;

	public String getCodigoEstado() {
		return codigoEstado;
	}

	public void setCodigoEstado(String codigoEstado) {
		this.codigoEstado = codigoEstado;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcionAbreviada() {
		return descripcionAbreviada;
	}

	public void setDescripcionAbreviada(String descripcionAbreviada) {
		this.descripcionAbreviada = descripcionAbreviada;
	}

}
