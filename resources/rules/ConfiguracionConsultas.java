package rules;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import com.intellinx.bom.annotations.DisplayName;
import com.intellinx.bom.annotations.EntityType;
import com.intellinx.bom.annotations.EntityTypeDescriptor;
import com.intellinx.rules.model.RuleConfiguration;
import javax.persistence.Column;
import com.intellinx.bom.annotations.Dropdown;
import com.intellinx.bom.annotations.SimpleValueList;
import com.intellinx.bom.annotations.ListItem;


@Entity(name = "ConfiguracionConsultas")
@DiscriminatorValue("ConfiguracionConsultas")
@DisplayName(name = "Configuracion Consultas")
@EntityType(EntityTypeDescriptor.APPLICATIVE)

public class ConfiguracionConsultas extends RuleConfiguration {

	private static final long serialVersionUID = 1L;
	@SimpleValueList(elements = {
			@ListItem(value = "Todas", display = "Todas"),
			@ListItem(value = "MulBuscar", display = "MulBuscar"),
			@ListItem(value = "MulBuscarRegistro", display = "MulBuscarRegistro") }, name = "uRLValues")
	@Dropdown(maxListSize = 20, valuesList = "uRLValues")
	@DisplayName(name = "URL")
	@Column(name = "U_RL", length = 255)
	private String uRL;

	public String getuRL() {
		return uRL;
	}

	public void setuRL(String uRL) {
		this.uRL = uRL;
	}

}
