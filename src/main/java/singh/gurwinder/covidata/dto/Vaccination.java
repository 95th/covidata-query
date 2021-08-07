package singh.gurwinder.covidata.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Vaccination {
    private Integer id;
    private LocalDate updatedOn;
    private String state;
    private int totalDosesAdministered;
    private int totalSessionsConducted;
    private int totalSites;
    private int firstDoseAdministered;
    private int secondDoseAdministered;
    private int malesVaccinated;
    private int femalesVaccinated;
    private int transgenderVaccinated;
    private int totalCovaxinAdministered;
    private int totalCoviShieldAdministered;
    private int totalSputnikVAdministered;
    private int aefi;
    private int age18To45;
    private int age45To60;
    private int ageOver60;
    private int totalVaccinated;
}
