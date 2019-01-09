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
import com.intellinx.bom.annotations.XmlValueList;
import com.intellinx.bom.annotations.ListItem;


@Entity(name = "ConfiguracionHorarioLabora")
@DiscriminatorValue("ConfiguracionHorarioLabora")
@DisplayName(name = "ConfiguracionHorarioLabora")
@EntityType(EntityTypeDescriptor.APPLICATIVE)

public class ConfiguracionHorarioLabora extends RuleConfiguration {

	private static final long serialVersionUID = 1L;
	@XmlValueList(xmlFile = "lists/ListWeekDays.xml", name = "primerDiaValues")
	@Dropdown(maxListSize = 20, valuesList = "primerDiaValues")
	@DisplayName(name = "PrimerDia")
	@Column(name = "PRIMER_DIA", length = 255)
	private String primerDia;
	@XmlValueList(xmlFile = "lists/ListWeekDays.xml", name = "ultimoDiaValues")
	@Dropdown(maxListSize = 20, valuesList = "ultimoDiaValues")
	@DisplayName(name = "UltimoDia")
	@Column(name = "ULTIMO_DIA", length = 255)
	private String ultimoDia;
	@SimpleValueList(elements = { @ListItem(value = "1", display = "1"),
			@ListItem(value = "2", display = "2"),
			@ListItem(value = "3", display = "3"),
			@ListItem(value = "4", display = "4"),
			@ListItem(value = "5", display = "5"),
			@ListItem(value = "6", display = "6"),
			@ListItem(value = "7", display = "7"),
			@ListItem(value = "8", display = "8"),
			@ListItem(value = "9", display = "9"),
			@ListItem(value = "10", display = "10"),
			@ListItem(value = "11", display = "11"),
			@ListItem(value = "12", display = "12"),
			@ListItem(value = "13", display = "13"),
			@ListItem(value = "14", display = "14"),
			@ListItem(value = "15", display = "15"),
			@ListItem(value = "16", display = "16"),
			@ListItem(value = "17", display = "17"),
			@ListItem(value = "18", display = "18"),
			@ListItem(value = "19", display = "19"),
			@ListItem(value = "20", display = "20"),
			@ListItem(value = "21", display = "21"),
			@ListItem(value = "22", display = "22"),
			@ListItem(value = "23", display = "23"),
			@ListItem(value = "24", display = "24") }, name = "horaAperturaValues")
	@Dropdown(maxListSize = 20, valuesList = "horaAperturaValues")
	@DisplayName(name = "HoraApertura")
	@Column(name = "HORA_APERTURA", length = 255)
	private String horaApertura;
	@SimpleValueList(elements = { @ListItem(value = "1", display = "1"),
			@ListItem(value = "2", display = "2"),
			@ListItem(value = "3", display = "3"),
			@ListItem(value = "4", display = "4"),
			@ListItem(value = "5", display = "5"),
			@ListItem(value = "6", display = "6"),
			@ListItem(value = "7", display = "7"),
			@ListItem(value = "8", display = "8"),
			@ListItem(value = "9", display = "9"),
			@ListItem(value = "10", display = "10"),
			@ListItem(value = "11", display = "11"),
			@ListItem(value = "12", display = "12"),
			@ListItem(value = "13", display = "13"),
			@ListItem(value = "14", display = "14"),
			@ListItem(value = "15", display = "15"),
			@ListItem(value = "16", display = "16"),
			@ListItem(value = "17", display = "17"),
			@ListItem(value = "18", display = "18"),
			@ListItem(value = "19", display = "19"),
			@ListItem(value = "20", display = "20"),
			@ListItem(value = "21", display = "21"),
			@ListItem(value = "22", display = "22"),
			@ListItem(value = "23", display = "23"),
			@ListItem(value = "24", display = "24") }, name = "horaCierreValues")
	@Dropdown(maxListSize = 20, valuesList = "horaCierreValues")
	@DisplayName(name = "HoraCierre")
	@Column(name = "HORA_CIERRE", length = 255)
	private String horaCierre;

	public String getPrimerDia() {
		return primerDia;
	}

	public void setPrimerDia(String primerDia) {
		this.primerDia = primerDia;
	}

	public String getUltimoDia() {
		return ultimoDia;
	}

	public void setUltimoDia(String ultimoDia) {
		this.ultimoDia = ultimoDia;
	}

	public String getHoraApertura() {
		return horaApertura;
	}

	public void setHoraApertura(String horaApertura) {
		this.horaApertura = horaApertura;
	}

	public String getHoraCierre() {
		return horaCierre;
	}

	public void setHoraCierre(String horaCierre) {
		this.horaCierre = horaCierre;
	}

}
