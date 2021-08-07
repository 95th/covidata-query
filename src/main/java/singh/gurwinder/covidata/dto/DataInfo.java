package singh.gurwinder.covidata.dto;

import java.util.List;

import lombok.Data;

@Data
public class DataInfo {
    private List<Cases> cases;
    private List<Testing> testings;
    private List<Vaccination> vaccinations;
}
