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
import com.inbursa.model.be.Cuenta;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import java.util.Date;
import javax.persistence.TemporalType;
import javax.persistence.Temporal;
import com.inbursa.model.be.UserBE;
import com.inbursa.model.be.SucursalBE;
import org.hibernate.annotations.NaturalId;
import com.intellinx.bom.annotations.DisplayFormat;


@Reportable
@Entity(name = "ConsultaMulCuentaBitaFact")
@Table(name = "CONSULTA_MUL_CUENTA_BITA_FACT")
@DisplayName(name = "ConsultaMulCuentaBitaFact")
@EntityType(EntityTypeDescriptor.FACT)
@SortingOrder

public class ConsultaMulCuentaBitaFact extends com.intellinx.bom.entity.BaseFact  {

	private static final long serialVersionUID = 1L;
	@NaturalId
	@DisplayName(name = "idBitacora")
	@Column(name = "ID_BITACORA", length = 255)
	private String idBitacora;
	@DisplayName(name = "descripcion")
	@Column(name = "DESCRIPCION", length = 255)
	private String descripcion;
	@DisplayName(name = "nombreCampo")
	@Column(name = "NOMBRE_CAMPO", length = 255)
	private String nombreCampo;
	@DisplayName(name = "cuenta")
	@JoinColumn(name = "CUENTA_FK")
	@ManyToOne(cascade = { javax.persistence.CascadeType.ALL }, fetch = FetchType.LAZY, optional = true)
	private Cuenta cuenta;
	@DisplayFormat(format = "MMM/dd/yyyy hh:mm:ss")
	@DisplayName(name = "fecha")
	@Column(name = "FECHA")
	@Temporal(TemporalType.DATE)
	private Date fecha;
	@DisplayName(name = "User BE")
	@JoinColumn(name = "USER_BE_FK")
	@ManyToOne(cascade = { javax.persistence.CascadeType.ALL }, fetch = FetchType.LAZY, optional = true)
	private UserBE userBE;
	@DisplayName(name = "ip")
	@Column(name = "IP", length = 255)
	private String ip;
	@DisplayName(name = "nombreAplicacion")
	@Column(name = "NOMBRE_APLICACION", length = 255)
	private String nombreAplicacion;
	@DisplayName(name = "sucursal")
	@JoinColumn(name = "SUCURSAL_FK")
	@ManyToOne(cascade = { javax.persistence.CascadeType.ALL }, fetch = FetchType.LAZY, optional = true)
	private SucursalBE sucursal;
	public String getIdBitacora() {
		return idBitacora;
	}

	public void setIdBitacora(String idBitacora) {
		this.idBitacora = idBitacora;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombreCampo() {
		return nombreCampo;
	}

	public void setNombreCampo(String nombreCampo) {
		this.nombreCampo = nombreCampo;
	}

	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
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

	public UserBE getUserBE() {
		return userBE;
	}

	public void setUserBE(UserBE userBE) {
		this.userBE = userBE;
	}

}
