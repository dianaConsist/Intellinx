package com.inbursa.model.alerts;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import com.intellinx.bom.annotations.DisplayName;
import com.intellinx.bom.annotations.EntityType;
import com.intellinx.bom.annotations.EntityTypeDescriptor;
import com.intellinx.bom.entity.Alert;
import com.inbursa.model.be.Cuenta;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import com.inbursa.model.be.UserBE;
import javax.persistence.Column;
import java.util.Date;
import javax.persistence.TemporalType;
import javax.persistence.Temporal;
import com.inbursa.model.be.SucursalBE;


@Entity(name = "AlertaConsultaVIP_bitac")
@DiscriminatorValue("AlertaConsultaVIP_bitac")
@DisplayName(name = "AlertaConsultaVIP_bitac")
@EntityType(EntityTypeDescriptor.APPLICATIVE)

public class AlertaConsultaVIP_bitac extends Alert {

	private static final long serialVersionUID = 1L;
	@DisplayName(name = "Cuenta")
	@JoinColumn(name = "CUENTA_FK")
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	private Cuenta cuenta;
	@DisplayName(name = "descripcion")
	@Column(name = "DESCRIPCION", length = 255)
	private String descripcion;
	@DisplayName(name = "fecha")
	@Column(name = "FECHA")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;
	@DisplayName(name = "idBitacora")
	@Column(name = "ID_BITACORA", length = 255)
	private String idBitacora;
	@DisplayName(name = "ip")
	@Column(name = "IP", length = 255)
	private String ip;
	@DisplayName(name = "nombreAplicacion")
	@Column(name = "NOMBRE_APLICACION", length = 255)
	private String nombreAplicacion;
	@DisplayName(name = "sucursal")
	@JoinColumn(name = "SUCURSAL_FK")
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	private SucursalBE sucursal;
	@DisplayName(name = "url")
	@Column(name = "URL", length = 255)
	private String url;
	@DisplayName(name = "User BE")
	@JoinColumn(name = "USER_BE_FK")
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	private UserBE userBE;
	@DisplayName(name = "incidentTimestamp")
	@Column(name = "INCIDENT_TIMESTAMP")
	@Temporal(TemporalType.TIMESTAMP)
	private Date incidentTimestamp;
	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getIdBitacora() {
		return idBitacora;
	}

	public void setIdBitacora(String idBitacora) {
		this.idBitacora = idBitacora;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getNombreAplicacion() {
		return nombreAplicacion;
	}

	public void setNombreAplicacion(String nombreAplicacion) {
		this.nombreAplicacion = nombreAplicacion;
	}

	public SucursalBE getSucursal() {
		return sucursal;
	}

	public void setSucursal(SucursalBE sucursal) {
		this.sucursal = sucursal;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public UserBE getUserBE() {
		return userBE;
	}

	public void setUserBE(UserBE userBE) {
		this.userBE = userBE;
	}

	public Date getIncidentTimestamp() {
		return incidentTimestamp;
	}

	public void setIncidentTimestamp(Date incidentTimestamp) {
		this.incidentTimestamp = incidentTimestamp;
	}

}
