package rules;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import com.intellinx.bom.annotations.DisplayName;
import com.intellinx.bom.annotations.EntityType;
import com.intellinx.bom.annotations.EntityTypeDescriptor;
import com.intellinx.rules.model.RuleConfiguration;
import com.inbursa.model.activelists.ListaNegraActiva;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;


@Entity(name = "ConfiguracionListaNegra")
@DiscriminatorValue("ConfiguracionListaNegra")
@DisplayName(name = "Configuracion Lista Negra")
@EntityType(EntityTypeDescriptor.APPLICATIVE)

public class ConfiguracionListaNegra extends RuleConfiguration {

	private static final long serialVersionUID = 1L;
	@DisplayName(name = "Lista Negra Activa")
	@JoinColumn(name = "LISTA_NEGRA_ACTIVA_FK")
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	private ListaNegraActiva listaNegraActiva;

	public ListaNegraActiva getListaNegraActiva() {
		return listaNegraActiva;
	}

	public void setListaNegraActiva(ListaNegraActiva listaNegraActiva) {
		this.listaNegraActiva = listaNegraActiva;
	}

}
