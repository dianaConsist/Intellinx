package com.inbursa.model.be;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.intellinx.bom.annotations.Description;
import com.intellinx.bom.annotations.DisplayName;
import com.intellinx.bom.annotations.EntityType;
import com.intellinx.bom.annotations.EntityTypeDescriptor;
import com.intellinx.bom.BaseBOMEntityWithSurrogate;
import com.intellinx.bom.annotations.SortingOrder;
import com.intellinx.bom.annotations.Reportable;
import javax.persistence.Column;


@Reportable
@Entity(name = "UsuarioBE")
@Table(name = "USUARIO_BE")
@DisplayName(name = "UsuarioBE")
@EntityType(EntityTypeDescriptor.BUSINESS_ENTITY)
@SortingOrder
@Description("Este es el usuario que ingreso al sistema por web")
public class UsuarioBE extends BaseBOMEntityWithSurrogate  {

	private static final long serialVersionUID = 1L;
	@DisplayName(name = "UserId")
	@Column(name = "USER_ID", length = 255)
	private String userId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}
