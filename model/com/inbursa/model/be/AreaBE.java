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


@PrimaryDisplayField("area")
@Reportable
@Entity(name = "AreaBE")
@Table(name = "AREA_BE")
@DisplayName(name = "AreaBE")
@EntityType(EntityTypeDescriptor.BUSINESS_ENTITY)
@SortingOrder

public class AreaBE extends com.intellinx.bom.BaseBOMEntityWithSurrogate  {

	private static final long serialVersionUID = 1L;
	@NaturalId
	@DisplayName(name = "area")
	@Column(name = "AREA", length = 255)
	private String area;
	@DisplayName(name = "idArea")
	@Column(name = "ID_AREA", length = 255)
	private String idArea;

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getIdArea() {
		return idArea;
	}

	public void setIdArea(String idArea) {
		this.idArea = idArea;
	}

}
