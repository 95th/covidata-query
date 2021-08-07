package singh.gurwinder.covidata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import singh.gurwinder.covidata.dto.DataInfo;

@Service
public class DataService {
    private final RestTemplate restTemplate = new RestTemplate();

    @Value("${covidata.url}")
    private String baseUrl;

    public DataInfo getByDate(String date) {
        var builder = UriComponentsBuilder.fromUriString(baseUrl)
                                          .path("Get_date_info")
                                          .queryParam("date", date);
        return restTemplate.getForObject(builder.toUriString(), DataInfo.class);
    }

    public DataInfo getByState(String state) {
        var builder = UriComponentsBuilder.fromUriString(baseUrl)
                                          .path("Get_state_info")
                                          .queryParam("State_name", state);
        return restTemplate.getForObject(builder.toUriString(), DataInfo.class);

    }

    public DataInfo getByStateAndDate(String state, String date) {
        var builder = UriComponentsBuilder.fromUriString(baseUrl)
                                          .path("Pinpoint_state")
                                          .queryParam("date", date)
                                          .queryParam("State_name", state);
        return restTemplate.getForObject(builder.toUriString(), DataInfo.class);

    }

    public DataInfo getByStatesAndDate(List<String> states, String date) {
        var builder = UriComponentsBuilder.fromUriString(baseUrl)
                                          .path("Pinpoint_info")
                                          .queryParam("date", date)
                                          .queryParam("State_name", states);
        return restTemplate.getForObject(builder.toUriString(), DataInfo.class);

    }
}
