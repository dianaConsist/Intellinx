package com.inbursa.model.incidents;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import com.intellinx.bom.annotations.Description;
import com.intellinx.bom.annotations.DisplayName;
import com.intellinx.bom.annotations.EntityType;
import com.intellinx.bom.annotations.EntityTypeDescriptor;
import com.intellinx.bom.entity.BasicIncident;
import javax.persistence.Column;
import com.inbursa.model.be.Cuenta;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import com.inbursa.model.be.UserBE;


@Entity(name = "ConsultaVIP")
@DiscriminatorValue("ConsultaVIP")
@DisplayName(name = "Consulta VIP")
@EntityType(EntityTypeDescriptor.APPLICATIVE)
@Description("Consulta a cuenta de cliente VIP")
public class ConsultaVIP extends BasicIncident {

	private static final long serialVersionUID = 1L;
	@DisplayName(name = "Clien IP")
	@Column(name = "CLIEN_IP", length = 255)
	private String clienIP;
	@JoinColumn(name = "CUENTA_FK")
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	@DisplayName(name = "Cuenta")
	private Cuenta cuenta;
	@DisplayName(name = "URL")
	@Column(name = "U_RL", length = 255)
	private String uRL;
	@DisplayName(name = "User BE")
	@JoinColumn(name = "USER_BE_FK")
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	private UserBE userBE;

	public String getClienIP() {
		return clienIP;
	}

	public void setClienIP(String clienIP) {
		this.clienIP = clienIP;
	}

	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

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

}
