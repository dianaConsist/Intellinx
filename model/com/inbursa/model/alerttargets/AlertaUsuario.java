package com.inbursa.model.alerttargets;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import com.intellinx.bom.annotations.DisplayName;
import com.intellinx.bom.annotations.EntityType;
import com.intellinx.bom.annotations.EntityTypeDescriptor;
import com.intellinx.bom.entity.Alert;
import javax.persistence.ManyToOne;
import javax.persistence.CascadeType;
import com.inbursa.model.be.UsuarioBE;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;


@Entity(name = "AlertaUsuario")
@DiscriminatorValue("AlertaUsuario")
@DisplayName(name = "AlertaUsuario")
@EntityType(EntityTypeDescriptor.APPLICATIVE)

public class AlertaUsuario extends Alert {

	private static final long serialVersionUID = 1L;
	@DisplayName(name = "usuarioBE")
	@JoinColumn(name = "USUARIO_BE_FK")
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = true)
	private UsuarioBE usuarioBE;

	public UsuarioBE getUsuarioBE() {
		return usuarioBE;
	}

	public void setUsuarioBE(UsuarioBE usuarioBE) {
		this.usuarioBE = usuarioBE;
	}

}
