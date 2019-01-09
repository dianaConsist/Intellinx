package com.inbursa.model.activelists;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import com.intellinx.bom.annotations.Description;
import com.intellinx.bom.annotations.DisplayName;
import com.intellinx.bom.annotations.EntityType;
import com.intellinx.bom.annotations.EntityTypeDescriptor;
import com.intellinx.bom.entity.ActiveList;
import com.inbursa.model.be.Cuenta;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.validation.constraints.NotNull;
import org.hibernate.annotations.NaturalId;


@Entity(name = "ListaVIP1_2")
@DiscriminatorValue("ListaVIP1_2")
@DisplayName(name = "Lista VIP 1_2")
@EntityType(EntityTypeDescriptor.APPLICATIVE)
@Description("Se excluyen cuentas solicitadas por RAVILA.")
public class ListaVIP1_2 extends com.intellinx.bom.entity.ActiveList {

	private static final long serialVersionUID = 1L;
	@DisplayName(name = "Cuenta")
	@JoinColumn(unique = false, name = "CUENTA_FK")
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	private Cuenta cuenta;

	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

}
