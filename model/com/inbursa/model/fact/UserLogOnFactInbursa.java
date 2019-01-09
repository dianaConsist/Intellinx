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
import javax.persistence.Column;
import com.inbursa.model.be.UserBE;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import org.hibernate.annotations.NaturalId;


@Reportable
@Entity(name = "UserLogOnFactInbursa")
@Table(name = "USER_LOG_ON_FACT_INBURSA")
@DisplayName(name = "UserLogOnFactInbursa")
@EntityType(EntityTypeDescriptor.FACT)
@SortingOrder()
@Description("Esto es el Usuario Log-On Fact Inbursa")
public class UserLogOnFactInbursa extends com.intellinx.bom.entity.BaseSessionFact  {

	private static final long serialVersionUID = 1L;
	@Description("UserBE Inbursa")
	@DisplayName(name = "UserBE")
	@JoinColumn(name = "USER_BE_FK")
	@ManyToOne(cascade = { javax.persistence.CascadeType.ALL }, fetch = FetchType.LAZY, optional = true)
	private UserBE userBE;
	@Description("Client IP")
	@DisplayName(name = "Client IP")
	@Column(name = "CLIENT_IP", length = 255)
	private String clientIP;
	@Description("Data Source ")
	@DisplayName(name = "Data Source ")
	@Column(name = "DATA_SOURCE", length = 255)
	private String dataSource;
	@NaturalId
	@Description("idTransaccion")
	@DisplayName(name = "idTransaccion")
	@Column(name = "ID_TRANSACCION", length = 255)
	private String idTransaccion;

	public UserBE getUserBE() {
		return userBE;
	}

	public void setUserBE(UserBE userBE) {
		this.userBE = userBE;
	}

	public String getClientIP() {
		return clientIP;
	}

	public void setClientIP(String clientIP) {
		this.clientIP = clientIP;
	}

	public String getDataSource() {
		return dataSource;
	}

	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}

	public String getIdTransaccion() {
		return idTransaccion;
	}

	public void setIdTransaccion(String idTransaccion) {
		this.idTransaccion = idTransaccion;
	}

}
