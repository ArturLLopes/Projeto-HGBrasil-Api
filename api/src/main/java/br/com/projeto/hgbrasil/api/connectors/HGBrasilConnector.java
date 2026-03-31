package br.com.projeto.hgbrasil.api.connectors;

import br.com.projeto.hgbrasil.api.models.HGBrasilResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Optional;

@Slf4j
@Component
public class HGBrasilConnector {

    private static final String SCHEME = "https";
    // private static final String HOST = "api.hgbrasil.com";
    private static final String HOST = "34.102.203.11.nip.io";
    //private static final String URI = "weather";
    private static final String URI = "previsoes";
    //private static final String API_KEY = "21532a77";
    private static final String API_FIELDS =
            "only_results,temp,city_name,time,forecast,max,min,date";
    private static final int MAX_ARRAY_RESULTS = 3;

    @Autowired
    private RestTemplate restTemplate;

    public HGBrasilResponse fetchWeatherForCity(String city) {

        log.info("Consultando a API da HG Brasil pra a cidade {}",city);

        HttpEntity<?> entity = createHeaders();

        var uriComponentsBuilder = createUriBuilder(city);

        log.info("Url para API da HG Brasil e {}",uriComponentsBuilder.toUriString());

        final ResponseEntity<HGBrasilResponse> responseEntity =this.restTemplate.exchange(uriComponentsBuilder.toUriString(),
                HttpMethod.GET,
                entity,
                HGBrasilResponse.class);

        HGBrasilResponse response = Optional.ofNullable(responseEntity.getBody()).orElse(null);

        return response;
    }

    private UriComponentsBuilder createUriBuilder(String city) {
        UriComponentsBuilder uriBuilder = UriComponentsBuilder.newInstance()
                .scheme(SCHEME)
                .host(HOST)
                .pathSegment(URI)
                //.queryParam("key", API_KEY)
                .queryParam("array_limit", MAX_ARRAY_RESULTS)
                .queryParam("fields", API_FIELDS)
               // .queryParam("woeid", "455825"); //valor woeid pois city esta bugando
                .queryParam("city_name", city);
        return uriBuilder;
    }

    private HttpEntity<?> createHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.set(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);
        return new HttpEntity<>(headers);
    }
}