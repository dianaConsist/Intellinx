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


@PrimaryDisplayField("puesto")
@Reportable
@Entity(name = "PuestoBE")
@Table(name = "PUESTO_BE")
@DisplayName(name = "PuestoBE")
@EntityType(EntityTypeDescriptor.BUSINESS_ENTITY)
@SortingOrder

public class PuestoBE extends com.intellinx.bom.BaseBOMEntityWithSurrogate  {

	private static final long serialVersionUID = 1L;
	@DisplayName(name = "puestoID")
	@Column(name = "PUESTO_ID", length = 255)
	private String puestoID;
	@NaturalId
	@DisplayName(name = "puesto")
	@Column(name = "PUESTO", length = 255)
	private String puesto;

	public String getPuestoID() {
		return puestoID;
	}

	public void setPuestoID(String puestoID) {
		this.puestoID = puestoID;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

}
