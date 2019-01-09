package com.inbursa.model.alerts;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import com.intellinx.bom.annotations.DisplayName;
import com.intellinx.bom.annotations.EntityType;
import com.intellinx.bom.annotations.EntityTypeDescriptor;
import com.intellinx.bom.entity.Alert;
import com.inbursa.model.be.UserBE;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import com.inbursa.model.be.Cuenta;
import java.util.Date;
import javax.persistence.TemporalType;
import javax.persistence.Temporal;
import javax.persistence.Column;


@Entity(name = "AlertaConsultaCuentas")
@DiscriminatorValue("AlertaConsultaCuentas")
@DisplayName(name = "Alerta Consulta Cuentas")
@EntityType(EntityTypeDescriptor.APPLICATIVE)

public class AlertaConsultaCuentas extends Alert {

	private static final long serialVersionUID = 1L;
	@DisplayName(name = "User BE")
	@JoinColumn(name = "USER_BE_FK")
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	private UserBE userBE;
	@DisplayName(name = "Cuenta")
	@JoinColumn(name = "CUENTA_FK")
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	private Cuenta cuenta;
	@DisplayName(name = "incidentTimestamp")
	@Column(name = "INCIDENT_TIMESTAMP")
	@Temporal(TemporalType.TIMESTAMP)
	private Date incidentTimestamp;

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

	public Date getIncidentTimestamp() {
		return incidentTimestamp;
	}

	public void setIncidentTimestamp(Date incidentTimestamp) {
		this.incidentTimestamp = incidentTimestamp;
	}

}
