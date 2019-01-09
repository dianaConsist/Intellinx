package rules;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import com.intellinx.bom.annotations.Description;
import com.intellinx.bom.annotations.DisplayName;
import com.intellinx.bom.annotations.EntityType;
import com.intellinx.bom.annotations.EntityTypeDescriptor;
import com.intellinx.rules.model.RuleConfiguration;
import javax.persistence.Column;


@Entity(name = "WorkingHoursConfigurationInbursa")
@DiscriminatorValue("WorkingHoursConfigurationInbursa")
@DisplayName(name = "Working Hours Configuration Inbursa")
@EntityType(EntityTypeDescriptor.APPLICATIVE)
@Description("Esto es el Working Hours Configuration Inbursa")
public class WorkingHoursConfigurationInbursa extends RuleConfiguration {

	private static final long serialVersionUID = 1L;
	@Description("First Day Inbursa")
	@DisplayName(name = "First Day Inbursa")
	@Column(name = "FIRST_DAY_INBURSA", length = 255)
	private String firstDayInbursa;
	@Description("Last Day Inbursa")
	@DisplayName(name = "Last Day Inbursa")
	@Column(name = "LAST_DAY_INBURSA", length = 255)
	private String lastDayInbursa;
	@Description("Opening Hour Inbursa")
	@DisplayName(name = "Opening Hour Inbursa")
	@Column(name = "OPENING_HOUR_INBURSA", length = 255)
	private String openingHourInbursa;
	@Description("Closing Hour Inbursa")
	@DisplayName(name = "Closing Hour Inbursa")
	@Column(name = "CLOSING_HOUR_INBURSA", length = 255)
	private String closingHourInbursa;

	public String getFirstDayInbursa() {
		return firstDayInbursa;
	}

	public void setFirstDayInbursa(String firstDayInbursa) {
		this.firstDayInbursa = firstDayInbursa;
	}

	public String getLastDayInbursa() {
		return lastDayInbursa;
	}

	public void setLastDayInbursa(String lastDayInbursa) {
		this.lastDayInbursa = lastDayInbursa;
	}

	public String getOpeningHourInbursa() {
		return openingHourInbursa;
	}

	public void setOpeningHourInbursa(String openingHourInbursa) {
		this.openingHourInbursa = openingHourInbursa;
	}

	public String getClosingHourInbursa() {
		return closingHourInbursa;
	}

	public void setClosingHourInbursa(String closingHourInbursa) {
		this.closingHourInbursa = closingHourInbursa;
	}

}
