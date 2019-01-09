package com.inbursa.model.fact;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.intellinx.bom.annotations.DisplayName;
import com.intellinx.bom.annotations.EntityType;
import com.intellinx.bom.annotations.EntityTypeDescriptor;
import com.intellinx.bom.entity.BaseFact;
import com.intellinx.bom.annotations.SortingOrder;
import com.intellinx.bom.annotations.Reportable;
import javax.persistence.Column;
import com.inbursa.model.be.UserBE;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import com.inbursa.model.be.Cuenta;


@Reportable
@Entity(name = "InteraccionCuentaFact")
@Table(name = "INTERACCION_CUENTA_FACT")
@DisplayName(name = "InteraccionCuentaFact")
@EntityType(EntityTypeDescriptor.FACT)
@SortingOrder()

public class InteraccionCuentaFact extends com.intellinx.bom.entity.BaseSessionFact  {

	private static final long serialVersionUID = 1L;
	@DisplayName(name = "URL")
	@Column(name = "U_RL", length = 255)
	private String uRL;
	@DisplayName(name = "Client IP")
	@Column(name = "CLIENT_IP", length = 255)
	private String clientIP;
	@DisplayName(name = "User BE")
	@JoinColumn(name = "USER_BE_FK")
	@ManyToOne(cascade = { javax.persistence.CascadeType.ALL }, fetch = FetchType.LAZY, optional = true)
	private UserBE userBE;
	@DisplayName(name = "Cuenta")
	@JoinColumn(name = "CUENTA_FK")
	@ManyToOne(cascade = { javax.persistence.CascadeType.ALL }, fetch = FetchType.LAZY, optional = true)
	private Cuenta cuenta;
	@DisplayName(name = "UsuarioTexto")
	@Column(name = "USUARIO_TEXTO", length = 255)
	private String usuarioTexto;

	public String getuRL() {
		return uRL;
	}

	public void setuRL(String uRL) {
		this.uRL = uRL;
	}

	public String getClientIP() {
		return clientIP;
	}

	public void setClientIP(String clientIP) {
		this.clientIP = clientIP;
	}

	public UserBE getUserBE() {
		return userBE;
	}

	public void setUserBE(UserBE userBE) {
		this.userBE = userBE;
	}

	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

	public String getUsuarioTexto() {
		return usuarioTexto;
	}

	public void setUsuarioTexto(String usuarioTexto) {
		this.usuarioTexto = usuarioTexto;
	}

}
