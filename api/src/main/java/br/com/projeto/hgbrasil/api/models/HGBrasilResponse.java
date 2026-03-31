package br.com.projeto.hgbrasil.api.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.time.LocalTime;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "temp",
        "date",
        "city_name",
        "time",
        "forecast"
})
public class HGBrasilResponse {

    @JsonProperty("temp")
    private Integer temp;

    @JsonProperty("date")
    private String date;

    @JsonProperty("city_name")
    private String city_name;

    @JsonProperty("time")
    @JsonFormat(pattern = "HH:mm")
    private LocalTime hora;

    @JsonProperty("forecast")
    private List<Forecast> forecast = null;
}