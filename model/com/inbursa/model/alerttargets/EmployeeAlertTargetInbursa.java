package com.inbursa.model.alerttargets;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import com.intellinx.bom.annotations.Description;
import com.intellinx.bom.annotations.DisplayName;
import com.intellinx.bom.annotations.EntityType;
import com.intellinx.bom.annotations.EntityTypeDescriptor;
import com.intellinx.bom.entity.AlertTarget;
import com.inbursa.model.be.UserBE;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;


@Entity(name = "EmployeeAlertTargetInbursa")
@DiscriminatorValue("EmployeeAlertTargetInbursa")
@DisplayName(name = "Employee Alert Target Inbursa")
@EntityType(EntityTypeDescriptor.APPLICATIVE)
@Description("Employee Alert Target Inbursa")
public class EmployeeAlertTargetInbursa extends AlertTarget  {

	private static final long serialVersionUID = 1L;
	@Description("UserBEInbursa")
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
