package com.inbursa.model.alerts;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import com.intellinx.bom.annotations.Description;
import com.intellinx.bom.annotations.DisplayName;
import com.intellinx.bom.annotations.EntityType;
import com.intellinx.bom.annotations.EntityTypeDescriptor;
import com.intellinx.bom.entity.Alert;
import com.inbursa.model.be.UserBE;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import com.intellinx.bom.BaseBOMEntityWithSurrogate;


@Entity(name = "EmployeeSuspiciousActivityInbursa")
@DiscriminatorValue("EmployeeSuspiciousActivityInbursa")
@DisplayName(name = "Employee Suspicious Activity Inbursa")
@EntityType(EntityTypeDescriptor.APPLICATIVE)
@Description("Employee Suspicious Activity Inbursa")
public class EmployeeSuspiciousActivityInbursa extends Alert {

	private static final long serialVersionUID = 1L;
	@Description(value = "UserBEInbursa")
	@DisplayName(name = "UserBEInbursa")
	@JoinColumn(name = "USER_BE_FK")
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	private UserBE userBEInbursa;

	public UserBE getUserBEInbursa() {
		return userBEInbursa;
	}

	public void setUserBEInbursa(UserBE userBEInbursa) {
		this.userBEInbursa = userBEInbursa;
	}

}
