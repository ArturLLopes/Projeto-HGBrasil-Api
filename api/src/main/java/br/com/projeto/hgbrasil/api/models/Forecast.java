package br.com.projeto.hgbrasil.api.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "date",
        "max",
        "min"
})
public class Forecast {

    @JsonProperty("date")
    private String date;

    @JsonProperty("max")
    private Integer max;

    @JsonProperty("min")
    private Integer min;
}