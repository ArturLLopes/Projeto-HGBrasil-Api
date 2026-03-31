package br.com.projeto.hgbrasil.api.connectors;

import br.com.projeto.hgbrasil.api.models.HGBrasilResponse;
import lombok.extern.slf4j.XSlf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import org.springframework.web.util.UriComponentsBuilder;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class HGBrasilConenctor {

    private static String SCHEME = "https";
    private static final String HOST = "api.hgbrasil.com";
    private static final String URI = "weather";
    private static final String API_KEY = "21532a77 ";
    private static final String API_FIELDS = "only_results,temp,city_name,forecast,max,min,date";
    private static final int   MAX_ARRAY_RESULTS =   3;

    @Autowired
    private RestTemplate restTemplate;

    public HGBrasilResponse fecthWeatherForCity(String city){

        log.info("Consultando a API da HG Brasil para a cidade {}", city);

        HttpEntity<?> entity = createrHenders();

        var uriComponetsBuildes = createrUriBuilder(city);

        final ResponseEntity<HGBrasilResponse> reponseEntity =
                this.restTemplate.exchange(uriComponetsBuildes.toString(),
                        HttpMethod.GET,
                        entity,
                        HGBrasilResponse.class);


        return null;
    }

    private UriComponentsBuilder  createrUriBuilder(String city) {
        UriComponentsBuilder uriBuilder = UriComponentsBuilder.newInstance();
        uriBuilder.scheme(SCHEME).host(HOST).path(URI);
        uriBuilder.queryParam("key", API_KEY);
        uriBuilder.queryParam("array_limit", MAX_ARRAY_RESULTS);
        uriBuilder.queryParam("fields", API_FIELDS);
        uriBuilder.queryParam("city", city);
        return uriBuilder;
    }

    private HttpEntity<?> createrHenders() {
        HttpHeaders headers = new HttpHeaders();
        headers.set(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);
        return new HttpEntity<>(headers);
    }
}
