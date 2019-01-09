package com.inbursa.model.be;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import com.intellinx.bom.annotations.DisplayName;
import com.intellinx.bom.annotations.EntityType;
import com.intellinx.bom.annotations.EntityTypeDescriptor;
import com.intellinx.bom.entity.BasicIncident;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import java.util.Date;
import javax.persistence.TemporalType;
import javax.persistence.Temporal;


@Entity(name = "ConsultaVIP_bitac")
@DiscriminatorValue("ConsultaVIP_bitac")
@DisplayName(name = "ConsultaVIP_bitac")
@EntityType(EntityTypeDescriptor.APPLICATIVE)

public class ConsultaVIP_bitac extends BasicIncident {

	private static final long serialVersionUID = 1L;
	@DisplayName(name = "ip")
	@Column(name = "IP", length = 255)
	private String ip;
	@DisplayName(name = "Cuenta")
	@JoinColumn(name = "CUENTA_FK")
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	private Cuenta cuenta;
	@DisplayName(name = "url")
	@Column(name = "URL", length = 255)
	private String url;
	@DisplayName(name = "User BE")
	@JoinColumn(name = "USER_BE_FK")
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	private UserBE userBE;
	@DisplayName(name = "sucursal")
	@JoinColumn(name = "SUCURSAL_FK")
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	private SucursalBE sucursal;
	@DisplayName(name = "nombreAplicacion")
	@Column(name = "NOMBRE_APLICACION", length = 255)
	private String nombreAplicacion;
	@DisplayName(name = "fecha")
	@Column(name = "FECHA")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;
	@DisplayName(name = "descripcion")
	@Column(name = "DESCRIPCION", length = 255)
	private String descripcion;
	@DisplayName(name = "idBitacora")
	@Column(name = "ID_BITACORA", length = 255)
	private String idBitacora;

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public SucursalBE getSucursal() {
		return sucursal;
	}

	public void setSucursal(SucursalBE sucursal) {
		this.sucursal = sucursal;
	}

	public String getNombreAplicacion() {
		return nombreAplicacion;
	}

	public void setNombreAplicacion(String nombreAplicacion) {
		this.nombreAplicacion = nombreAplicacion;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getIdBitacora() {
		return idBitacora;
	}

	public void setIdBitacora(String idBitacora) {
		this.idBitacora = idBitacora;
	}

	public UserBE getUserBE() {
		return userBE;
	}

	public void setUserBE(UserBE userBE) {
		this.userBE = userBE;
	}

}
