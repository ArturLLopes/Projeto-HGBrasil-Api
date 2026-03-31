package br.com.projeto.hgbrasil.api.models;

import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "temp",
        "date",
        "time",
        "condition_code",
        "description",
        "currently",
        "woeid",
        "city",
        "img_id",
        "humidity",
        "cloudiness",
        "rain",
        "wind_speedy",
        "wind_direction",
        "wind_cardinal",
        "sunrise",
        "sunset",
        "moon_phase",
        "condition_slug",
        "city_name",
        "timezone",
        "forecast",
        "cref",
        "latitude",
        "longitude"
})
@Generated("jsonschema2pojo")
public class Results {

    @JsonProperty("temp")
    public Integer temp;
    @JsonProperty("date")
    public String date;
    @JsonProperty("time")
    public String time;
    @JsonProperty("condition_code")
    public String conditionCode;
    @JsonProperty("description")
    public String description;
    @JsonProperty("currently")
    public String currently;
    @JsonProperty("woeid")
    public Integer woeid;
    @JsonProperty("city")
    public String city;
    @JsonProperty("img_id")
    public String imgId;
    @JsonProperty("humidity")
    public Integer humidity;
    @JsonProperty("cloudiness")
    public Integer cloudiness;
    @JsonProperty("rain")
    public Integer rain;
    @JsonProperty("wind_speedy")
    public String windSpeedy;
    @JsonProperty("wind_direction")
    public Integer windDirection;
    @JsonProperty("wind_cardinal")
    public String windCardinal;
    @JsonProperty("sunrise")
    public String sunrise;
    @JsonProperty("sunset")
    public String sunset;
    @JsonProperty("moon_phase")
    public String moonPhase;
    @JsonProperty("condition_slug")
    public String conditionSlug;
    @JsonProperty("city_name")
    public String cityName;
    @JsonProperty("timezone")
    public String timezone;
    @JsonProperty("forecast")
    public List<Forecast> forecast;
    @JsonProperty("cref")
    public String cref;
    @JsonProperty("latitude")
    public Double latitude;
    @JsonProperty("longitude")
    public Double longitude;

}