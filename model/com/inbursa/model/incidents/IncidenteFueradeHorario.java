package com.inbursa.model.incidents;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import com.intellinx.bom.annotations.Description;
import com.intellinx.bom.annotations.DisplayName;
import com.intellinx.bom.annotations.EntityType;
import com.intellinx.bom.annotations.EntityTypeDescriptor;
import com.intellinx.bom.entity.BasicIncident;
import javax.persistence.Column;
import java.lang.String;
import java.lang.Integer;
import javax.persistence.ManyToOne;
import javax.persistence.CascadeType;
import com.inbursa.model.be.UsuarioBE;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;


@Entity(name = "IncidenteFueradeHorario")
@DiscriminatorValue("IncidenteFueradeHorario")
@DisplayName(name = "IncidenteFueradeHorario")
@EntityType(EntityTypeDescriptor.APPLICATIVE)
@Description("Incidente fuera de Horario")
public class IncidenteFueradeHorario extends BasicIncident {

	private static final long serialVersionUID = 1L;
	@DisplayName(name = "Clien IP")
	@Column(name = "CLIEN_IP", length = 255)
	private String clienIP;
	@DisplayName(name = "hora")
	@Column(name = "HORA")
	private Integer hora;
	@DisplayName(name = "UsuarioAsignado")
	@Column(name = "USUARIO_ASIGNADO", length = 255)
	private String usuarioAsignado;
	@DisplayName(name = "usuarioBE")
	@JoinColumn(name = "USUARIO_BE_FK")
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = true)
	private UsuarioBE usuarioBE;

	public String getClienIP() {
		return clienIP;
	}

	public void setClienIP(String clienIP) {
		this.clienIP = clienIP;
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

	public UsuarioBE getUsuarioBE() {
		return usuarioBE;
	}

	public void setUsuarioBE(UsuarioBE usuarioBE) {
		this.usuarioBE = usuarioBE;
	}

}
