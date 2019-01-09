package rules;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import com.intellinx.bom.annotations.DisplayName;
import com.intellinx.bom.annotations.EntityType;
import com.intellinx.bom.annotations.EntityTypeDescriptor;
import com.intellinx.rules.model.RuleConfiguration;
import javax.persistence.Column;
import com.inbursa.model.activelists.ListaVIP;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import com.inbursa.model.activelists.ListaVIP1_2;


@Entity(name = "ConfiguracionListaVIP")
@DiscriminatorValue("ConfiguracionListaVIP")
@DisplayName(name = "Configuracion Lista VIP")
@EntityType(EntityTypeDescriptor.APPLICATIVE)

public class ConfiguracionListaVIP extends RuleConfiguration {

	private static final long serialVersionUID = 1L;
	@DisplayName(name = "Lista V I P1_2")
	@JoinColumn(name = "LISTA_VIP1_2_FK")
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	private ListaVIP1_2 listaVIP1_2;

	public ListaVIP1_2 getListaVIP1_2() {
		return listaVIP1_2;
	}

	public void setListaVIP1_2(ListaVIP1_2 listaVIP1_2) {
		this.listaVIP1_2 = listaVIP1_2;
	}

}
