package com.inbursa.model.fact;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.intellinx.bom.annotations.Description;
import com.intellinx.bom.annotations.DisplayName;
import com.intellinx.bom.annotations.EntityType;
import com.intellinx.bom.annotations.EntityTypeDescriptor;
import com.intellinx.bom.entity.BaseFact;
import com.intellinx.bom.annotations.SortingOrder;
import com.intellinx.bom.annotations.Reportable;
import com.inbursa.model.be.UsuarioBE;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.Column;


@Reportable
@Entity(name = "FactorFueradeHora")
@Table(name = "FACTOR_FUERADE_HORA")
@DisplayName(name = "FactorFueradeHora")
@EntityType(EntityTypeDescriptor.FACT)
@SortingOrder
@Description("Factor para los usuarios fuera de Horario")
public class FactorFueradeHora extends BaseFact  {

	private static final long serialVersionUID = 1L;
	@DisplayName(name = "usuarioBE")
	@JoinColumn(name = "USUARIO_BE_FK")
	@ManyToOne(cascade = { javax.persistence.CascadeType.ALL }, fetch = FetchType.LAZY, optional = true)
	private UsuarioBE usuarioBE;
	@DisplayName(name = "ClientIp")
	@Column(name = "CLIENT_IP", length = 255)
	private String clientIp;
	@DisplayName(name = "hora")
	@Column(name = "HORA")
	private Integer hora;
	@DisplayName(name = "UsuarioAsignado")
	@Column(name = "USUARIO_ASIGNADO", length = 255)
	private String usuarioAsignado;

	public UsuarioBE getUsuarioBE() {
		return usuarioBE;
	}

	public void setUsuarioBE(UsuarioBE usuarioBE) {
		this.usuarioBE = usuarioBE;
	}

	public String getClientIp() {
		return clientIp;
	}

	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
	}

	public Integer getHora() {
		return hora;
	}

	public void setHora(Integer hora) {
		this.hora = hora;
	}

	public String getUsuarioAsignado() {
		return usuarioAsignado;
	}

	public void setUsuarioAsignado(String usuarioAsignado) {
		this.usuarioAsignado = usuarioAsignado;
	}

}
