package singh.gurwinder.covidata.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Testing {
    private Integer id;
    private LocalDate date;
    private String state;
    private int totalSamples;
    private int negative;
    private int positive;
}
