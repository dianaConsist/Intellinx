package com.inbursa.model.activelists;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import com.intellinx.bom.annotations.DisplayName;
import com.intellinx.bom.annotations.EntityType;
import com.intellinx.bom.annotations.EntityTypeDescriptor;
import com.intellinx.bom.entity.ActiveList;
import com.inbursa.model.be.Cuenta;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;


@Entity(name = "ListaNegraActiva")
@DiscriminatorValue("ListaNegraActiva")
@DisplayName(name = "Lista Negra Activa")
@EntityType(EntityTypeDescriptor.APPLICATIVE)

public class ListaNegraActiva extends ActiveList {

	private static final long serialVersionUID = 1L;
	@DisplayName(name = "Cuenta")
	@JoinColumn(name = "CUENTA_FK")
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	private Cuenta cuenta;

	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

}
