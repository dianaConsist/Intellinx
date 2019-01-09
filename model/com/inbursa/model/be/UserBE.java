package com.inbursa.model.be;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.intellinx.bom.annotations.DisplayName;
import com.intellinx.bom.annotations.EntityType;
import com.intellinx.bom.annotations.EntityTypeDescriptor;
import com.intellinx.bom.BaseBOMEntityWithSurrogate;
import com.intellinx.bom.annotations.SortingOrder;
import com.intellinx.bom.annotations.Reportable;
import javax.persistence.Column;
import org.hibernate.annotations.NaturalId;
import com.intellinx.bom.annotations.Editable;
import com.intellinx.bom.annotations.PrimaryDisplayField;
import com.intellinx.bom.attribute.DrilldownType;
import com.intellinx.bom.annotations.Drilldown;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import com.intellinx.bom.annotations.Dropdown;
import com.intellinx.bom.annotations.SimpleValueList;
import com.intellinx.bom.annotations.ListItem;
import com.intellinx.bom.annotations.OrderField;
import com.intellinx.bom.OrderType;


@Editable
@Drilldown(type = DrilldownType.DETAILS)
@PrimaryDisplayField("nombreEmpleado")
@Reportable
@Entity(name = "UserBE")
@Table(name = "USER_BE")
@DisplayName(name = "UserBE")
@EntityType(EntityTypeDescriptor.BUSINESS_ENTITY)
@SortingOrder({ @OrderField(name = "id", type = OrderType.ASC) })

public class UserBE extends com.intellinx.bom.BaseBOMEntityWithSurrogate  {

	private static final long serialVersionUID = 1L;
	@SimpleValueList(elements = { @ListItem(value = "8AM", display = "8AM") }, name = "userIDValues")
	@Dropdown(maxListSize = 20, valuesList = "userIDValues")
	@NaturalId
	@DisplayName(name = "UserID")
	@Column(name = "USER_ID", length = 255)
	private String userID;
	@DisplayName(name = "Nombre Empleado")
	@Column(name = "NOMBRE_EMPLEADO", length = 255)
	private String nombreEmpleado;
	@DisplayName(name = "Tipo Empleado")
	@Column(name = "TIPO_EMPLEADO", length = 255)
	private String tipoEmpleado;
	@DisplayName(name = "sucursalBE")
	@JoinColumn(name = "SUCURSAL_BE_FK")
	@ManyToOne(cascade = { javax.persistence.CascadeType.ALL }, fetch = FetchType.LAZY, optional = true)
	private SucursalBE sucursalBE;
	@DisplayName(name = "idPersona")
	@Column(name = "ID_PERSONA", length = 255)
	private String idPersona;
	@DisplayName(name = "registro")
	@Column(name = "REGISTRO", length = 255)
	private String registro;
	@JoinColumn(name = "AREA_BE_FK")
	@ManyToOne(cascade = { javax.persistence.CascadeType.ALL }, optional = true, fetch = FetchType.LAZY)
	@DisplayName(name = "areaBE")
	private AreaBE areaBE;
	@DisplayName(name = "puestoBE")
	@JoinColumn(name = "PUESTO_BE_FK")
	@ManyToOne(cascade = { javax.persistence.CascadeType.ALL }, fetch = FetchType.LAZY, optional = true)
	private PuestoBE puestoBE;
	@DisplayName(name = "ctaCheques")
	@Column(name = "CTA_CHEQUES", length = 255)
	private String ctaCheques;
	@DisplayName(name = "ctaVales")
	@Column(name = "CTA_VALES", length = 255)
	private String ctaVales;
	@SimpleValueList(elements = { @ListItem(value = "h1", display = "h1"),
			@ListItem(value = "h2", display = "h2") }, name = "horarioValues")
	@Dropdown(maxListSize = 20, valuesList = "horarioValues")
	@DisplayName(name = "Horario")
	@Column(name = "HORARIO", length = 255)
	private String horario;
	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		if(userID.isEmpty() || userID.equals("") ){
			userID="USR00000";			
		}
		this.userID = userID;
	}

	public String getNombreEmpleado() {
		return nombreEmpleado;
	}

	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}

	public String getTipoEmpleado() {
		return tipoEmpleado;
	}

	public void setTipoEmpleado(String tipoEmpleado) {
		this.tipoEmpleado = tipoEmpleado;
	}

	public SucursalBE getSucursalBE() {
		return sucursalBE;
	}

	public void setSucursalBE(SucursalBE sucursalBE) {
		this.sucursalBE = sucursalBE;
	}

	public String getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(String idPersona) {
		this.idPersona = idPersona;
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public AreaBE getAreaBE() {
		return areaBE;
	}

	public void setAreaBE(AreaBE areaBE) {
		this.areaBE = areaBE;
	}

	public PuestoBE getPuestoBE() {
		return puestoBE;
	}

	public void setPuestoBE(PuestoBE puestoBE) {
		this.puestoBE = puestoBE;
	}

	public String getCtaCheques() {
		return ctaCheques;
	}

	public void setCtaCheques(String ctaCheques) {
		this.ctaCheques = ctaCheques;
	}

	public String getCtaVales() {
		return ctaVales;
	}

	public void setCtaVales(String ctaVales) {
		this.ctaVales = ctaVales;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

}
