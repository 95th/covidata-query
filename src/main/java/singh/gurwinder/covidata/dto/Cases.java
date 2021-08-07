package singh.gurwinder.covidata.dto;

import java.time.LocalDate;
import java.time.LocalTime;

import lombok.Data;

@Data
public class Cases {
    private Integer id;
    private LocalDate date;
    private LocalTime time;
    private String state;
    private int confirmedIndian;
    private int confirmedForeign;
    private int cured;
    private int deaths;
    private int confirmed;
}
