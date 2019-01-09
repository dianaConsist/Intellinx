package com.inbursa.model.incidents;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import com.intellinx.bom.annotations.DisplayName;
import com.intellinx.bom.annotations.EntityType;
import com.intellinx.bom.annotations.EntityTypeDescriptor;
import com.intellinx.bom.entity.BasicIncident;
import javax.persistence.Column;
import com.inbursa.model.be.UserBE;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import com.inbursa.model.be.Cuenta;


@Entity(name = "ConsultaCuenta")
@DiscriminatorValue("ConsultaCuenta")
@DisplayName(name = "Consulta Cuenta")
@EntityType(EntityTypeDescriptor.APPLICATIVE)

public class ConsultaCuenta extends BasicIncident {

	private static final long serialVersionUID = 1L;
	@DisplayName(name = "URL")
	@Column(name = "U_RL", length = 255)
	private String uRL;
	@DisplayName(name = "User BE")
	@JoinColumn(name = "USER_BE_FK")
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	private UserBE userBE;
	@DisplayName(name = "Cuenta")
	@JoinColumn(name = "CUENTA_FK")
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	private Cuenta cuenta;
	@DisplayName(name = "Client IP")
	@Column(name = "CLIENT_IP", length = 255)
	private String clientIP;

	public String getuRL() {
		return uRL;
	}

	public void setuRL(String uRL) {
		this.uRL = uRL;
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

	public String getClientIP() {
		return clientIP;
	}

	public void setClientIP(String clientIP) {
		this.clientIP = clientIP;
	}

}
