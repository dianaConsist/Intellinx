package com.inbursa.model.incidents;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import com.intellinx.bom.annotations.Description;
import com.intellinx.bom.annotations.DisplayName;
import com.intellinx.bom.annotations.EntityType;
import com.intellinx.bom.annotations.EntityTypeDescriptor;
import com.intellinx.bom.entity.BasicIncident;
import com.inbursa.model.be.UserBE;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.Column;


@Entity(name = "AfterHoursLogonInbursa")
@DiscriminatorValue("AfterHoursLogonInbursa")
@DisplayName(name = "After Hours Logon Inbursa")
@EntityType(EntityTypeDescriptor.APPLICATIVE)
@Description("Este es el After Hours Logon Inbursa")
public class AfterHoursLogonInbursa extends BasicIncident {

	private static final long serialVersionUID = 1L;
	@Description("User Inbursa")
	@DisplayName(name = "UserInbursa")
	@JoinColumn(name = "USER_INBURSA_FK")
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	private UserBE userInbursa;
	@Description("IPAddress")
	@DisplayName(name = "IPAddress")
	@Column(name = "I_PADDRESS", length = 255)
	private String iPAddress;
	@Description("DataSource")
	@DisplayName(name = "DataSource")
	@Column(name = "DATA_SOURCE", length = 255)
	private String dataSource;

	public UserBE getUserInbursa() {
		return userInbursa;
	}

	public void setUserInbursa(UserBE userInbursa) {
		this.userInbursa = userInbursa;
	}

	public String getiPAddress() {
		return iPAddress;
	}

	public void setiPAddress(String iPAddress) {
		this.iPAddress = iPAddress;
	}

	public String getDataSource() {
		return dataSource;
	}

	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}

}
