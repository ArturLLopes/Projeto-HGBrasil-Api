package br.com.projeto.hgbrasil.api.models;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "date",
        "full_date",
        "weekday",
        "max",
        "min",
        "humidity",
        "cloudiness",
        "rain",
        "rain_probability",
        "wind_speedy",
        "sunrise",
        "sunset",
        "moon_phase",
        "description",
        "condition"
})
@Generated("jsonschema2pojo")
public class Forecast {

    @JsonProperty("date")
    public String date;
    @JsonProperty("full_date")
    public String fullDate;
    @JsonProperty("weekday")
    public String weekday;
    @JsonProperty("max")
    public Integer max;
    @JsonProperty("min")
    public Integer min;
    @JsonProperty("humidity")
    public Integer humidity;
    @JsonProperty("cloudiness")
    public Integer cloudiness;
    @JsonProperty("rain")
    public Double rain;
    @JsonProperty("rain_probability")
    public Integer rainProbability;
    @JsonProperty("wind_speedy")
    public String windSpeedy;
    @JsonProperty("sunrise")
    public String sunrise;
    @JsonProperty("sunset")
    public String sunset;
    @JsonProperty("moon_phase")
    public String moonPhase;
    @JsonProperty("description")
    public String description;
    @JsonProperty("condition")
    public String condition;

}