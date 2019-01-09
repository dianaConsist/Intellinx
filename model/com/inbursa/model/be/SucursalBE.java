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
import org.hibernate.annotations.NaturalId;


@Reportable
@Entity(name = "SucursalBE")
@Table(name = "SUCURSAL_BE")
@DisplayName(name = "SucursalBE")
@EntityType(EntityTypeDescriptor.BUSINESS_ENTITY)
@SortingOrder

public class SucursalBE extends com.intellinx.bom.BaseBOMEntityWithSurrogate  {

	private static final long serialVersionUID = 1L;
	@DisplayName(name = "nombreSucursal")
	@Column(name = "NOMBRE_SUCURSAL", length = 255)
	private String nombreSucursal;
	@NaturalId
	@DisplayName(name = "idOficina")
	@Column(name = "ID_OFICINA", length = 255)
	private String idOficina;
	@DisplayName(name = "estadoBE")
	@JoinColumn(name = "ESTADO_BE_FK")
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	private EstadoBE estadoBE;
	public String getNombreSucursal() {
		return nombreSucursal;
	}

	public void setNombreSucursal(String nombreSucursal) {
		this.nombreSucursal = nombreSucursal;
	}

	public String getIdOficina() {
		return idOficina;
	}

	public void setIdOficina(String idOficina) {
		this.idOficina = idOficina;
	}

	public EstadoBE getEstadoBE() {
		return estadoBE;
	}

	public void setEstadoBE(EstadoBE estadoBE) {
		this.estadoBE = estadoBE;
	}

}
