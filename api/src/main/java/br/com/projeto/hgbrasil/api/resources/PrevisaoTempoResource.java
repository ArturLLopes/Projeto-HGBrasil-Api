package br.com.projeto.hgbrasil.api.resources;

import br.com.projeto.hgbrasil.api.connectors.HGBrasilConnector;
import br.com.projeto.hgbrasil.api.models.PrevisaoTempoResponseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;


@RestController
public class PrevisaoTempoResource {

    @Autowired
    HGBrasilConnector conenctor;



    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE, value = "/")
    public ResponseEntity<PrevisaoTempoResponseModel> test() {

        var retornoApi = conenctor.fetchWeatherForCity("Rio de Janeiro, RJ"); // apenas para o log



        if (retornoApi == null) {
            return ResponseEntity.noContent().build();
        }


        PrevisaoTempoResponseModel ret = PrevisaoTempoResponseModel.builder()
                .city_name(retornoApi.getCity_name())
                .hora(String.valueOf(retornoApi.getHora()))
                .hora(LocalTime.now().toString())
                .temperatura(retornoApi.getTemp())
                .data(retornoApi.getDate())
                .build();

        return ResponseEntity.ok(ret);
    }
}
